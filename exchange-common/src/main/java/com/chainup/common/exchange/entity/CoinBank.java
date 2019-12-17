package com.chainup.common.exchange.entity;

import java.util.Date;

public class CoinBank {
    private Integer id;

    private Integer parentId;

    private String name;

    private String website;

    private String contactName;

    private String contactPhoneNumber;

    private String validateCode;

    private Byte level;

    private Date ctime;

    private Date mtime;

    private String nopassreason;

    private Byte status;

    private Integer uid;

    private Integer code;

    private Byte feeAutoAudit;

    private Byte levelAutoAudit;

    private byte[] imgUrl;
    
    private String imgUrlPhoto;
    	private long  np;
    	private Integer projectAmount;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber == null ? null : contactPhoneNumber.trim();
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode == null ? null : validateCode.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public String getNopassreason() {
        return nopassreason;
    }

    public void setNopassreason(String nopassreason) {
        this.nopassreason = nopassreason == null ? null : nopassreason.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Byte getFeeAutoAudit() {
        return feeAutoAudit;
    }

    public void setFeeAutoAudit(Byte feeAutoAudit) {
        this.feeAutoAudit = feeAutoAudit;
    }

    public Byte getLevelAutoAudit() {
        return levelAutoAudit;
    }

    public void setLevelAutoAudit(Byte levelAutoAudit) {
        this.levelAutoAudit = levelAutoAudit;
    }

    public byte[] getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(byte[] imgUrl) {
        this.imgUrl = imgUrl;
    }

	public String getImgUrlPhoto() {
		return imgUrlPhoto;
	}

	public void setImgUrlPhoto(String imgUrlPhoto) {
		this.imgUrlPhoto = imgUrlPhoto;
	}

	public long getNp() {
		return np;
	}

	public void setNp(long np) {
		this.np = np;
	}

	public Integer getProjectAmount() {
		return projectAmount;
	}

	public void setProjectAmount(Integer projectAmount) {
		this.projectAmount = projectAmount;
	}
    

}