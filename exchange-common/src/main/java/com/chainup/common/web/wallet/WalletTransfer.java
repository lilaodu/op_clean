package com.chainup.common.web.wallet;


public class WalletTransfer {

	private String code;
	private WalletTransferBean data;
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
	public WalletTransferBean getData() {
		return data;
	}
	public void setData(WalletTransferBean data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WalletTransfer [code=" + code + ", data=" + data + ", message=" + message + "]";
	}
	
}
