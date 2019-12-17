package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ArticleLanguage;
import com.chainup.common.exchange.entity.ArticleLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleLanguageMapper extends SqlMapper {
    int countByExample(ArticleLanguageExample example);

    int deleteByExample(ArticleLanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleLanguage record);

    int insertSelective(ArticleLanguage record);

    ArticleLanguage selectOnlyOneByExample(ArticleLanguageExample example);

    List<ArticleLanguage> selectByExample(ArticleLanguageExample example);

    ArticleLanguage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleLanguage record, @Param("example") ArticleLanguageExample example);

    int updateByExample(@Param("record") ArticleLanguage record, @Param("example") ArticleLanguageExample example);

    int updateByPrimaryKeySelective(ArticleLanguage record);

    int updateByPrimaryKey(ArticleLanguage record);
}