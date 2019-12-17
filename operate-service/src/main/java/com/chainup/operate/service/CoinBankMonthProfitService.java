package com.chainup.operate.service;

import java.util.Date;
import java.util.List;

import com.chainup.common.exchange.entity.CoinBankMonthProfit;

public interface CoinBankMonthProfitService {

	List<CoinBankMonthProfit> selectByCoinBankDwm(List<Integer> ids, Date smonth,Date emonth);

}