package com.yao.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yao.model.GongTianModel;
import com.yao.model.PageBean;
import com.yao.service.GongTianService;

@Controller
public class GongController {

	@Autowired
	GongTianService service;
	
	@RequestMapping(value="/getList.do")
	@ResponseBody
	public List<GongTianModel> getList(GongTianModel model,PageBean pageBean){
		pageBean.setCurrentPage(1);
		return service.selectByExample(model,pageBean);
	}
	
	@RequestMapping(value="/getListMore.do")
	@ResponseBody
	public List<GongTianModel> getListMore(GongTianModel model,PageBean pageBean){
		return service.selectByExample(model,pageBean);
	}
	
	@RequestMapping(value="/insertModel.do")
	@ResponseBody
	public int insertModel(GongTianModel model){
		model.setTjsj(new Date());
		return service.insertSelective(model);
	}
}
