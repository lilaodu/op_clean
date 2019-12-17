package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * order->side 订单买卖方向取值 Created by zhongjingyun on 2017/09/14.
 */
public enum OrderSide {
	BUY("BUY", "trade.buy", "买入"),
	SELL("SELL", "trade.sell", "卖出");

	public String	value;
	public String	languageKey;
	public String	description;

	private OrderSide(String value, String languageKey, String description) {
		this.value = value;
		this.languageKey = languageKey;
		this.description = description;
	}

	public String getLanguageKey() {
		return languageKey;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static OrderSide fromValue(String value) {
		if (StringUtils.isBlank(value))
			return null;
		for (OrderSide t : OrderSide.values()) {
			if (t.value.equals(value)) {
				return t;
			}
		}
		return null;
	}

	public static OrderSide fromName(String name) {
		for (OrderSide t : OrderSide.values()) {
			if (t.name().equals(name)) {
				return t;
			}
		}
		return null;
	}
	
	public static Map<String, String> getMap(){
		Map<String, String> map=new LinkedHashMap<String, String>();
		for (OrderSide t : OrderSide.values()) {
			map.put(t.value, t.languageKey);
		}
		return map;
	}
	
}
