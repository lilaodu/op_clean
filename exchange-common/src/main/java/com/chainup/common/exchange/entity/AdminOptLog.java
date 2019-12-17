package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminOptLog implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer eventUid;

    @Length(max=64)
    @NotEmpty
    private String eventTable;

    @NotEmpty
    private Integer eventType;

    @Length(max=16)
    @NotEmpty
    private String eventIp;

    @Length(max=1024)
    @NotEmpty
    private String eventDes;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventUid() {
        return eventUid;
    }

    public void setEventUid(Integer eventUid) {
        this.eventUid = eventUid;
    }

    public String getEventTable() {
        return eventTable;
    }

    public void setEventTable(String eventTable) {
        this.eventTable = eventTable == null ? null : eventTable.trim();
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public String getEventIp() {
        return eventIp;
    }

    public void setEventIp(String eventIp) {
        this.eventIp = eventIp == null ? null : eventIp.trim();
    }

    public String getEventDes() {
        return eventDes;
    }

    public void setEventDes(String eventDes) {
        this.eventDes = eventDes == null ? null : eventDes.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private AdminOptLog obj;

        public Builder() {
            this.obj = new AdminOptLog();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder eventUid(Integer eventUid) {
            obj.eventUid = eventUid;
            return this;
        }

        public Builder eventTable(String eventTable) {
            obj.eventTable = eventTable;
            return this;
        }

        public Builder eventType(Integer eventType) {
            obj.eventType = eventType;
            return this;
        }

        public Builder eventIp(String eventIp) {
            obj.eventIp = eventIp;
            return this;
        }

        public Builder eventDes(String eventDes) {
            obj.eventDes = eventDes;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public AdminOptLog build() {
            return this.obj;
        }
    }
}