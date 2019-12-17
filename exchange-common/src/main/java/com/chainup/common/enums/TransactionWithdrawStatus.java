package com.chainup.common.enums;

/**
 * transaction_withdraw->status 法币提现状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum TransactionWithdrawStatus {
    NOT_CHECK(0, "未审核"),
    CHECK_PASS(1, "审核通过"),
    CHECK_REJECT(2, "审核拒绝"),
    REMITTING(3, "汇款中"),
    SUCCESS(4, "已完成"),
    REMIT_FAIL(5, "汇款失败");

    public int value;
    public String description;

    TransactionWithdrawStatus(int value, String description) {
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

    public static TransactionWithdrawStatus fromValue(int value) {
        for (TransactionWithdrawStatus t : TransactionWithdrawStatus.values()) {
            if (t.value == value) {
                return t;
            }
        }
        return null;
    }
}
