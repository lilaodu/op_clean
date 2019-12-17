package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.stats.entity.TransactionDepositCryptoDMO;
import com.chainup.common.stats.entity.TransactionDepositCryptoDMOExample;

public interface TransactionDepositCryptoDMOMapper extends SqlMapper{
    int countByExample(TransactionDepositCryptoDMOExample example);

    int deleteByExample(TransactionDepositCryptoDMOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionDepositCryptoDMO record);

    int insertSelective(TransactionDepositCryptoDMO record);

    List<TransactionDepositCryptoDMO> selectByExample(TransactionDepositCryptoDMOExample example);

    TransactionDepositCryptoDMO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionDepositCryptoDMO record, @Param("example") TransactionDepositCryptoDMOExample example);

    int updateByExample(@Param("record") TransactionDepositCryptoDMO record, @Param("example") TransactionDepositCryptoDMOExample example);

    int updateByPrimaryKeySelective(TransactionDepositCryptoDMO record);

    int updateByPrimaryKey(TransactionDepositCryptoDMO record);
}