package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBank;
import com.chainup.common.exchange.entity.CoinBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinBankMapper extends SqlMapper{
    long countByExample(CoinBankExample example);

    int deleteByExample(CoinBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBank record);

    int insertSelective(CoinBank record);

    List<CoinBank> selectByExampleWithBLOBs(CoinBankExample example);

    List<CoinBank> selectByExample(CoinBankExample example);

    CoinBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBank record, @Param("example") CoinBankExample example);

    int updateByExampleWithBLOBs(@Param("record") CoinBank record, @Param("example") CoinBankExample example);

    int updateByExample(@Param("record") CoinBank record, @Param("example") CoinBankExample example);

    int updateByPrimaryKeySelective(CoinBank record);

    int updateByPrimaryKeyWithBLOBs(CoinBank record);

    int updateByPrimaryKey(CoinBank record);
}