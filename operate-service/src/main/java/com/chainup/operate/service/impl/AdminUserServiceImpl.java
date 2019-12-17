package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminUserMapper;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.AdminUserExample;
import com.chainup.operate.service.AdminUserService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminUserServiceImpl implements AdminUserService{
    @Autowired
    private AdminUserMapper adminUserMapper;
    
    @Override
	public void add(AdminUser adminUser) {
    	ReflectionUtils.escapeSql(adminUser);
    	adminUserMapper.insert(adminUser);
	}

	@Override
	public Integer count(AdminUserExample example) {
		try {
			return adminUserMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminUser> findAll(AdminUserExample example) {
		try {
			List<AdminUser> list = adminUserMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}

	@Override
	public AdminUser findById(Integer id) {
		AdminUser adminUser = adminUserMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(adminUser);
		return adminUser;
	}

	@Override
	public AdminUser findByMobileNumber(String mobileNumber) {
		AdminUserExample example = new AdminUserExample();
		AdminUserExample.Criteria criteria = example.createCriteria();
		if (mobileNumber != null) {
			criteria.andMobileNumberEqualTo(mobileNumber);
		}
		List<AdminUser> adminUsers = adminUserMapper.selectByExample(example);
		if (adminUsers == null || adminUsers.isEmpty()) {
			return null;
		}
		ReflectionUtils.escapeHtml(adminUsers.get(0));
		return adminUsers.get(0);
	}
	
	@Override
	public void delete(AdminUserExample example) {
		adminUserMapper.deleteByExample(example);
	}
    
	@Override
	public void update(AdminUser adminUser) {
		ReflectionUtils.escapeSql(adminUser);
		adminUserMapper.updateByPrimaryKeySelective(adminUser);
	}
}