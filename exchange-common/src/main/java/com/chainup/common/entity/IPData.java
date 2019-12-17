package com.chainup.common.entity;

public class IPData {
    private Long 	minIP;
    private Long 	maxIP;
    private String 	address;
    private String 	operate;
	public Long getMinIP() {
		return minIP;
	}
	public void setMinIP(Long minIP) {
		this.minIP = minIP;
	}
	public Long getMaxIP() {
		return maxIP;
	}
	public void setMaxIP(Long maxIP) {
		this.maxIP = maxIP;
	}
	public String getAddress() {
		return address==null?"":address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOperate() {
		return operate==null?"":operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
}