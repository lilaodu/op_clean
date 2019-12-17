package com.chainup.common.enums;

/**
 * 问题回复状态类
 *
 * @author Autorun
 */
public enum RqStatus {
    await(1, "待处理"),
    replied(2, "已回复"),
    closed(3, "已关闭");

    public int value;
    public String description;

    RqStatus(int value, String description) {
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
