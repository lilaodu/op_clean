package com.chainup.common.enums;

/**
 * order->status 订单状态取值
 * Created by zhongjingyun on 2017/09/14.
 */
public enum OrderStatus {
	INIT(0,"trade.order.status.init","初始订单"),
	NEW_(1,"trade.order.status.new","新订单"),
	FILLED(2,"trade.order.status.filled","完全成交"),
	PART_FILLED(3,"trade.order.status.part.filled","部分成交"),
	CANCELED(4,"trade.order.status.canceled","已撤单"),
	PENDING_CANCEL(5,"trade.order.status.cancel","待撤单"),
	EXPIRED(6,"trade.order.status.expired","异常订单");

    public int value;
    public String languageKey;
    public String description;

    OrderStatus(int value, String languageKey, String description) {
        this.value = value;
        this.languageKey=languageKey;
        this.description = description;
    }

    public String getLanguageKey() {
		return languageKey;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
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
    
    public static OrderStatus fromValue(int value) {
        for (OrderStatus t : OrderStatus.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static OrderStatus fromName(String name) {
    	for (OrderStatus t : OrderStatus.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
