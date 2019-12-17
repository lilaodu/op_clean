package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CmsArticleType;
import com.chainup.common.exchange.entity.CmsArticleTypeExample;

public interface CmsArticleTypeMapper extends SqlMapper {
    int countByExample(CmsArticleTypeExample example);

    int deleteByExample(CmsArticleTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsArticleType record);

    int insertSelective(CmsArticleType record);

    CmsArticleType selectOnlyOneByExample(CmsArticleTypeExample example);

    List<CmsArticleType> selectByExample(CmsArticleTypeExample example);

    CmsArticleType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsArticleType record, @Param("example") CmsArticleTypeExample example);

    int updateByExample(@Param("record") CmsArticleType record, @Param("example") CmsArticleTypeExample example);

    int updateByPrimaryKeySelective(CmsArticleType record);

    int updateByPrimaryKey(CmsArticleType record);
}