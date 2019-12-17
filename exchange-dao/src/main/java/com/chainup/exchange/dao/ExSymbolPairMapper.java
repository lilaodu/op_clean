package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExSymbolPair;
import com.chainup.common.exchange.entity.ExSymbolPairExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExSymbolPairMapper extends SqlMapper {
	int countByExample(ExSymbolPairExample example);

	int deleteByExample(ExSymbolPairExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ExSymbolPair record);

	int insertSelective(ExSymbolPair record);

	ExSymbolPair selectOnlyOneByExample(ExSymbolPairExample example);

	List<ExSymbolPair> selectByExample(ExSymbolPairExample example);

	ExSymbolPair selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ExSymbolPair record, @Param("example") ExSymbolPairExample example);

	int updateByExample(@Param("record") ExSymbolPair record, @Param("example") ExSymbolPairExample example);

	int updateByPrimaryKeySelective(ExSymbolPair record);

	int updateByPrimaryKey(ExSymbolPair record);
}