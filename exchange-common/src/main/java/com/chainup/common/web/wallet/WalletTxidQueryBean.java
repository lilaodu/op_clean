package com.chainup.common.web.wallet;

import java.util.List;

public class WalletTxidQueryBean {

	private String amount;
	private String blockhash;
	private String blocktime;
	private String confirmations;
	private String hex;
	private String txid;
	private List<WalletDetailsBean> details;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBlockhash() {
		return blockhash;
	}
	public void setBlockhash(String blockhash) {
		this.blockhash = blockhash;
	}
	public String getBlocktime() {
		return blocktime;
	}
	public void setBlocktime(String blocktime) {
		this.blocktime = blocktime;
	}
	public String getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public List<WalletDetailsBean> getDetails() {
		return details;
	}
	public void setDetails(List<WalletDetailsBean> details) {
		this.details = details;
	}

	
}
