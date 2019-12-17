package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.StationMessageSendTaskMapper;
import com.chainup.common.exchange.entity.StationMessageSendTask;
import com.chainup.common.exchange.entity.StationMessageSendTaskExample;
import com.chainup.operate.service.StationMessageSendTaskService;

@Service
public class StationMessageSendTaskServiceImpl implements StationMessageSendTaskService {
	@Autowired
	private StationMessageSendTaskMapper stationMessageSendTaskMapper;

	@Override
	public void add(StationMessageSendTask stationMessageSendTask) {
		stationMessageSendTaskMapper.insert(stationMessageSendTask);
	}

	@Override
	public Integer count(StationMessageSendTaskExample example) {
		return stationMessageSendTaskMapper.countByExample(example);
	}

	@Override
	public List<StationMessageSendTask> findAll(StationMessageSendTaskExample example) {
		return stationMessageSendTaskMapper.selectByExample(example);
	}

	@Override
	public StationMessageSendTask findById(Integer id) {
		return stationMessageSendTaskMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteById(Integer id) {
		stationMessageSendTaskMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(StationMessageSendTask stationMessageSendTask) {
		stationMessageSendTaskMapper.updateByPrimaryKeySelective(stationMessageSendTask);		
	}

	@Override
	public void batchAdd(List<StationMessageSendTask> stationMessageSendTaskList) {
		stationMessageSendTaskMapper.insertBatch(stationMessageSendTaskList);
	}

	@Override
	public void batchUpdateStatusById(List<Integer> idList, Byte sendStatus) {
		stationMessageSendTaskMapper.updateStatusByPrimaryKey(idList, sendStatus);
	}
}