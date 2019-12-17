package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.FinanceHistoryHot;
import com.chainup.common.exchange.entity.FinanceHistoryHotExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FinanceHistoryHotMapper extends SqlMapper {
    int countByExample(FinanceHistoryHotExample example);

    int deleteByExample(FinanceHistoryHotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinanceHistoryHot record);

    int insertSelective(FinanceHistoryHot record);

    FinanceHistoryHot selectOnlyOneByExample(FinanceHistoryHotExample example);

    List<FinanceHistoryHot> selectByExample(FinanceHistoryHotExample example);

    FinanceHistoryHot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinanceHistoryHot record, @Param("example") FinanceHistoryHotExample example);

    int updateByExample(@Param("record") FinanceHistoryHot record, @Param("example") FinanceHistoryHotExample example);

    int updateByPrimaryKeySelective(FinanceHistoryHot record);

    int updateByPrimaryKey(FinanceHistoryHot record);

    /**
     * 获取某个时间点的记录
     * @param param
     * {
     *     limitDate: Date
     * }
     * @return
     */
    List<FinanceHistoryHot> selectLatestByDate(Map<String, Object> param);
}