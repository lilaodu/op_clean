package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.OpenApiTransaction;
import com.chainup.common.exchange.entity.OpenApiTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenApiTransactionMapper extends SqlMapper{
    int countByExample(OpenApiTransactionExample example);

    int deleteByExample(OpenApiTransactionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenApiTransaction record);

    int insertSelective(OpenApiTransaction record);

    OpenApiTransaction selectOnlyOneByExample(OpenApiTransactionExample example);

    List<OpenApiTransaction> selectByExample(OpenApiTransactionExample example);

    OpenApiTransaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenApiTransaction record, @Param("example") OpenApiTransactionExample example);

    int updateByExample(@Param("record") OpenApiTransaction record, @Param("example") OpenApiTransactionExample example);

    int updateByPrimaryKeySelective(OpenApiTransaction record);

    int updateByPrimaryKey(OpenApiTransaction record);
}