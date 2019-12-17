package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.stats.entity.StatsTradeUser;
import com.chainup.common.stats.entity.StatsTradeUserExample;

/**
 * Created by zhaozhenhua on 2017/10/26.
 */

public interface StatsTradeUserService {

    List<StatsTradeUser> findAll(StatsTradeUserExample example);

    Integer insertStatsTradeUser(StatsTradeUserExample example);

    Integer updateStatsTradeUser(StatsTradeUserExample example);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(StatsTradeUserExample example);

    Map<Integer,StatsTradeUser> uid2StatsTradeUser(List<Integer> uids, Date temlTime);
}

