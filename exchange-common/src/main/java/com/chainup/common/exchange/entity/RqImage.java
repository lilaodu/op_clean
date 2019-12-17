package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class RqImage implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer rqId;

    @NotEmpty
    private Byte type;

    @NotEmpty
    private Date ctime;

    private byte[] imageData;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public static class Builder {
        private RqImage obj;

        public Builder() {
            this.obj = new RqImage();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder rqId(Integer rqId) {
            obj.rqId = rqId;
            return this;
        }

        public Builder type(Byte type) {
            obj.type = type;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder imageData(byte[] imageData) {
            obj.imageData = imageData;
            return this;
        }

        public RqImage build() {
            return this.obj;
        }
    }
}