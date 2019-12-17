package com.chainup.exchange.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.HKDTCompetition;
import com.chainup.common.exchange.entity.HKDTCompetitionExample;

public interface HKDTCompetitionMapper extends SqlMapper {
    long countByExample(HKDTCompetitionExample example);

    int deleteByExample(HKDTCompetitionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HKDTCompetition record);

    int insertSelective(HKDTCompetition record);

    List<HKDTCompetition> selectByExample(HKDTCompetitionExample example);

    HKDTCompetition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HKDTCompetition record, @Param("example") HKDTCompetitionExample example);

    int updateByExample(@Param("record") HKDTCompetition record, @Param("example") HKDTCompetitionExample example);

    int updateByPrimaryKeySelective(HKDTCompetition record);

    int updateByPrimaryKey(HKDTCompetition record);

	List<HKDTCompetition> selectHkdtCompetitionWinning();
}