package com.chainup.kline.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExScaleKline;
import com.chainup.common.exchange.entity.ExScaleKlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExScaleKlineMapper extends SqlMapper {
    int countByExample(ExScaleKlineExample example);

    int deleteByExample(ExScaleKlineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExScaleKline record);

    int insertSelective(ExScaleKline record);

    ExScaleKline selectOnlyOneByExample(ExScaleKlineExample example);

    List<ExScaleKline> selectByExample(ExScaleKlineExample example);

    ExScaleKline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExScaleKline record, @Param("example") ExScaleKlineExample example);

    int updateByExample(@Param("record") ExScaleKline record, @Param("example") ExScaleKlineExample example);

    int updateByPrimaryKeySelective(ExScaleKline record);

    int updateByPrimaryKey(ExScaleKline record);
}