package com.chainup.operate.service;

import com.chainup.common.exchange.entity.ExFee;
import com.chainup.common.exchange.entity.ExFeeExample;
import com.chainup.common.exchange.entity.ExSymbol;

import java.util.List;
import java.util.Map;

/**
 * 费率设置：交易（所有币对），充值（法币）， 提现（法币）
 * Created by nob.
 */
public interface ExFeeService {

    /**
     * 根据symbol和feeType，更新或者插入费率
     *
     * @param exFee
     * @return
     */
    public void save(ExFee exFee);


    List<ExFee> findAll(ExFeeExample example);

    List<Map<String, Object>>  pairFeeSetting();

    List<Map<String, Object>>  coinDepositFeeSetting();

    List<Map<String, Object>>  coinWithdrawFeeSetting();

    List<Map<String, Object>>  digiccyFeeSetting();

	List<ExSymbol> findOtcFees();

	public List<ExSymbol> findOtcSymbols();
}
