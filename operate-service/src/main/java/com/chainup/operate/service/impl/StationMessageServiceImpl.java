package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.StationMessageMapper;
import com.chainup.common.exchange.entity.StationMessage;
import com.chainup.common.exchange.entity.StationMessageExample;
import com.chainup.operate.service.StationMessageService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class StationMessageServiceImpl implements StationMessageService {
	@Autowired
	private StationMessageMapper stationMessageMapper;

	@Override
	public Integer add(StationMessage stationMessage) {
		ReflectionUtils.escapeSql(stationMessage);
		return stationMessageMapper.insert(stationMessage);
	}

	@Override
	public Integer count(StationMessageExample example) {
		return stationMessageMapper.countByExample(example);
	}

	@Override
	public List<StationMessage> findAll(StationMessageExample example) {
		List<StationMessage> list = stationMessageMapper.selectByExampleWithBLOBs(example);
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public StationMessage findById(Integer id) {
		StationMessage stationMessage = stationMessageMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(stationMessage);
		return stationMessage;
	}

	@Override
	public void deleteById(Integer id) {
		stationMessageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(StationMessage stationMessage) {
		ReflectionUtils.escapeSql(stationMessage);
		stationMessageMapper.updateByPrimaryKeySelective(stationMessage);
	}
	
}