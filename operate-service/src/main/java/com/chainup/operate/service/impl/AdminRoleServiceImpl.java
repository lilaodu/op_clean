package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminRoleMapper;
import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleExample;
import com.chainup.operate.service.AdminRoleService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminRoleServiceImpl implements AdminRoleService{
    @Autowired
    private AdminRoleMapper AdminRoleMapper;
    
    @Override
	public Integer add(AdminRole AdminRole) {
    	ReflectionUtils.escapeSql(AdminRole);
    	return AdminRoleMapper.insertSelective(AdminRole);
	}

	@Override
	public Integer count(AdminRoleExample example) {
		try {
			return AdminRoleMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminRole> findAll(AdminRoleExample example) {
		try {
			List<AdminRole> list = AdminRoleMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}

	@Override
	public AdminRole findById(Integer id) {
		AdminRole adminRole = AdminRoleMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(adminRole);
		return adminRole;
	}
	
	@Override
	public void delete(AdminRoleExample example) {
		AdminRoleMapper.deleteByExample(example);
	}
    
	@Override
	public void update(AdminRole adminRole) {
		ReflectionUtils.escapeSql(adminRole);
		AdminRoleMapper.updateByPrimaryKey(adminRole);
	}
}