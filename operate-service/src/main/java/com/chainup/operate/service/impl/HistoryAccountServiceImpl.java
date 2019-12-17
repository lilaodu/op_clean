package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.HistoryAccountMapper;
import com.chainup.common.exchange.entity.HistoryAccount;
import com.chainup.common.exchange.entity.HistoryAccountExample;
import com.chainup.operate.service.HistoryAccountService;

@Service
public class HistoryAccountServiceImpl implements HistoryAccountService{
    @Autowired
    private HistoryAccountMapper uistoryAccountMapper;

    @Override
    public void add(HistoryAccount uistoryAccount) {
        // TODO Auto-generated method stub
        uistoryAccountMapper.insert(uistoryAccount);
    }

    @Override
    public Integer count(HistoryAccountExample example) {
        // TODO Auto-generated method stub
        return uistoryAccountMapper.countByExample(example);
    }

    @Override
    public List<HistoryAccount> findAll(HistoryAccountExample example) {
        // TODO Auto-generated method stub
        return uistoryAccountMapper.selectByExample(example);
    }

    @Override
    public HistoryAccount findById(Long id) {
        // TODO Auto-generated method stub
        return uistoryAccountMapper.selectByPrimaryKey(id);
    }

    
}