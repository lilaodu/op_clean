package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.OrderidBilian;
import com.chainup.common.exchange.entity.OrderidBilianExample;

public interface OrderidBilianMapper extends SqlMapper{
    long countByExample(OrderidBilianExample example);

    int deleteByExample(OrderidBilianExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderidBilian record);

    int insertSelective(OrderidBilian record);

    List<OrderidBilian> selectByExample(OrderidBilianExample example);

    OrderidBilian selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderidBilian record, @Param("example") OrderidBilianExample example);

    int updateByExample(@Param("record") OrderidBilian record, @Param("example") OrderidBilianExample example);

    int updateByPrimaryKeySelective(OrderidBilian record);

    int updateByPrimaryKey(OrderidBilian record);
}