package com.chainup.common.enums;

public enum OpenStatus {
	/** 停用 */
	OFF("OFF", "停用"),
	/** 开启 */
	ON("ON", "开启"),

	;
	private final String	value;
	private final String	description;

	private OpenStatus(String value, String description) {
		this.value = value;
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

}
