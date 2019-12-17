package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import com.chainup.common.dao.SqlMapper;

public interface ExchangeAcountDayMapper extends SqlMapper{
    
    /**
     * 获取所有用户的所有币对余额
     * @author han
     * @param conditions
     * @return
     */
    List<Map<String, Object>> selectUserAccountDay(Map<String, Object> conditions);
    
    /**
     * 每隔一小时获取用户所有币对余额
     * @author han
     * @param conditions
     * @return
     */
    List<Map<String, Object>> selectNewUserAccountDay(Map<String, Object> conditions);
}