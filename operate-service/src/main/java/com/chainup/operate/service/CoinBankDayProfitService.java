package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.CoinBankDayProfit;

public interface CoinBankDayProfitService  {


	long selectCountByCoinbank(Map<String, Object> map);

	List<CoinBankDayProfit> selectListByCoinbank(Map<String, Object> map);

	int updateStatusById(CoinBankDayProfit bankDayProfit,Byte status);

	List<CoinBankDayProfit> selectByCoinBankDwm(List<Integer> idList, Date date1, Date date2);


}