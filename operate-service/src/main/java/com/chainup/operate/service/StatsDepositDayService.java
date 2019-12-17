package com.chainup.operate.service;

import com.chainup.common.stats.entity.StatsDepositDay;
import com.chainup.common.stats.entity.StatsDepositDayExample;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangkezhu on 2017/10/31.
 */
public interface StatsDepositDayService {

    List<StatsDepositDay> findAll(StatsDepositDayExample example);

    List<Map<String,Object>> selectSumCountByDeposit(StatsDepositDayExample example);

    Integer insertStatsDepositDay(StatsDepositDayExample example);

    Integer updateStatsDepositDay(StatsDepositDayExample example);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsDepositDayExample example);

}
