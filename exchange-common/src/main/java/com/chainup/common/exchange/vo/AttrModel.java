package com.chainup.common.exchange.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class AttrModel implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ApiModelProperty(value = "支付方式/币种 的key,传给后台的值")
	private String				key;

	@ApiModelProperty(value = "前台显示的值")
	private String				title;

	@ApiModelProperty(value = "图标")
	private String				icon;

	@ApiModelProperty(value = "是否启用")
	private boolean				used;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

}
