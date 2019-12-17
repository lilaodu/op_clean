package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.UserDepositAddrMapper;
import com.chainup.common.exchange.entity.UserDepositAddr;
import com.chainup.common.exchange.entity.UserDepositAddrExample;
import com.chainup.operate.service.UserDepositAddrService;

@Service
public class UserDepositAddrServiceImpl implements UserDepositAddrService {
	@Autowired
	private UserDepositAddrMapper userBankCardMapper;

	@Override
	public void add(UserDepositAddr userBankCard) {
		userBankCardMapper.insert(userBankCard);
	}

	@Override
	public Integer count(UserDepositAddrExample example) {
		return userBankCardMapper.countByExample(example);
	}

	@Override
	public List<UserDepositAddr> findAll(UserDepositAddrExample example) {
		return userBankCardMapper.selectByExample(example);
	}

	@Override
	public UserDepositAddr findById(Integer id) {
		return userBankCardMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteById(Integer id) {
		userBankCardMapper.deleteByPrimaryKey(id);
	}

}