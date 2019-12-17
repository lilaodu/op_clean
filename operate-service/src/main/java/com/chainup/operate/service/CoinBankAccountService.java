package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CoinBankAccount;

public interface CoinBankAccountService {
	CoinBankAccount selectByUserid(Integer userid);

	
}