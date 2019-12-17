package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.OpenApiToken;
import com.chainup.common.exchange.entity.OpenApiTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenApiTokenMapper extends SqlMapper{
    int countByExample(OpenApiTokenExample example);

    int deleteByExample(OpenApiTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenApiToken record);

    int insertSelective(OpenApiToken record);

    OpenApiToken selectOnlyOneByExample(OpenApiTokenExample example);

    List<OpenApiToken> selectByExample(OpenApiTokenExample example);

    OpenApiToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenApiToken record, @Param("example") OpenApiTokenExample example);

    int updateByExample(@Param("record") OpenApiToken record, @Param("example") OpenApiTokenExample example);

    int updateByPrimaryKeySelective(OpenApiToken record);

    int updateByPrimaryKey(OpenApiToken record);
}