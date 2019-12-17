package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

public class StationMessage implements Serializable {
    private Integer id;

    private String sendContent;

    private Byte messageType;

    private Integer sendUid;

    private Date ctime;

    private String receiveUid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent == null ? null : sendContent.trim();
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public Integer getSendUid() {
        return sendUid;
    }

    public void setSendUid(Integer sendUid) {
        this.sendUid = sendUid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getReceiveUid() {
        return receiveUid;
    }

    public void setReceiveUid(String receiveUid) {
        this.receiveUid = receiveUid == null ? null : receiveUid.trim();
    }

    public static class Builder {
        private StationMessage obj;

        public Builder() {
            this.obj = new StationMessage();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder sendContent(String sendContent) {
            obj.sendContent = sendContent;
            return this;
        }

        public Builder messageType(Byte messageType) {
            obj.messageType = messageType;
            return this;
        }

        public Builder sendUid(Integer sendUid) {
            obj.sendUid = sendUid;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder receiveUid(String receiveUid) {
            obj.receiveUid = receiveUid;
            return this;
        }

        public StationMessage build() {
            return this.obj;
        }
    }
}