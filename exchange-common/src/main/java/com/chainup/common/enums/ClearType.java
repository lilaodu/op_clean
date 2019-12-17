package com.chainup.common.enums;

public enum ClearType {

	CLEAR_ORDER(1),
	CLEAR_HISTORY_ACCOUNT(2),
	CLEAR_TRADES(3),
	CLEAR_TRANSACTION(4);
	
	private Integer value;

	private ClearType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
	
}
