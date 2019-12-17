package com.chainup.operate.service;

import com.chainup.common.stats.entity.StatsWithdrawDay;
import com.chainup.common.stats.entity.StatsWithdrawDayExample;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangkezhu on 2017/10/31.
 */
public interface StatsWithdrawDayService {

    List<StatsWithdrawDay> findAll(StatsWithdrawDayExample example);

    List<Map<String,Object>> selectSumCountByWithdraw(StatsWithdrawDayExample example);

    Integer insertStatsWithdrawDay(StatsWithdrawDayExample example);

    Integer updateStatsWithdrawDay(StatsWithdrawDayExample example);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsWithdrawDayExample example);

}
