package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CmsArticleType;
import com.chainup.common.exchange.entity.CmsArticleTypeExample;

public interface CmsArticleTypeService {
	
	int countByExample(CmsArticleTypeExample example);

    int deleteByExample(CmsArticleTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsArticleType record);

    CmsArticleType selectOnlyOneByExample(CmsArticleTypeExample example);

    List<CmsArticleType> selectByExample(CmsArticleTypeExample example);

    CmsArticleType selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(CmsArticleType record);
    
    int updateByPrimaryKeySelective(CmsArticleType record);
    
    List<CmsArticleType> selectLeafType(Integer parentId,Integer lang);

}
