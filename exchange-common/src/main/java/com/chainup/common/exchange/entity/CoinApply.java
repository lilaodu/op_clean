package com.chainup.common.exchange.entity;

import java.util.Date;

/**
 * @author dy 上币申请entity 2018-5-26 12:07:34
 */
public class CoinApply {

	private Integer id;

	private Integer uid;

	private String projectteam;

	private String projectname;

	private String linkaddress;

	private String whitepaper;

	private String projectintroduction;

	private String country;

	private Integer exchangepurse;

	private Integer iserc20;

	private String noerc20description;

	private String newcontractaddress;

	private String totalamountmechanism;

	private Integer ismarketpromotion;

	private String marketpromotiondescription;

	private String communitylinks;

	private String browserllinks;

	private Integer israise;

	private String raisedescription;

	private Integer isico;

	private String icodescription;

	private Integer isrecommendation;

	private String recommendationdescription;

	private Date ctime;

	private String filenames;
	
	private String fileurl;
	
	private Date mtime;   //审核时间
	
	private Integer status; //申请状态
	
	private String reason;  //不通过原因
	
	
	public Date getMtime() {
		return mtime;
	}

	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFilenames() {
		return filenames;
	}

	public void setFilenames(String filenames) {
		this.filenames = filenames;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getProjectteam() {
		return projectteam;
	}

	public void setProjectteam(String projectteam) {
		this.projectteam = projectteam == null ? null : projectteam.trim();
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname == null ? null : projectname.trim();
	}

	public String getLinkaddress() {
		return linkaddress;
	}

	public void setLinkaddress(String linkaddress) {
		this.linkaddress = linkaddress == null ? null : linkaddress.trim();
	}

	public String getWhitepaper() {
		return whitepaper;
	}

	public void setWhitepaper(String whitepaper) {
		this.whitepaper = whitepaper == null ? null : whitepaper.trim();
	}

	public String getProjectintroduction() {
		return projectintroduction;
	}

	public void setProjectintroduction(String projectintroduction) {
		this.projectintroduction = projectintroduction == null ? null : projectintroduction.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public Integer getExchangepurse() {
		return exchangepurse;
	}

	public void setExchangepurse(Integer exchangepurse) {
		this.exchangepurse = exchangepurse;
	}

	public Integer getIserc20() {
		return iserc20;
	}

	public void setIserc20(Integer iserc20) {
		this.iserc20 = iserc20;
	}

	public String getNoerc20description() {
		return noerc20description;
	}

	public void setNoerc20description(String noerc20description) {
		this.noerc20description = noerc20description == null ? null : noerc20description.trim();
	}

	public String getNewcontractaddress() {
		return newcontractaddress;
	}

	public void setNewcontractaddress(String newcontractaddress) {
		this.newcontractaddress = newcontractaddress == null ? null : newcontractaddress.trim();
	}

	public String getTotalamountmechanism() {
		return totalamountmechanism;
	}

	public void setTotalamountmechanism(String totalamountmechanism) {
		this.totalamountmechanism = totalamountmechanism == null ? null : totalamountmechanism.trim();
	}

	public Integer getIsmarketpromotion() {
		return ismarketpromotion;
	}

	public void setIsmarketpromotion(Integer ismarketpromotion) {
		this.ismarketpromotion = ismarketpromotion;
	}

	public String getMarketpromotiondescription() {
		return marketpromotiondescription;
	}

	public void setMarketpromotiondescription(String marketpromotiondescription) {
		this.marketpromotiondescription = marketpromotiondescription == null ? null : marketpromotiondescription.trim();
	}

	public String getCommunitylinks() {
		return communitylinks;
	}

	public void setCommunitylinks(String communitylinks) {
		this.communitylinks = communitylinks == null ? null : communitylinks.trim();
	}

	public String getBrowserllinks() {
		return browserllinks;
	}

	public void setBrowserllinks(String browserllinks) {
		this.browserllinks = browserllinks == null ? null : browserllinks.trim();
	}

	public Integer getIsraise() {
		return israise;
	}

	public void setIsraise(Integer israise) {
		this.israise = israise;
	}

	public String getRaisedescription() {
		return raisedescription;
	}

	public void setRaisedescription(String raisedescription) {
		this.raisedescription = raisedescription == null ? null : raisedescription.trim();
	}

	public Integer getIsico() {
		return isico;
	}

	public void setIsico(Integer isico) {
		this.isico = isico;
	}

	public String getIcodescription() {
		return icodescription;
	}

	public void setIcodescription(String icodescription) {
		this.icodescription = icodescription == null ? null : icodescription.trim();
	}

	public Integer getIsrecommendation() {
		return isrecommendation;
	}

	public void setIsrecommendation(Integer isrecommendation) {
		this.isrecommendation = isrecommendation;
	}

	public String getRecommendationdescription() {
		return recommendationdescription;
	}

	public void setRecommendationdescription(String recommendationdescription) {
		this.recommendationdescription = recommendationdescription == null ? null : recommendationdescription.trim();
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

}
