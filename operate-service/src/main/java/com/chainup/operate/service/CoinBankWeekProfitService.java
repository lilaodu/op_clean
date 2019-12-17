package com.chainup.operate.service;

import java.util.Date;
import java.util.List;

import com.chainup.common.exchange.entity.CoinBankWeekProfit;

public interface CoinBankWeekProfitService {

	List<CoinBankWeekProfit> selectByCoinBankDwm(List<Integer> ids, Date stime, Date etime);

}