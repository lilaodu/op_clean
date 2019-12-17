package com.chainup.common.stats.entity;

public class SourceSymbol {

	private int id;              //关系表ID
	
	private int riskSourceId;     //来源网站ID
	
	private int riskSymbolId;     //币对ID
	
	private String wsReqUrl;      //websocket 请求地址
	
	private String wsReqMsg;      //websocket 请求参数
	
	private String httpReqUrl;    //http请求地址
	
	private String reqType;       //请求类型  ws 为websocket  http为http请求
	
	private String sourceName;    //来源网站名称
	
	private String sourceUrl;     //来源网站网址
	
	private Boolean status;	      //风控监控状态
	
	private String symbol;		  //币对
	
	private String symbolName;    //币对名称
	
	private String targetSymbol;  //目标币

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRiskSourceId() {
		return riskSourceId;
	}

	public void setRiskSourceId(int riskSourceId) {
		this.riskSourceId = riskSourceId;
	}

	public int getRiskSymbolId() {
		return riskSymbolId;
	}

	public void setRiskSymbolId(int riskSymbolId) {
		this.riskSymbolId = riskSymbolId;
	}

	public String getWsReqUrl() {
		return wsReqUrl;
	}

	public void setWsReqUrl(String wsReqUrl) {
		this.wsReqUrl = wsReqUrl;
	}

	public String getWsReqMsg() {
		return wsReqMsg;
	}

	public void setWsReqMsg(String wsReqMsg) {
		this.wsReqMsg = wsReqMsg;
	}

	public String getHttpReqUrl() {
		return httpReqUrl;
	}

	public void setHttpReqUrl(String httpReqUrl) {
		this.httpReqUrl = httpReqUrl;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getTargetSymbol() {
		return targetSymbol;
	}

	public void setTargetSymbol(String targetSymbol) {
		this.targetSymbol = targetSymbol;
	}
}
