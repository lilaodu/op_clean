package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.RqReplyMapper;
import com.chainup.common.exchange.entity.RqReply;
import com.chainup.common.exchange.entity.RqReplyExample;
import com.chainup.operate.service.RqReplyService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class RqReplyServiceImpl implements RqReplyService {
	@Autowired
	private RqReplyMapper rqReplyMapper;
	
	@Override
	public Integer add(RqReply rqReply) {
		return rqReplyMapper.insert(rqReply);
	}

	@Override
	public Integer count(RqReplyExample example) {
		return rqReplyMapper.countByExample(example);
	}

	@Override
	public List<RqReply> findAll(RqReplyExample example) {
		List<RqReply> list = rqReplyMapper.selectByExample(example);
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public RqReply findById(Integer id) {
		RqReply rqReply = rqReplyMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(rqReply);
		return rqReply;
	}

	@Override
	public void update(RqReply rqReply) {
		rqReplyMapper.updateByPrimaryKeySelective(rqReply);
	}

	@Override
	public void deleteById(Integer id) {
		rqReplyMapper.deleteByPrimaryKey(id);
	}

}