package com.chainup.common.enums;

/**
 * transaction_deposit->status 法币充值状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum TransactionDepositRiskStatus {
    NOT_ARRIVE(0,"未到账"),
    ARRIVE(1,"已到账");

    public int value;
    public String description;

    TransactionDepositRiskStatus(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static TransactionDepositStatus fromValue(int value){
        for (TransactionDepositStatus t : TransactionDepositStatus.values()) {
            if (t.value==value) {
                return t;
            }
        }
        return null;
    }
}
