package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.CoinBankUserProfit;

public interface CoinBankUserProfitService {

	List<CoinBankUserProfit> selectBysubUsers(Map<String, Object> map);

	long selectCountBysubUsers(Map<String, Object> map);

}