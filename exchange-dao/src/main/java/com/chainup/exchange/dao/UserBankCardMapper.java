package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.UserBankCard;
import com.chainup.common.exchange.entity.UserBankCardExample;

public interface UserBankCardMapper  extends SqlMapper {
    int countByExample(UserBankCardExample example);

    int deleteByExample(UserBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBankCard record);

    int insertSelective(UserBankCard record);

    UserBankCard selectOnlyOneByExample(UserBankCardExample example);

    List<UserBankCard> selectByExample(UserBankCardExample example);

    UserBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByExample(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByPrimaryKeySelective(UserBankCard record);

    int updateByPrimaryKey(UserBankCard record);
}