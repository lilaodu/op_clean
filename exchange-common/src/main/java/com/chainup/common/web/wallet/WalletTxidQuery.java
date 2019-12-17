package com.chainup.common.web.wallet;

public class WalletTxidQuery {

	private String code;
	private WalletTxidQueryBean data;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public WalletTxidQueryBean getData() {
		return data;
	}
	public void setData(WalletTxidQueryBean data) {
		this.data = data;
	}
	
}
