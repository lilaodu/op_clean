package com.chainup.common.enums;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

/**
 * ex_symbol表，费用类型 Created by nob
 */
public enum SymbolAppType {

	/** 场外交易手最高续费 */
	OTC("OTC", "场外");
	public String	value;
	public String	description;	// 账户类型描述

	private SymbolAppType(String value, String description) {
		this.value = value;
		this.description = description;
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

	public static SymbolAppType fromValue(Integer value) {
		for (SymbolAppType t : SymbolAppType.values()) {
			if (t.value.equals(value)) {
				return t;
			}
		}
		return null;
	}

	public static SymbolAppType fromName(String name) {
		if (name == null) {
			return null;
		}
		for (SymbolAppType t : SymbolAppType.values()) {
			if (t.name().equalsIgnoreCase(name.trim())) {
				return t;
			}
		}
		return null;
	}

}
