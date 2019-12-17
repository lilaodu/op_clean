package com.chainup.exchange.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.stats.entity.TransactionWithdrawCryptoDMO;
import com.chainup.common.stats.entity.TransactionWithdrawCryptoDMOExample;

public interface TransactionWithdrawCryptoDMOMapper extends SqlMapper{
    int countByExample(TransactionWithdrawCryptoDMOExample example);

    int deleteByExample(TransactionWithdrawCryptoDMOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionWithdrawCryptoDMO record);

    int insertSelective(TransactionWithdrawCryptoDMO record);

    List<TransactionWithdrawCryptoDMO> selectByExample(TransactionWithdrawCryptoDMOExample example);

    TransactionWithdrawCryptoDMO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionWithdrawCryptoDMO record, @Param("example") TransactionWithdrawCryptoDMOExample example);

    int updateByExample(@Param("record") TransactionWithdrawCryptoDMO record, @Param("example") TransactionWithdrawCryptoDMOExample example);

    int updateByPrimaryKeySelective(TransactionWithdrawCryptoDMO record);

    int updateByPrimaryKey(TransactionWithdrawCryptoDMO record);
}