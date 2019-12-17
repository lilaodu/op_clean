package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.CoinBankLevelOrder;

public interface CoinBankLevelOrderService {

	long selectCountByCoinbank(Map<String, Object> map);

	List<CoinBankLevelOrder> selectListByCoinbank(Map<String, Object> map);

	CoinBankLevelOrder selectByPrimaryKey(Integer id);

	int updateLevelByCoinBankLevelOrder(CoinBankLevelOrder coinBankLevelOrder);

}