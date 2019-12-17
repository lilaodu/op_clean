package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.RedPacket;
import com.chainup.common.exchange.entity.RedPacketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedPacketMapper   extends SqlMapper {
    long countByExample(RedPacketExample example);

    int deleteByExample(RedPacketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedPacket record);

    int insertSelective(RedPacket record);

    List<RedPacket> selectByExample(RedPacketExample example);

    RedPacket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedPacket record, @Param("example") RedPacketExample example);

    int updateByExample(@Param("record") RedPacket record, @Param("example") RedPacketExample example);

    int updateByPrimaryKeySelective(RedPacket record);

    int updateByPrimaryKey(RedPacket record);
}