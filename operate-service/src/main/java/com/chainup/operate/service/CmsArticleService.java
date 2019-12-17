package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CmsArticle;
import com.chainup.common.exchange.entity.CmsArticleExample;

public interface CmsArticleService {
	
	int insert(CmsArticle record);
	
	int updateByPrimaryKeyWithBLOBs(CmsArticle record);
	
	int countByExample(CmsArticleExample example);
	
	List<CmsArticle> selectByExampleWithBLOBs(CmsArticleExample example);
	
	int deleteByExample(CmsArticleExample example);

    int deleteByPrimaryKey(Integer id);
    
    CmsArticle selectByPrimaryKey(Integer id);
    
    CmsArticle selectOnlyOneByExample(CmsArticleExample example);
    
    int updateByPrimaryKeySelective(CmsArticle record);

}
