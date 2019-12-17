package com.chainup.common.enums;

public enum VictoryStatus {

	/** 不计胜负 */
	ALL("ALL", true, "不计胜负"),
	/** 买家胜 */
	BUYER("BUYER", true, "买家胜"),
	/** 卖家胜 **/
	SELLER("SELLER", true, "卖家胜"),

	;

	public String	value;
	public boolean	used;
	public String	description;

	private VictoryStatus(String value, boolean used, String description) {
		this.value = value;
		this.used = used;
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
