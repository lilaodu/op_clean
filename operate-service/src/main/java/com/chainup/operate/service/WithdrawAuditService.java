package com.chainup.operate.service;

import com.chainup.common.enums.TransactionWithdrawCryptoStatus;
import com.chainup.common.exchange.entity.TransactionWithdraw;
import com.chainup.common.exchange.entity.TransactionWithdrawCrypto;

import java.util.List;

/**
 * 提现审核
 * Created by nob.
 */
public interface WithdrawAuditService {

    /**
     * 虚拟币提现警告等级
     * @return
     */
    List<Integer> withdrawCryptoWarningLevel(TransactionWithdrawCrypto withdrawCrypto);

    /**
     * 法币提现警告等级
     * @param withdraw
     * @return
     */
    List<Integer> withdrawWarningLevel(TransactionWithdraw withdraw);

    Integer warningLevelSum(List<Integer> levels);

    String warningLevelTxt(List<Integer> levels);

    /**
     * 提现审核
     * @param withdrawCrypto
     * @param willStatus 将要操作变成的状态
     * @return
     */
    boolean opreateAudit(TransactionWithdrawCrypto withdrawCrypto, TransactionWithdrawCryptoStatus willStatus) throws Exception;
}
