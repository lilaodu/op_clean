package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AdminOperationLogMapper;
import com.chainup.common.exchange.entity.AdminOperationLog;
import com.chainup.common.exchange.entity.AdminOperationLogExample;
import com.chainup.operate.service.AdminOperationLogService;
import com.chainup.common.util.ReflectionUtils;

/**
 * Created by zhangkezhu on 2017/10/23.
 */

@Service
public class AdminOperationLogServiceImp implements AdminOperationLogService{
    @Autowired
    private AdminOperationLogMapper adminOperationLogMapper;

    @Override
    public Integer add(Integer user_id,Integer event_type,Integer manager_id,String front_desc,String behind_desc) {
        AdminOperationLog log = new AdminOperationLog();
        log.setCtime(new Date());
        log.setBehindDesc(behind_desc);
        log.setManagerId(manager_id);
        log.setEventType(event_type);
        log.setFrontDesc(front_desc);
        log.setUserId(user_id);
        ReflectionUtils.escapeSql(log);
        return adminOperationLogMapper.insertSelective(log);
    }

    @Override
    public Integer count(AdminOperationLogExample example) {
        try {
            return adminOperationLogMapper.countByExample(example);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }

    @Override
    public List<AdminOperationLog> findAll(AdminOperationLogExample example) {
        try {
            List<AdminOperationLog> list = adminOperationLogMapper.selectByExample(example);
            ReflectionUtils.escapeHtml(list);
            return list;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return new ArrayList<>();
    }

    @Override
    public void delete(AdminOperationLogExample example) {
        adminOperationLogMapper.deleteByExample(example);
    }
}
