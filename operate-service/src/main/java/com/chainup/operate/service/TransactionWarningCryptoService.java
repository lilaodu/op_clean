package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.stats.entity.TransactionWarningCrypto;
import com.chainup.common.exchange.entity.TransactionWarningCryptoExample;

/**
 * Created by zhangkezhu on 2017/10/31.
 */
public interface TransactionWarningCryptoService {
    /**
     * 添加
     *
     * @param TransactionWarningCrypto
     */
    void add(TransactionWarningCrypto transactionWarningCrypto);

    TransactionWarningCrypto findOneByCyId(int CyId);

}
