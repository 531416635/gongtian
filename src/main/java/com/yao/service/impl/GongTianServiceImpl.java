package com.yao.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.yao.dao.GongTianDao;
import com.yao.model.GongTianModel;
import com.yao.model.PageBean;
import com.yao.service.GongTianService;
import com.yao.util.ConfUtil;

@Service
public class GongTianServiceImpl implements GongTianService {

	private static final Logger logger = LoggerFactory.getLogger(GongTianServiceImpl.class);
	@Autowired
	GongTianDao dao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(GongTianModel record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(GongTianModel record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public GongTianModel selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(GongTianModel record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GongTianModel record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}


	@Override
	public List<GongTianModel> selectByExample(GongTianModel model,PageBean pageBean) {
		PageBean pageBean1 = new PageBean(pageBean.getCurrentPage(), 
				ConfUtil.getPageSize(), dao.selectCountByExample(model));
		logger.info("分页参数打印==={}",JSONObject.toJSONString(pageBean1));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("model", model);
		map.put("pageBean", pageBean1);
		return dao.selectByExample(map);
	}

}
