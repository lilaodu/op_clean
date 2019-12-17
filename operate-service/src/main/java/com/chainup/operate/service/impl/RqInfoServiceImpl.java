package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.RqImageMapper;
import com.chainup.exchange.dao.RqInfoMapper;
import com.chainup.exchange.dao.RqReplyMapper;
import com.chainup.common.exchange.entity.RqImageExample;
import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;
import com.chainup.common.exchange.entity.RqReplyExample;
import com.chainup.operate.service.RqInfoService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class RqInfoServiceImpl implements RqInfoService {
	@Autowired
	private RqInfoMapper rqInfoMapper;
	@Autowired
	private RqReplyMapper rqReplyMapper;
	@Autowired
	private RqImageMapper rqImageMapper;
	
	@Override
	public Integer add(RqInfo rqInfo) {
		ReflectionUtils.escapeSql(rqInfo);
		return rqInfoMapper.insert(rqInfo);
	}

	@Override
	public Integer count(RqInfoExample example) {
		return rqInfoMapper.countByExample(example);
	}

	@Override
	public List<RqInfo> findAll(RqInfoExample example) {
		List<RqInfo> list = rqInfoMapper.selectByExample(example);
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public RqInfo findById(Integer id) {
		RqInfo rqInfo = rqInfoMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(rqInfo);
		return rqInfo;
	}

	@Override
	public void deleteById(Integer id) {
		// 删除工单，同时将关联的 工单回复列表，工单对应的图片删除
		try {
			rqInfoMapper.deleteByPrimaryKey(id);
			RqReplyExample replyExample = new RqReplyExample();
			replyExample.createCriteria().andRqIdEqualTo(id);
			rqReplyMapper.deleteByExample(replyExample);
			RqImageExample rqImageExample = new RqImageExample();
			rqImageExample.createCriteria().andRqIdEqualTo(id);
			rqImageMapper.deleteByExample(rqImageExample);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(RqInfo rqInfo) {
		ReflectionUtils.escapeSql(rqInfo);
		rqInfoMapper.updateByPrimaryKeySelective(rqInfo);
	}
}