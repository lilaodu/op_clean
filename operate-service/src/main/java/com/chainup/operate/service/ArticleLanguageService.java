package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.ArticleLanguage;
import com.chainup.common.exchange.entity.ArticleLanguageExample;

public interface ArticleLanguageService {
	
	List<ArticleLanguage> selectByExample(ArticleLanguageExample example);

    ArticleLanguage selectByPrimaryKey(Integer id);

}
