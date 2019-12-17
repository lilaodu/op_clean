package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankLevelOrder;
import com.chainup.common.exchange.entity.CoinBankLevelOrderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CoinBankLevelOrderMapper extends SqlMapper{
    long countByExample(CoinBankLevelOrderExample example);

    int deleteByExample(CoinBankLevelOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankLevelOrder record);

    int insertSelective(CoinBankLevelOrder record);

    List<CoinBankLevelOrder> selectByExample(CoinBankLevelOrderExample example);

    CoinBankLevelOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankLevelOrder record, @Param("example") CoinBankLevelOrderExample example);

    int updateByExample(@Param("record") CoinBankLevelOrder record, @Param("example") CoinBankLevelOrderExample example);

    int updateByPrimaryKeySelective(CoinBankLevelOrder record);

    int updateByPrimaryKey(CoinBankLevelOrder record);

	 List<CoinBankLevelOrder> selectListByCoinbank(Map<String, Object> map);

	long selectCountByCoinbank(Map<String, Object> map);
}