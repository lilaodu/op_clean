package com.chainup.common.exchange.entity;

import java.util.Date;

import org.springframework.data.annotation.Transient;

public class HKDTCompetition {
	 private Integer id;

	    private Integer uid;

	    private Byte status;

	    private Date ctime;

	    private Date mtime;

	    private Integer score;
	    
	    @Transient
	    private String email;
	    @Transient
	    private String mobileNumber;
	    

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

	    public Byte getStatus() {
	        return status;
	    }

	    public void setStatus(Byte status) {
	        this.status = status;
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

	    public Integer getScore() {
	        return score;
	    }

	    public void setScore(Integer score) {
	        this.score = score;
	    }

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
	    
}