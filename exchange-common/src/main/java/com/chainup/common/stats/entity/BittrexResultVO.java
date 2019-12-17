package com.chainup.common.stats.entity;

import java.util.List;

public class BittrexResultVO {
	
	private String success;
	
	private String message;
	
	private List<BittrexMarketResultVO> result;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<BittrexMarketResultVO> getResult() {
		return result;
	}

	public void setResult(List<BittrexMarketResultVO> result) {
		this.result = result;
	}

}
