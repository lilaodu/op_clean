package com.chainup.exchange.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankProfitLevel;
import com.chainup.common.exchange.entity.CoinBankProfitLevelExample;

public interface CoinBankProfitLevelMapper extends SqlMapper{
    long countByExample(CoinBankProfitLevelExample example);

    int deleteByExample(CoinBankProfitLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankProfitLevel record);

    int insertSelective(CoinBankProfitLevel record);

    List<CoinBankProfitLevel> selectByExample(CoinBankProfitLevelExample example);

    CoinBankProfitLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankProfitLevel record, @Param("example") CoinBankProfitLevelExample example);

    int updateByExample(@Param("record") CoinBankProfitLevel record, @Param("example") CoinBankProfitLevelExample example);

    int updateByPrimaryKeySelective(CoinBankProfitLevel record);

    int updateByPrimaryKey(CoinBankProfitLevel record);

    Integer selectMaxLevelByComputeAmount(BigDecimal amountSum);

    Integer selectMaxLevelByRegisterAmount(Integer amountSum);
}