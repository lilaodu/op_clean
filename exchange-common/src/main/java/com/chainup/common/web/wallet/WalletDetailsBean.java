package com.chainup.common.web.wallet;

public class WalletDetailsBean {
	
	 private String address;
	 private String amount;
	 private String category;
	 private String txtype;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTxtype() {
		return txtype;
	}
	public void setTxtype(String txtype) {
		this.txtype = txtype;
	}
	 

}
