package com.chainup.common.stats.entity;

import java.util.List;

public class OkexResultVO {
	
	private int code;
	
	private String detailMsg;
	
	private String msg;
	
	private List<OkexMarketResultVO> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDetailMsg() {
		return detailMsg;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<OkexMarketResultVO> getData() {
		return data;
	}

	public void setData(List<OkexMarketResultVO> data) {
		this.data = data;
	}

}
