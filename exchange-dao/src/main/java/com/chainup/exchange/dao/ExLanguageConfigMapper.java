package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExLanguageConfig;
import com.chainup.common.exchange.entity.ExLanguageConfigExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExLanguageConfigMapper extends SqlMapper {
    int countByExample(ExLanguageConfigExample example);

    int deleteByExample(ExLanguageConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExLanguageConfig record);

    int insertSelective(ExLanguageConfig record);

    ExLanguageConfig selectOnlyOneByExample(ExLanguageConfigExample example);

    List<ExLanguageConfig> selectByExample(ExLanguageConfigExample example);

    ExLanguageConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExLanguageConfig record, @Param("example") ExLanguageConfigExample example);

    int updateByExample(@Param("record") ExLanguageConfig record, @Param("example") ExLanguageConfigExample example);

    int updateByPrimaryKeySelective(ExLanguageConfig record);

    int updateByPrimaryKey(ExLanguageConfig record);
}