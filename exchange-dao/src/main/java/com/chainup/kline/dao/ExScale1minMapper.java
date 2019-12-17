package com.chainup.kline.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExScale1min;
import com.chainup.common.exchange.entity.ExScale1minExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExScale1minMapper extends SqlMapper {
    int countByExample(ExScale1minExample example);

    int deleteByExample(ExScale1minExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExScale1min record);

    int insertSelective(ExScale1min record);

    ExScale1min selectOnlyOneByExample(ExScale1minExample example);

    List<ExScale1min> selectByExample(ExScale1minExample example);

    ExScale1min selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExScale1min record, @Param("example") ExScale1minExample example);

    int updateByExample(@Param("record") ExScale1min record, @Param("example") ExScale1minExample example);

    int updateByPrimaryKeySelective(ExScale1min record);

    int updateByPrimaryKey(ExScale1min record);
}