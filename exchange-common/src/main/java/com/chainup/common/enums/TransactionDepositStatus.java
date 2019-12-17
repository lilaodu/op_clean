package com.chainup.common.enums;

/**
 * transaction_deposit_crypto->status 虚拟币充值状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum TransactionDepositStatus {
	NOT_VERIFY(0,"未确认"),
	VERIFY(1,"已完成");

    public int value;
    public String description;

    TransactionDepositStatus(int value, String description) {
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
}
