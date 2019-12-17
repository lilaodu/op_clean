package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminActionMapper;
import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionExample;
import com.chainup.operate.service.AdminActionService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminActionServiceImpl implements AdminActionService{
    @Autowired
    private AdminActionMapper AdminActionMapper;
    
    @Override
	public void add(AdminAction AdminAction) {
    	ReflectionUtils.escapeSql(AdminAction);
    	AdminActionMapper.insert(AdminAction);
	}

	@Override
	public Integer count(AdminActionExample example) {
		try {
			return AdminActionMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminAction> findAll(AdminActionExample example) {
		try {
			List<AdminAction> list = AdminActionMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}

	@Override
	public AdminAction findById(Integer id) {
		AdminAction action = AdminActionMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(action);
		return action;
	}
	
	@Override
	public void delete(AdminActionExample example) {
		AdminActionMapper.deleteByExample(example);
	}
	
	@Override
	public void update(AdminAction AdminAction) {
		ReflectionUtils.escapeSql(AdminAction);
		AdminActionMapper.updateByPrimaryKeySelective(AdminAction);
	}
}