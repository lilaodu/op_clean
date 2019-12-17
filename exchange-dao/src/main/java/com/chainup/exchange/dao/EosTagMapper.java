package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.EosTag;
import com.chainup.common.exchange.entity.EosTagExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EosTagMapper extends SqlMapper  {
    long countByExample(EosTagExample example);

    int insert(EosTag record);

    int insertSelective(EosTag record);
    
    int insertByEosTag(EosTag eosTag);

    List<EosTag> selectByExample(EosTagExample example);
    
    List<EosTag> selectByEosTag(EosTag eosTag);

    EosTag selectByPrimaryKey(Integer id);
}