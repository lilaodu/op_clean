package com.chainup.common.web.wallet;

import java.util.List;

public class WalletDealQuery {

	private String code;
	private List<WalletDealQueryBean> data;
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
	public List<WalletDealQueryBean> getData() {
		return data;
	}
	public void setData(List<WalletDealQueryBean> data) {
		this.data = data;
	}
	
	
}
