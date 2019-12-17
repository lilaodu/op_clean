package com.chainup.common.exchange.entity;

public class Risk {

	private String sourceName; //监控网站名称
	
	private String sourceUrl; //监控网站的API地址
	
	private String type;  //币对类型
	
    private String req;	  //火币网请求sub
    
    private Long id;      //火币网请求ID

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}
}
