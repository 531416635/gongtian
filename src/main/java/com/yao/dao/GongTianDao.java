package com.yao.dao;

import java.util.List;
import java.util.Map;

import com.yao.model.GongTianModel;

public interface GongTianDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GongTianModel record);

    int insertSelective(GongTianModel record);

    GongTianModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongTianModel record);

    int updateByPrimaryKey(GongTianModel record);
    
    int selectCountByExample(GongTianModel record);
    
    List<GongTianModel> selectByExample(Map<String, Object> map);

}