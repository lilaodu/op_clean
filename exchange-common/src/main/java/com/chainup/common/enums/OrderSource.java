package com.chainup.common.enums;

/**
 * order->source 订单来源
 * Created by zhongjingyun on 2017/09/29.
 */
public enum OrderSource {
	WEB(1,"WEB"),
	APP(2,"手机"),
	API(3,"接口");
	//STOP(3,"止盈止损委托");

    public int value;
    public String description;

    OrderSource(int value, String description) {
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
    public static OrderSource fromValue(int value) {
        for (OrderSource t : OrderSource.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static OrderSource fromName(String name) {
    	for (OrderSource t : OrderSource.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
