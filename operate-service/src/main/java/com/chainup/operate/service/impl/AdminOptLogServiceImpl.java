package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminOptLogMapper;
import com.chainup.common.exchange.entity.AdminOptLog;
import com.chainup.common.exchange.entity.AdminOptLogExample;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AdminOptLogServiceImpl implements AdminOptLogService{
    @Autowired
    private AdminOptLogMapper adminOptLogMapper;
    
    @Override
	public Integer add(Integer uid,String table,Integer type,String ip,String des) {
    	AdminOptLog log = new AdminOptLog();
    	log.setCtime(new Date());
    	log.setEventDes(des);
    	log.setEventIp(ip);
    	log.setEventType(type);
    	log.setEventTable(table);
    	log.setEventUid(uid);
    	ReflectionUtils.escapeSql(log);
    	return adminOptLogMapper.insert(log);
	}

	@Override
	public Integer count(AdminOptLogExample example) {
		try {
			return adminOptLogMapper.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<AdminOptLog> findAll(AdminOptLogExample example) {
		try {
			List<AdminOptLog> list = adminOptLogMapper.selectByExample(example);
			ReflectionUtils.escapeHtml(list);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<>();
	}
	
	@Override
	public void delete(AdminOptLogExample example) {
		adminOptLogMapper.deleteByExample(example);
	}
}