package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.News;
import com.chainup.common.exchange.entity.NewsExample;

public interface NewsService {
	
	int insert(News record);
	
	int countByExample(NewsExample example);
	
	List<News> selectByExample(NewsExample example);
	
	int updateByPrimaryKeyWithBLOBs(News record);
	
	int deleteByPrimaryKey(Integer id);
	
	News selectByPrimaryKey(Integer id);
	
	int deleteByExample(NewsExample example);

}
