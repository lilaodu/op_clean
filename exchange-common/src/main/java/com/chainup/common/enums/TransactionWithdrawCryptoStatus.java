package com.chainup.common.enums;

/**
 * transaction_withdraw_crypto->status 虚拟币提现状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum TransactionWithdrawCryptoStatus {
    NOT_CHECK(0, "fund.withdrawCrypto.status.notcheck", "未审核"),
    CHECK_PASS(1, "fund.withdrawCrypto.status.pass", "已审核"),
    CHECK_REJECT(2, "fund.withdrawCrypto.status.reject", "审核拒绝"),
    PAYING(3, "fund.withdrawCrypto.status.paying", "支付中"),
    PAY_FAIL(4, "fund.withdrawCrypto.status.payfail", "支付失败"),
    SUCCESS(5, "fund.withdrawCrypto.status.succ", "已完成"),
    CANCELLED(6, "fund.withdrawCrypto.status.cancelled", "已撤销");

    public int value;
    public String languageKey;
    public String description;

    TransactionWithdrawCryptoStatus(int value, String languageKey, String description) {
        this.value = value;
        this.languageKey = languageKey;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static TransactionWithdrawCryptoStatus fromValue(int value) {
        for (TransactionWithdrawCryptoStatus t : TransactionWithdrawCryptoStatus.values()) {
            if (t.value == value) {
                return t;
            }
        }
        return null;
    }
    
    public static TransactionWithdrawCryptoStatus fromName(String name) {
        if (name == null) {
            return null;
        }
        for (TransactionWithdrawCryptoStatus t : TransactionWithdrawCryptoStatus.values()) {
            if (t.name().equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }
}
