package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExCoinSymbol;
import com.chainup.common.exchange.entity.ExCoinSymbolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExCoinSymbolMapper extends SqlMapper {
    long countByExample(ExCoinSymbolExample example);

    int deleteByExample(ExCoinSymbolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExCoinSymbol record);

    int insertSelective(ExCoinSymbol record);

    List<ExCoinSymbol> selectByExample(ExCoinSymbolExample example);

    ExCoinSymbol selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExCoinSymbol record, @Param("example") ExCoinSymbolExample example);

    int updateByExample(@Param("record") ExCoinSymbol record, @Param("example") ExCoinSymbolExample example);

    int updateByPrimaryKeySelective(ExCoinSymbol record);

    int updateByPrimaryKey(ExCoinSymbol record);
    
	List<String> selectSymbolNameByExample(ExCoinSymbolExample example);
}