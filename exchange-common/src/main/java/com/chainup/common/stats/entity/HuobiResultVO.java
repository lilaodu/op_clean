package com.chainup.common.stats.entity;

import java.util.List;

public class HuobiResultVO {
	
	private int id;
	
	private String rep;
	
	private String status;
	
	private List<MarketResultVO> data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MarketResultVO> getData() {
		return data;
	}

	public void setData(List<MarketResultVO> data) {
		this.data = data;
	}
		
}
