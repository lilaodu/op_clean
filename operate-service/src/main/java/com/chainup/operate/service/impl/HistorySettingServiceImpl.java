package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.HistorySettingMapper;
import com.chainup.common.exchange.entity.HistoryLogin;
import com.chainup.common.exchange.entity.HistorySetting;
import com.chainup.common.exchange.entity.HistorySettingExample;
import com.chainup.operate.service.HistorySettingService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class HistorySettingServiceImpl implements HistorySettingService{
    @Autowired
    private HistorySettingMapper historySettingMapper;

    @Override
    public void add(HistorySetting historySetting) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(historySetting);
        historySettingMapper.insert(historySetting);
    }

    @Override
    public Integer count(HistorySettingExample example) {
        // TODO Auto-generated method stub
        return historySettingMapper.countByExample(example);
    }

    @Override
    public List<HistorySetting> findAll(HistorySettingExample example) {
        // TODO Auto-generated method stub
        List<HistorySetting> list = historySettingMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public HistorySetting findById(Integer id) {
        // TODO Auto-generated method stub
        HistorySetting historySetting = historySettingMapper.selectByPrimaryKey(id);
        ReflectionUtils.escapeHtml(historySetting);
        return historySetting;
    }

   
    
}