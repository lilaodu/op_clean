package com.chainup.exchange.dao;

import java.util.List;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.SymbolRate;

public interface SymbolRateMapper extends SqlMapper {

    List<SymbolRate> getSymbolRateList();
    
    void insertSymbolRate(SymbolRate symbolRate);
    
    void updateSymbolRate(SymbolRate symbolRate);
    
}