package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class RqReply implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer rqId;

    private Byte userType;

    @NotEmpty
    private Integer userId;

    @Length(max=1000)
    @NotEmpty
    private String replayContent;

    @NotEmpty
    private Date ctime;
    
    private String userName; // 工单回复用户
    
    private String imageData; //工单上传的图片

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRqId() {
        return rqId;
    }

    public void setRqId(Integer rqId) {
        this.rqId = rqId;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReplayContent() {
        return replayContent;
    }

    public void setReplayContent(String replayContent) {
        this.replayContent = replayContent == null ? null : replayContent.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static class Builder {
        private RqReply obj;

        public Builder() {
            this.obj = new RqReply();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder rqId(Integer rqId) {
            obj.rqId = rqId;
            return this;
        }

        public Builder userType(Byte userType) {
            obj.userType = userType;
            return this;
        }

        public Builder userId(Integer userId) {
            obj.userId = userId;
            return this;
        }

        public Builder replayContent(String replayContent) {
            obj.replayContent = replayContent;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public RqReply build() {
            return this.obj;
        }
    }
}