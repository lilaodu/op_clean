package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserMessage implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer receiveUid;

    @NotEmpty
    private Byte messageType;

    @Length(max=500)
    @NotEmpty
    private String messageContent;

    @NotEmpty
    private Byte status;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiveUid() {
        return receiveUid;
    }

    public void setReceiveUid(Integer receiveUid) {
        this.receiveUid = receiveUid;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
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

    public static class Builder {
        private UserMessage obj;

        public Builder() {
            this.obj = new UserMessage();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder receiveUid(Integer receiveUid) {
            obj.receiveUid = receiveUid;
            return this;
        }

        public Builder messageType(Byte messageType) {
            obj.messageType = messageType;
            return this;
        }

        public Builder messageContent(String messageContent) {
            obj.messageContent = messageContent;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public UserMessage build() {
            return this.obj;
        }
    }
}