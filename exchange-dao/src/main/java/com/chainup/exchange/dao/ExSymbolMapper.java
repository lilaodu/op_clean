package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExSymbol;
import com.chainup.common.exchange.entity.ExSymbolExample;

public interface ExSymbolMapper  extends SqlMapper {
    int countByExample(ExSymbolExample example);

    int deleteByExample(ExSymbolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExSymbol record);

    int insertSelective(ExSymbol record);

    ExSymbol selectOnlyOneByExample(ExSymbolExample example);

    List<ExSymbol> selectByExample(ExSymbolExample example);

    ExSymbol selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExSymbol record, @Param("example") ExSymbolExample example);

    int updateByExample(@Param("record") ExSymbol record, @Param("example") ExSymbolExample example);

    int updateByPrimaryKeySelective(ExSymbol record);

    int updateByPrimaryKey(ExSymbol record);

	List<ExSymbol> selectByUserHave(@Param("coinSymbols")List<String> coinSymbols);
}