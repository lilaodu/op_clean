package com.chainup.operate.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.UserMessageMapper;
import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.common.exchange.entity.UserMessageExample;
import com.chainup.operate.service.UserMessageService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class UserMessageServiceImpl implements UserMessageService {
	@Autowired
	private UserMessageMapper userMessageMapper;

	@Override
	public Integer add(UserMessage userMessage) {
		ReflectionUtils.escapeSql(userMessage);
		return userMessageMapper.insert(userMessage);
	}

	@Override
	public Integer count(UserMessageExample example) {
		return userMessageMapper.countByExample(example);
	}

	@Override
	public List<UserMessage> findAll(UserMessageExample example) {
		List<UserMessage> list = userMessageMapper.selectByExample(example);
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public UserMessage findById(Integer id) {
		UserMessage userMessage = userMessageMapper.selectByPrimaryKey(id);
		ReflectionUtils.escapeHtml(userMessage);
		return userMessage;
	}

	@Override
	public void deleteById(Integer id) {
		userMessageMapper.deleteByPrimaryKey(id);		
	}

	@Override
	public void update(UserMessage userMessage) {
		ReflectionUtils.escapeSql(userMessage);
		userMessageMapper.updateByPrimaryKeySelective(userMessage);		
	}

	@Override
	public void sendMessage(Integer uid,String messageCertificate) {
		UserMessage userMessage = new UserMessage();
		userMessage.setReceiveUid(uid);
		userMessage.setMessageType((byte)5);
		userMessage.setStatus((byte)1);
		userMessage.setMessageContent(messageCertificate);
		userMessage.setCtime(new Date());
		this.add(userMessage);
	}

	@Override
	public void batchAdd(List<UserMessage> userMessageList) {
		userMessageMapper.insertBatch(userMessageList);
	}
	
}