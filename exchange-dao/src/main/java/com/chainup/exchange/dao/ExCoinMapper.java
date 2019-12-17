package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExCoin;
import com.chainup.common.exchange.entity.ExCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExCoinMapper  extends SqlMapper{
    long countByExample(ExCoinExample example);

    int deleteByExample(ExCoinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExCoin record);

    int insertSelective(ExCoin record);

    List<ExCoin> selectByExample(ExCoinExample example);

    ExCoin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExCoin record, @Param("example") ExCoinExample example);

    int updateByExample(@Param("record") ExCoin record, @Param("example") ExCoinExample example);

    int updateByPrimaryKeySelective(ExCoin record);

    int updateByPrimaryKey(ExCoin record);
}