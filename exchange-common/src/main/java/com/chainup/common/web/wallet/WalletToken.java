package com.chainup.common.web.wallet;

public class WalletToken {

	private String code;
	private WalletTokenBean data;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public WalletTokenBean getData() {
		return data;
	}
	public void setData(WalletTokenBean data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
