package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.IecProjectUser;
import com.chainup.common.exchange.entity.IecProjectUserExample;
import com.chainup.common.exchange.entity.IecProjectUserWithBLOBs;

public interface IecProjectUserMapper extends SqlMapper{
    long countByExample(IecProjectUserExample example);

    int deleteByExample(IecProjectUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IecProjectUserWithBLOBs record);

    int insertSelective(IecProjectUserWithBLOBs record);

    List<IecProjectUserWithBLOBs> selectByExampleWithBLOBs(IecProjectUserExample example);

    List<IecProjectUser> selectByExample(IecProjectUserExample example);

    IecProjectUserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IecProjectUserWithBLOBs record, @Param("example") IecProjectUserExample example);

    int updateByExampleWithBLOBs(@Param("record") IecProjectUserWithBLOBs record, @Param("example") IecProjectUserExample example);

    int updateByExample(@Param("record") IecProjectUser record, @Param("example") IecProjectUserExample example);

    int updateByPrimaryKeySelective(IecProjectUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IecProjectUserWithBLOBs record);

    int updateByPrimaryKey(IecProjectUser record);
    
    List<IecProjectUser> selectByStatusAndUserInfo(@Param("iecProjectId") Integer iecProjectId,@Param("status") Byte status);
}