package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminRoleUserMapper;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.operate.service.AdminRoleUserService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminRoleUserServiceImpl implements AdminRoleUserService{
    @Autowired
    private AdminRoleUserMapper AdminRoleUserMapper;
    
    @Override
	public void add(AdminRoleUser AdminRoleUser) {
    	ReflectionUtils.escapeSql(AdminRoleUser);
    	AdminRoleUserMapper.insert(AdminRoleUser);
	}

	@Override
	public Integer count(AdminRoleUserExample example) {
		try {
			return AdminRoleUserMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminRoleUser> findAll(AdminRoleUserExample example) {
		try {
			List<AdminRoleUser> list = AdminRoleUserMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}

	@Override
	public AdminRoleUser findById(Integer id) {
		AdminRoleUser adminRoleUser = AdminRoleUserMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(adminRoleUser);
		return adminRoleUser;
	}
	
	@Override
	public void delete(AdminRoleUserExample example) {
		AdminRoleUserMapper.deleteByExample(example);
	}
    
	@Override
	public void update(AdminRoleUser adminRoleUser) {
		ReflectionUtils.escapeSql(adminRoleUser);
		AdminRoleUserMapper.updateByPrimaryKey(adminRoleUser);
	}
}