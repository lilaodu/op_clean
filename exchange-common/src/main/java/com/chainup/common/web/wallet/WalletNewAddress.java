package com.chainup.common.web.wallet;

public class WalletNewAddress {

	private String code;
	private WalletNewAddressBean data;
	private String message;
	private String success;
	private String address;
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public WalletNewAddressBean getData() {
		return data;
	}
	public void setData(WalletNewAddressBean data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
