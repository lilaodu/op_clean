package com.chainup.common.web.wallet;

public class WalletBalance {

	private String code;
	private WalletBalanceBean data;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public WalletBalanceBean getData() {
		return data;
	}
	public void setData(WalletBalanceBean data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
