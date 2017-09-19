package com.yao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yao.dao.GongTianDao;
import com.yao.model.GongTianModel;
import com.yao.service.GongTianService;

@Service
public class GongTianServiceImpl implements GongTianService {

	@Autowired
	GongTianDao dao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(GongTianModel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(GongTianModel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GongTianModel selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(GongTianModel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(GongTianModel record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
