package com.yao.dao;

import com.yao.model.GongTianModel;

public interface GongTianDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GongTianModel record);

    int insertSelective(GongTianModel record);

    GongTianModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongTianModel record);

    int updateByPrimaryKey(GongTianModel record);
}