package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExFee;
import com.chainup.common.exchange.entity.ExFeeExample;

public interface ExFeeMapper extends SqlMapper{
    int countByExample(ExFeeExample example);

    int deleteByExample(ExFeeExample example);

    int insert(ExFee record);

    int insertSelective(ExFee record);

    ExFee selectOnlyOneByExample(ExFeeExample example);

    List<ExFee> selectByExample(ExFeeExample example);

    int updateByExampleSelective(@Param("record") ExFee record, @Param("example") ExFeeExample example);

    int updateByExample(@Param("record") ExFee record, @Param("example") ExFeeExample example);
}