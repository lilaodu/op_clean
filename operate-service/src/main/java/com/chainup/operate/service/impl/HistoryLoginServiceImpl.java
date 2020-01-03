package com.chainup.operate.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.common.web.Constants;
import com.chainup.exchange.dao.HistoryLoginMapper;
import com.chainup.operate.service.HistoryLoginService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class HistoryLoginServiceImpl implements HistoryLoginService{
    @Autowired
    private HistoryLoginMapper historyLoginMapper;


    @Override
    public void add(HistoryLogin historyLogin) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(historyLogin);
        historyLoginMapper.insert(historyLogin);
    }

    @Override
    public Integer count(HistoryLoginExample example) {
        // TODO Auto-generated method stub
        return historyLoginMapper.countByExample(example);
    }

    @Override
    public List<HistoryLogin> findAll(HistoryLoginExample example) {
        // TODO Auto-generated method stub
        List<HistoryLogin> list = historyLoginMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public HistoryLogin findById(Integer id) {
        // TODO Auto-generated method stub
        HistoryLogin historyLogin = historyLoginMapper.selectByPrimaryKey(id);
        ReflectionUtils.escapeHtml(historyLogin);
        return historyLogin;
    }

    @Override
    public int countByCtime(String lgtimeStart,String lgtimeEnd) {
        // TODO Auto-generated method stub
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("lgtimeStart", lgtimeStart);
        map.put("lgtimeEnd", lgtimeEnd);
        return historyLoginMapper.countByCtime(map);
    }

    @Override
    public List<HistoryLogin> listByPage(Integer start, Integer pageSize,String ctimeStart,String ctimeEnd) {
    	List<HistoryLogin> loginList = new ArrayList<HistoryLogin>();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("lgtimeStart", ctimeStart);
        map.put("lgtimeEnd", ctimeEnd);
        loginList = historyLoginMapper.listByPage(map);
        try {
	        if(loginList!=null && loginList.size()>0){
	            for(HistoryLogin u:loginList){
	                Date temp = u.getLgInTime();
	                HistoryLoginExample example = new HistoryLoginExample();
	                HistoryLoginExample.Criteria criteria = example.createCriteria();
					criteria.andLgInTimeGreaterThanOrEqualTo(Constants.ymdhms_format.parse(Constants.ymd_format.format(temp) + Constants.TIME_START_STR));
	                criteria.andLgInTimeLessThanOrEqualTo(Constants.ymdhms_format.parse(Constants.ymd_format.format(temp) + Constants.TIME_END_STR));
	                List<HistoryLogin> uTempList = historyLoginMapper.selectByExample(example);
	                
	                if(uTempList!=null && uTempList.size()>0){
	                    List<Integer> uids = new ArrayList<Integer>();
	                    int deposit= 0;//完成充值人数
	                    int withdraw = 0;//提现人数
                        int order = 0; //交易人数
	                    for(HistoryLogin ut:uTempList){
	                        if(!uids.contains(ut.getUid())){
	                            uids.add(ut.getUid());
	                        }
	                    }
	                    u.setLogin(uids.size());//登录人数（重复登录算一条）
	                    u.setDeposit(deposit);
	                    u.setWithdraw(withdraw);
                        u.setOrder(order);
	                }
	            }
	        }
	    } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ReflectionUtils.escapeHtml(loginList);
        return loginList;
    }
}