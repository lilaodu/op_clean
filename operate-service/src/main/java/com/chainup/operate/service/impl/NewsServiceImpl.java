package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.NewsMapper;
import com.chainup.common.exchange.entity.News;
import com.chainup.common.exchange.entity.NewsExample;
import com.chainup.operate.service.NewsService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public int insert(News record) {
		ReflectionUtils.escapeSql(record);
		return newsMapper.insert(record);
	}

	@Override
	public int countByExample(NewsExample example) {
		return newsMapper.countByExample(example);
	}

	@Override
	public List<News> selectByExample(NewsExample example) {
		List<News> list = newsMapper.selectByExample(example);
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(News record) {
		ReflectionUtils.escapeSql(record);
		return newsMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return newsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public News selectByPrimaryKey(Integer id) {
		return newsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteByExample(NewsExample example) {
		return newsMapper.deleteByExample(example);
	}

}
