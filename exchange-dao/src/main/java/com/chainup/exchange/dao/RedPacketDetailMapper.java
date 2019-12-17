package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.RedPacketDetail;
import com.chainup.common.exchange.entity.RedPacketDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedPacketDetailMapper   extends SqlMapper{
    long countByExample(RedPacketDetailExample example);

    int deleteByExample(RedPacketDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedPacketDetail record);

    int insertSelective(RedPacketDetail record);

    List<RedPacketDetail> selectByExample(RedPacketDetailExample example);

    RedPacketDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedPacketDetail record, @Param("example") RedPacketDetailExample example);

    int updateByExample(@Param("record") RedPacketDetail record, @Param("example") RedPacketDetailExample example);

    int updateByPrimaryKeySelective(RedPacketDetail record);

    int updateByPrimaryKey(RedPacketDetail record);

    List<RedPacketDetail> selectUnionByPhone(@Param("mobilePhone") String mobilePhone);

	List<RedPacketDetail> findRedPacketListPerson(@Param("mobilePhoneList")List<String> mobilePhoneList);
}