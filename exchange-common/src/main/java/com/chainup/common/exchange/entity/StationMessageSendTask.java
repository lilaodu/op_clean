package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class StationMessageSendTask implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer receiveUid;

    @NotEmpty
    private Integer messageContentId;

    @NotEmpty
    private Byte sendStatus;

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

    public Integer getMessageContentId() {
        return messageContentId;
    }

    public void setMessageContentId(Integer messageContentId) {
        this.messageContentId = messageContentId;
    }

    public Byte getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private StationMessageSendTask obj;

        public Builder() {
            this.obj = new StationMessageSendTask();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder receiveUid(Integer receiveUid) {
            obj.receiveUid = receiveUid;
            return this;
        }

        public Builder messageContentId(Integer messageContentId) {
            obj.messageContentId = messageContentId;
            return this;
        }

        public Builder sendStatus(Byte sendStatus) {
            obj.sendStatus = sendStatus;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public StationMessageSendTask build() {
            return this.obj;
        }
    }
}