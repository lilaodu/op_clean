package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.Token;
import com.chainup.common.exchange.entity.TokenExample;

public interface TokenMapper extends SqlMapper {
    int countByExample(TokenExample example);

    int deleteByExample(TokenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectOnlyOneByExample(TokenExample example);

    List<Token> selectByExample(TokenExample example);

    Token selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByExample(@Param("record") Token record, @Param("example") TokenExample example);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}