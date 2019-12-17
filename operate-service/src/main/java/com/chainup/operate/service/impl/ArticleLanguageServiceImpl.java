package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.ArticleLanguageMapper;
import com.chainup.common.exchange.entity.ArticleLanguage;
import com.chainup.common.exchange.entity.ArticleLanguageExample;
import com.chainup.operate.service.ArticleLanguageService;

@Service
public class ArticleLanguageServiceImpl implements ArticleLanguageService {
	
	@Autowired
	private ArticleLanguageMapper articleLanguageMapper;

	@Override
	public List<ArticleLanguage> selectByExample(ArticleLanguageExample example) {
		return articleLanguageMapper.selectByExample(example);
	}

	@Override
	public ArticleLanguage selectByPrimaryKey(Integer id) {
		return articleLanguageMapper.selectByPrimaryKey(id);
	}

}
