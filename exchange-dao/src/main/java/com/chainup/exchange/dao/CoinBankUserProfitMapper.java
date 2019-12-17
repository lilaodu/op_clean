package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankUserProfit;
import com.chainup.common.exchange.entity.CoinBankUserProfitExample;

public interface CoinBankUserProfitMapper extends SqlMapper{
    long countByExample(CoinBankUserProfitExample example);

    int deleteByExample(CoinBankUserProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankUserProfit record);

    int insertSelective(CoinBankUserProfit record);

    List<CoinBankUserProfit> selectByExample(CoinBankUserProfitExample example);

    CoinBankUserProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankUserProfit record, @Param("example") CoinBankUserProfitExample example);

    int updateByExample(@Param("record") CoinBankUserProfit record, @Param("example") CoinBankUserProfitExample example);

    int updateByPrimaryKeySelective(CoinBankUserProfit record);

    int updateByPrimaryKey(CoinBankUserProfit record);

	List<CoinBankUserProfit> selectBysubUsers(Map<String, Object> map);

	long selectCountBysubUsers(Map<String, Object> map);
}