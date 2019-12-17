package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExBasicConfig;
import com.chainup.common.exchange.entity.ExBasicConfigExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExBasicConfigMapper extends SqlMapper {
	int countByExample(ExBasicConfigExample example);

	int deleteByExample(ExBasicConfigExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ExBasicConfig record);

	int insertSelective(ExBasicConfig record);

	ExBasicConfig selectOnlyOneByExample(ExBasicConfigExample example);

	List<ExBasicConfig> selectByExample(ExBasicConfigExample example);

	ExBasicConfig selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ExBasicConfig record, @Param("example") ExBasicConfigExample example);

	int updateByExample(@Param("record") ExBasicConfig record, @Param("example") ExBasicConfigExample example);

	int updateByPrimaryKeySelective(ExBasicConfig record);

	int updateByPrimaryKey(ExBasicConfig record);
}