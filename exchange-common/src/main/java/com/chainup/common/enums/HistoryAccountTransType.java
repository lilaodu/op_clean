package com.chainup.common.enums;

/**
 * account表，type 账号类型
 * Created by zhongjingyun on 2017/09/12.
 */
public enum HistoryAccountTransType {
	INCREASE(1,"转入，增加"),DECREASE(2,"转出，减少");

    public int value;
    public String description;

    HistoryAccountTransType(int value, String description) {
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
