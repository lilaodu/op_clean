package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.TransactionWithdraw;
import com.chainup.common.exchange.entity.TransactionWithdrawExample;

public interface TransactionWithdrawMapper extends SqlMapper {
    int countByExample(TransactionWithdrawExample example);

    int deleteByExample(TransactionWithdrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionWithdraw record);

    int insertSelective(TransactionWithdraw record);

    TransactionWithdraw selectOnlyOneByExample(TransactionWithdrawExample example);

    List<TransactionWithdraw> selectByExample(TransactionWithdrawExample example);

    TransactionWithdraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionWithdraw record, @Param("example") TransactionWithdrawExample example);

    int updateByExample(@Param("record") TransactionWithdraw record, @Param("example") TransactionWithdrawExample example);

    int updateByPrimaryKeySelective(TransactionWithdraw record);

    int updateByPrimaryKey(TransactionWithdraw record);
    int selectWithdrawStatisticsCount(TransactionWithdrawExample example);
    
    List<Map<String,Object>> selectWithdrawStatistics(TransactionWithdrawExample example);
}