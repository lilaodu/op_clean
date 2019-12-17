package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.RqImage;
import com.chainup.common.exchange.entity.RqImageExample;

public interface RqImageMapper extends SqlMapper{
    int countByExample(RqImageExample example);

    int deleteByExample(RqImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RqImage record);

    int insertSelective(RqImage record);

    List<RqImage> selectByExampleWithBLOBs(RqImageExample example);

    List<RqImage> selectByExample(RqImageExample example);

    RqImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RqImage record, @Param("example") RqImageExample example);

    int updateByExampleWithBLOBs(@Param("record") RqImage record, @Param("example") RqImageExample example);

    int updateByExample(@Param("record") RqImage record, @Param("example") RqImageExample example);

    int updateByPrimaryKeySelective(RqImage record);

    int updateByPrimaryKeyWithBLOBs(RqImage record);

    int updateByPrimaryKey(RqImage record);
}