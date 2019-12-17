package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.UserExt;
import com.chainup.common.exchange.entity.UserExtExample;

public interface UserExtMapper extends SqlMapper{
    int countByExample(UserExtExample example);

    int deleteByExample(UserExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserExt record);

    int insertSelective(UserExt record);

    UserExt selectOnlyOneByExample(UserExtExample example);

    List<UserExt> selectByExample(UserExtExample example);

    UserExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserExt record, @Param("example") UserExtExample example);

    int updateByExample(@Param("record") UserExt record, @Param("example") UserExtExample example);

    int updateByPrimaryKeySelective(UserExt record);

    int updateByPrimaryKey(UserExt record);
}