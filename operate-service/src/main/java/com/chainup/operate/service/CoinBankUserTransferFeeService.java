package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CoinBankUserTransferFee;

public interface CoinBankUserTransferFeeService {

	List<CoinBankUserTransferFee> selectListByCoinBankUserTransferFee(CoinBankUserTransferFee paramBankUserTransferFee);

}