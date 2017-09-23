package com.yao.service;

import java.util.List;

import com.yao.model.GongTianModel;
import com.yao.model.PageBean;

public interface GongTianService {
	int deleteByPrimaryKey(Integer id);

    int insert(GongTianModel record);

    int insertSelective(GongTianModel record);

    GongTianModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GongTianModel record);

    int updateByPrimaryKey(GongTianModel record);
    
    List<GongTianModel> selectByExample(GongTianModel model,PageBean pageBean);
}
