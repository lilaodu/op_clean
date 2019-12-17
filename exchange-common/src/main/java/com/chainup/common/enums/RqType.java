package com.chainup.common.enums;

/**
 * 问题类型
 *
 * @author Autorun
 */
public enum RqType {
    proposal(1, "意见与建议"),
    cash(2, "充值提现"),
    transaction(3, "交易相关"),
    security(4, "安全相关"),
    personal(5, "个人信息"),
    certification(6, "实名认证"),
    OTC(7, "场外交易");

    public int value;
    public String description;

    RqType(int value, String description) {
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
