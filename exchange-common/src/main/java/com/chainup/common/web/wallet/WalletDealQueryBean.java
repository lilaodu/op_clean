package com.chainup.common.web.wallet;

public class WalletDealQueryBean {
	private String from;
	private String to;
	private String money;
	private String confirmedtime;
	private String txid;
	
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getConfirmedtime() {
		return confirmedtime;
	}
	public void setConfirmedtime(String confirmedtime) {
		this.confirmedtime = confirmedtime;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	

}
