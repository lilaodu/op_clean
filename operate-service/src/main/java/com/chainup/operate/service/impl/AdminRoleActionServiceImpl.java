package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminRoleActionMapper;
import com.chainup.common.exchange.entity.AdminRoleAction;
import com.chainup.common.exchange.entity.AdminRoleActionExample;
import com.chainup.operate.service.AdminRoleActionService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminRoleActionServiceImpl implements AdminRoleActionService{
    @Autowired
    private AdminRoleActionMapper AdminRoleActionMapper;
    
    @Override
	public void add(AdminRoleAction AdminRoleAction) {
    	ReflectionUtils.escapeSql(AdminRoleAction);
    	AdminRoleActionMapper.insert(AdminRoleAction);
	}

	@Override
	public Integer count(AdminRoleActionExample example) {
		try {
			return AdminRoleActionMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminRoleAction> findAll(AdminRoleActionExample example) {
		try {
			List<AdminRoleAction> list = AdminRoleActionMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}

	@Override
	public AdminRoleAction findById(Integer id) {
		AdminRoleAction adminRoleAction = AdminRoleActionMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(adminRoleAction);
		return adminRoleAction;
	}
	
	@Override
	public void delete(AdminRoleActionExample example) {
		AdminRoleActionMapper.deleteByExample(example);
	}
    
	@Override
	public void update(AdminRoleAction adminRoleAction) {
		ReflectionUtils.escapeSql(adminRoleAction);
		AdminRoleActionMapper.updateByPrimaryKeySelective(adminRoleAction);
	}
}