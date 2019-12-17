package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.HistoryAccount;
import com.chainup.common.exchange.entity.HistoryAccountExample;

public interface HistoryAccountMapper extends SqlMapper {
    int countByExample(HistoryAccountExample example);

    int deleteByExample(HistoryAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HistoryAccount record);

    int insertSelective(HistoryAccount record);

    HistoryAccount selectOnlyOneByExample(HistoryAccountExample example);

    List<HistoryAccount> selectByExample(HistoryAccountExample example);

    HistoryAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HistoryAccount record, @Param("example") HistoryAccountExample example);

    int updateByExample(@Param("record") HistoryAccount record, @Param("example") HistoryAccountExample example);

    int updateByPrimaryKeySelective(HistoryAccount record);

    int updateByPrimaryKey(HistoryAccount record);
}