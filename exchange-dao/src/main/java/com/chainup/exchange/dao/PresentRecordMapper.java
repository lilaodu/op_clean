package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.PresentRecord;
import com.chainup.common.exchange.entity.PresentRecordExample;

public interface PresentRecordMapper  extends SqlMapper{
    int countByExample(PresentRecordExample example);

    int deleteByExample(PresentRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PresentRecord record);

    int insertSelective(PresentRecord record);

    PresentRecord selectOnlyOneByExample(PresentRecordExample example);

    List<PresentRecord> selectByExample(PresentRecordExample example);

    PresentRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PresentRecord record, @Param("example") PresentRecordExample example);

    int updateByExample(@Param("record") PresentRecord record, @Param("example") PresentRecordExample example);

    int updateByPrimaryKeySelective(PresentRecord record);

    int updateByPrimaryKey(PresentRecord record);
}