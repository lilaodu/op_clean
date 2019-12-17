package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AuthRealname;
import com.chainup.common.exchange.entity.AuthRealnameExample;

public interface AuthRealnameMapper extends SqlMapper{
    int countByExample(AuthRealnameExample example);

    int deleteByExample(AuthRealnameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthRealname record);

    int insertSelective(AuthRealname record);

    AuthRealname selectOnlyOneByExample(AuthRealnameExample example);

    List<AuthRealname> selectByExample(AuthRealnameExample example);

    AuthRealname selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthRealname record, @Param("example") AuthRealnameExample example);

    int updateByExample(@Param("record") AuthRealname record, @Param("example") AuthRealnameExample example);

    int updateByPrimaryKeySelective(AuthRealname record);

    int updateByPrimaryKey(AuthRealname record);
}