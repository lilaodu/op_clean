package com.chainup.operate.service;

import com.chainup.common.stats.entity.StatsUserDay;
import com.chainup.common.stats.entity.StatsUserDayExample;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangkezhu on 2017/10/25.
 */
public interface StatsUserDayService {

    List<StatsUserDay> findAll(StatsUserDayExample example);

    List<Map<String,Object>> selectSumCountByRegist(StatsUserDayExample example);

    List<Map<String,Object>> selectSumCountByLogin(StatsUserDayExample example);

    Integer insertStatsTradeDay(StatsUserDayExample example);

    Integer updateStatsTradeDay(StatsUserDayExample example);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsUserDayExample example);

}
