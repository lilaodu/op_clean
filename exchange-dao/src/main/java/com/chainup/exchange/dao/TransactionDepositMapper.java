package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.TransactionDeposit;
import com.chainup.common.exchange.entity.TransactionDepositExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TransactionDepositMapper extends SqlMapper {
    int countByExample(TransactionDepositExample example);

    int deleteByExample(TransactionDepositExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionDeposit record);

    int insertSelective(TransactionDeposit record);

    TransactionDeposit selectOnlyOneByExample(TransactionDepositExample example);

    List<TransactionDeposit> selectByExample(TransactionDepositExample example);

    TransactionDeposit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionDeposit record, @Param("example") TransactionDepositExample example);

    int updateByExample(@Param("record") TransactionDeposit record, @Param("example") TransactionDepositExample example);

    int updateByPrimaryKeySelective(TransactionDeposit record);

    int updateByPrimaryKey(TransactionDeposit record);
    int selectDeposetStatisticsCount(TransactionDepositExample example);
    List<Map<String,Object>> selectDeposetStatistics(TransactionDepositExample example);
    Integer selectMaxDepositUid(TransactionDepositExample example);
}