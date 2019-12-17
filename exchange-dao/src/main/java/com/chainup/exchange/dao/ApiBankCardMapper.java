package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ApiBankCard;
import com.chainup.common.exchange.entity.ApiBankCardExample;

public interface ApiBankCardMapper extends SqlMapper{
    long countByExample(ApiBankCardExample example);

    int deleteByExample(ApiBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApiBankCard record);

    int insertSelective(ApiBankCard record);

    List<ApiBankCard> selectByExample(ApiBankCardExample example);

    ApiBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApiBankCard record, @Param("example") ApiBankCardExample example);

    int updateByExample(@Param("record") ApiBankCard record, @Param("example") ApiBankCardExample example);

    int updateByPrimaryKeySelective(ApiBankCard record);

    int updateByPrimaryKey(ApiBankCard record);
}