package com.chainup.common.enums;

public enum Status {
	/** 停用 */
	CLOSED(0, "停用"),
	/** 开启 */
	OPEN(1, "开启"),

	;
	private final int		value;
	private final String	description;

	private Status(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

}
