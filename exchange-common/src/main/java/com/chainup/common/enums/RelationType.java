package com.chainup.common.enums;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Lists;


/**
 * 场外交易用户关系
 * @author Jennifer
 *
 */
public enum RelationType {

	/** 好友 */
	FRIENDS("FRIENDS", "好友", true),
	/** 黑名单 */
	BLACKLIST("BLACKLIST", "黑名单", true),
	/** 陌生人 */
	STRANGER("STRANGER", "陌生人", true),

	;
	public String	value;
	public String	description;
	/** 是否启用 */
	public boolean	used;

	private RelationType(String value, String description, boolean used) {
		this.value = value;
		this.description = description;
		this.used = used;
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

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	/**
	 * 获取所有已启用的货币种类
	 * 
	 * @return
	 */
	public List<RelationType> getUsedCurrency() {
		List<RelationType> rst = Lists.newArrayList();
		for (RelationType currency : RelationType.values()) {
			if (currency.isUsed()) {
				rst.add(currency);
			}
		}
		return rst;
	}
	
	public static RelationType fromValue(String relationType) {
		if (StringUtils.isBlank(relationType))
			return null;
		for (RelationType t : RelationType.values()) {
			if (t.value.equalsIgnoreCase(relationType)) {
				return t;
			}
		}
		return null;
	}
}
