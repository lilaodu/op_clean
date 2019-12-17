package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.stats.entity.StatsAcountDay;
import com.chainup.common.stats.entity.StatsAcountDayExample;
/**
 * Created by zhaozhenhua on 2017/10/26.
 */
public interface StatsAcountDayService {

    List<StatsAcountDay> findAll(StatsAcountDayExample example);

    Integer insertStatsAcountDay(StatsAcountDayExample example);

    Integer updateStatsAcountDay(StatsAcountDayExample example);

    List<StatsAcountDay> findAllByUid(List<Integer> uidList);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsAcountDayExample example);
}
