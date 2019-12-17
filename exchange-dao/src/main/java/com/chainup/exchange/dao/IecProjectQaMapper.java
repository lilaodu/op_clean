package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.IecProjectQa;
import com.chainup.common.exchange.entity.IecProjectQaExample;

public interface IecProjectQaMapper extends SqlMapper{
    long countByExample(IecProjectQaExample example);

    int deleteByExample(IecProjectQaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IecProjectQa record);

    int insertSelective(IecProjectQa record);

    List<IecProjectQa> selectByExample(IecProjectQaExample example);

    IecProjectQa selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IecProjectQa record, @Param("example") IecProjectQaExample example);

    int updateByExample(@Param("record") IecProjectQa record, @Param("example") IecProjectQaExample example);

    int updateByPrimaryKeySelective(IecProjectQa record);

    int updateByPrimaryKey(IecProjectQa record);
}