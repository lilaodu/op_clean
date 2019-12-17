package com.chainup.common.enums;

/**
 * order->type 订单委托类型取值
 * Created by zhongjingyun on 2017/09/14.
 */
public enum OrderType {
	LIMIT(1,"限价委托"),
	MARKET(2,"市价委托");
	//STOP(3,"止盈止损委托");

    public int value;
    public String description;

    OrderType(int value, String description) {
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
