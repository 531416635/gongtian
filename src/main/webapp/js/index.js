//项目访问真实路径
window.location.proIp = "http://localhost/gongtian/";
//定义本地缓存变量
var localStorage = window.localStorage;
var sessionStorage = window.sessionStorage;
$(function() {
	$('.form_date,.form_date1').datetimepicker({
		language : 'zh-CN',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		minView : 2,
		forceParse : 0,
		zIndex : 1080
	});
	
	
	
	$.ajax({
		url : window.location.proIp+'getList.do',
		type : 'POST', 
		data : {},
		dataType : 'json',
		success : function(result){
			var strHtml = "";
			$.each(result, function(index, obj) {
				strHtml += "<tr>"
					+"<td>"+formatDate(obj.riqi,"yyyy/MM/dd")+"</td>"
		        +"<td>"+obj.xqmc+"</td>"
		        +"<td>"+obj.lh+"</td>"
		        +"<td>"+obj.zxgs+"</td>"
		        +"<td>"+obj.lxr+"</td>"
		        +"<td>"+obj.phone+"</td>"
		        +"<td>"+obj.yc+"</td>"
		        +"<td>"+obj.sl+"</td>"
		        +"<td>"+formatMoney(obj.jg)+"</td>"
		        +"<td>"+obj.bz+"</td>"
		        +"<td>"+obj.sfyf+"</td>"
		        +"<td>"+formatDate(obj.tjsj,"yyyy/MM/dd")+"</td></tr>";
			});
			
			$("tbody").html(strHtml);
		}
	})
})

/**
 * 添加工天信息
 */
function insetModel() {
	if(sessionStorage.clickIndex == "0" || sessionStorage.clickIndex == null){
		sessionStorage.clickIndex == "1";
		$.ajax({
			url : window.location.proIp+'insertModel.do',
			type : 'POST', 
			data : {
				riqi:new Date($("#dtp_input2").val()),
				xqmc:$("#xqmc").val(),
				lh:$("#lh").val(),
				zxgs:$("#zxgs").val(),
				lxr:$("#lxr").val(),
				phone:$("#phone").val(),
				yc:$("#yc").val(),
				sl:$("#sl").val(),
				jg:$("#jg").val(),
				bz:$("#bz").val(),
				sfyf:$("input[name=inlineRadio]").val()
			},
			dataType : 'json',
			success : function(result){
				if(result =="1"){
					$("#dismiss_model").click();
					sessionStorage.clickIndex == "0";
				}
			}
		})
	}else{
		alert("你已经点击过了，请稍后再试！");
	}
}


/**
 * 获取首页信息
 */
function selectMore() {
	$.ajax({
		url : window.location.proIp+'getList.do',
		type : 'POST', 
		data : {
			riqi:new Date($("#dtp_input2").val()),
			xqmc:$("#xqmc").val(),
			lh:$("#lh").val(),
			zxgs:$("#zxgs").val(),
			lxr:$("#lxr").val(),
			phone:$("#phone").val(),
			yc:$("#yc").val(),
			sl:$("#sl").val(),
			jg:$("#jg").val(),
			bz:$("#bz").val(),
			sfyf:$("input[name=inlineRadio]").val()
		},
		dataType : 'json',
		success : function(result){
			if(result =="1"){
				$("#dismiss_model").click();
				sessionStorage.clickIndex == "0";
			}
		}
	})
}