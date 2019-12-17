package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminOperationLog implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer managerId;

    @NotEmpty
    private Integer userId;

    @NotEmpty
    private Integer eventType;

    @Length(max=255)
    @NotEmpty
    private String frontDesc;

    @Length(max=255)
    @NotEmpty
    private String behindDesc;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public String getFrontDesc() {
        return frontDesc;
    }

    public void setFrontDesc(String frontDesc) {
        this.frontDesc = frontDesc == null ? null : frontDesc.trim();
    }

    public String getBehindDesc() {
        return behindDesc;
    }

    public void setBehindDesc(String behindDesc) {
        this.behindDesc = behindDesc == null ? null : behindDesc.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private AdminOperationLog obj;

        public Builder() {
            this.obj = new AdminOperationLog();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder managerId(Integer managerId) {
            obj.managerId = managerId;
            return this;
        }

        public Builder userId(Integer userId) {
            obj.userId = userId;
            return this;
        }

        public Builder eventType(Integer eventType) {
            obj.eventType = eventType;
            return this;
        }

        public Builder frontDesc(String frontDesc) {
            obj.frontDesc = frontDesc;
            return this;
        }

        public Builder behindDesc(String behindDesc) {
            obj.behindDesc = behindDesc;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public AdminOperationLog build() {
            return this.obj;
        }
    }
}