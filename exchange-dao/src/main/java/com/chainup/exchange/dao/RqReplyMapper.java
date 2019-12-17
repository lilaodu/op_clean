package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.RqReply;
import com.chainup.common.exchange.entity.RqReplyExample;

public interface RqReplyMapper extends SqlMapper{
    int countByExample(RqReplyExample example);

    int deleteByExample(RqReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RqReply record);

    int insertSelective(RqReply record);

    List<RqReply> selectByExample(RqReplyExample example);

    RqReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RqReply record, @Param("example") RqReplyExample example);

    int updateByExample(@Param("record") RqReply record, @Param("example") RqReplyExample example);

    int updateByPrimaryKeySelective(RqReply record);

    int updateByPrimaryKey(RqReply record);
}