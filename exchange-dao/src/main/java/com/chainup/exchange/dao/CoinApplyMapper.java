package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinApply;
import com.chainup.common.exchange.entity.CoinApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinApplyMapper extends SqlMapper {
    long countByExample(CoinApplyExample example);

    int deleteByExample(CoinApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinApply record);

    int insertSelective(CoinApply record);

    List<CoinApply> selectByExample(CoinApplyExample example);

    CoinApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinApply record, @Param("example") CoinApplyExample example);

    int updateByExample(@Param("record") CoinApply record, @Param("example") CoinApplyExample example);

    int updateByPrimaryKeySelective(CoinApply record);

    int updateByPrimaryKey(CoinApply record);
}