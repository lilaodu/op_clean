package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.OtcTransfer;
import com.chainup.common.exchange.entity.OtcTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtcTransferMapper extends SqlMapper{
    int countByExample(OtcTransferExample example);

    int deleteByExample(OtcTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OtcTransfer record);

    int insertSelective(OtcTransfer record);

    OtcTransfer selectOnlyOneByExample(OtcTransferExample example);

    List<OtcTransfer> selectByExample(OtcTransferExample example);

    OtcTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OtcTransfer record, @Param("example") OtcTransferExample example);

    int updateByExample(@Param("record") OtcTransfer record, @Param("example") OtcTransferExample example);

    int updateByPrimaryKeySelective(OtcTransfer record);

    int updateByPrimaryKey(OtcTransfer record);
}