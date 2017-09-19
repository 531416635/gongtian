package com.yao.service;

import com.yao.model.GongTianModel;

public interface GongTianService {
	int deleteByPrimaryKey(Integer id);

    int insert(GongTianModel record);

    int insertSelective(GongTianModel record);

    GongTianModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongTianModel record);

    int updateByPrimaryKey(GongTianModel record);
}
