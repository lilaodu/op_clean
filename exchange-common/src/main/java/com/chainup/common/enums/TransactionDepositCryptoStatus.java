package com.chainup.common.enums;

/**
 * transaction_deposit->status 法币充值状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum TransactionDepositCryptoStatus {
	NOT_ARRIVE(0, "fund.depositCrypto.status.notarrive", "未到账"),
	ARRIVE(1, "fund.depositCrypto.status.arrive", "已到账");

    public int value;
    public String languageKey;
    public String description;

    TransactionDepositCryptoStatus(int value, String languageKey, String description) {
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

    public static TransactionDepositCryptoStatus fromValue(int value){
        for (TransactionDepositCryptoStatus t : TransactionDepositCryptoStatus.values()) {
            if (t.value==value) {
                return t;
            }
        }
        return null;
    }
}
