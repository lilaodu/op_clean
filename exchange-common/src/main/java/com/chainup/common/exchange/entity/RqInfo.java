package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class RqInfo implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer userId;

    @Length(max=200)
    @NotEmpty
    private String rqTitle;

    @Length(max=2048)
    @NotEmpty
    private String rqDescribe;

    @NotEmpty
    private Byte rqType; // 问题类型：1.意见与建议 2.充值提现 3.交易相关 4.安全相关 5.个人信息 6.实名认证

    @NotEmpty
    private Byte rqStatus; // 问题状态：1-等待客服回复 2-客服已回复 3-问题已关闭

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;
    
    private String userName; // 工单提交人
    
    private String rqTypeName;
    
    private String rqStatusName;
    
    private byte[] imageData; //工单上传的图片
    
    private String imageDataStr;//工单上传的图片

    private static final long serialVersionUID = 1L;

    
    @Override
	public String toString() {
		return "RqInfo [id=" + id + ", userId=" + userId + ", rqTitle=" + rqTitle + ", rqDescribe=" + rqDescribe
				+ ", rqType=" + rqType + ", rqStatus=" + rqStatus + ", ctime=" + ctime + ", mtime=" + mtime
				+ ", userName=" + userName + ", rqTypeName=" + rqTypeName + ", rqStatusName=" + rqStatusName
				+ ", imageData=" + Arrays.toString(imageData) + ", imageDataStr=" + imageDataStr + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImageDataStr() {
		return imageDataStr;
	}

	public void setImageDataStr(String imageDataStr) {
		this.imageDataStr = imageDataStr;
	}

	public String getRqTitle() {
        return rqTitle;
    }

    public void setRqTitle(String rqTitle) {
        this.rqTitle = rqTitle == null ? null : rqTitle.trim();
    }

    public String getRqDescribe() {
        return rqDescribe;
    }

    public void setRqDescribe(String rqDescribe) {
        this.rqDescribe = rqDescribe == null ? null : rqDescribe.trim();
    }

    public Byte getRqType() {
        return rqType;
    }

    public void setRqType(Byte rqType) {
        this.rqType = rqType;
    }

    public Byte getRqStatus() {
        return rqStatus;
    }

    public void setRqStatus(Byte rqStatus) {
        this.rqStatus = rqStatus;
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

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public String getRqTypeName() {
		return rqTypeName;
	}

	public void setRqTypeName(String rqTypeName) {
		this.rqTypeName = rqTypeName;
	}

	public String getRqStatusName() {
		return rqStatusName;
	}

	public void setRqStatusName(String rqStatusName) {
		this.rqStatusName = rqStatusName;
	}

	public static class Builder {
        private RqInfo obj;

        public Builder() {
            this.obj = new RqInfo();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            obj.userId = userId;
            return this;
        }

        public Builder rqTitle(String rqTitle) {
            obj.rqTitle = rqTitle;
            return this;
        }

        public Builder rqDescribe(String rqDescribe) {
            obj.rqDescribe = rqDescribe;
            return this;
        }

        public Builder rqType(Byte rqType) {
            obj.rqType = rqType;
            return this;
        }

        public Builder rqStatus(Byte rqStatus) {
            obj.rqStatus = rqStatus;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public RqInfo build() {
            return this.obj;
        }
    }
}