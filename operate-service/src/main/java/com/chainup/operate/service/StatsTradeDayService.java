package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.stats.entity.StatsTradeDay;
import com.chainup.common.stats.entity.StatsTradeDayExample;

/**
 * Created by zhangkezhu on 2017/10/25.
 */
public interface StatsTradeDayService {

    List<StatsTradeDay> findAll(StatsTradeDayExample example);

    List<Map<String,Object>> selectSumCountBySymbol(StatsTradeDayExample example);

    Integer insertStatsTradeDay(StatsTradeDayExample example);

    Integer updateStatsTradeDay(StatsTradeDayExample example);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsTradeDayExample example);

}
