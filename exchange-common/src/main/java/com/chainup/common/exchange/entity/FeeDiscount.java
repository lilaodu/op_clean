package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @author Solar
*/
public class FeeDiscount implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 折扣，100表示不打折
     */
    private Double rate;

    /**
     * 是否有效，0表示无效，1表示生效
     */
    private Byte status;

    /**
     * 有效期开始时间
     */
    private Date beginTime;

    /**
     * 有效时间： 结束时间
     */
    private Date endTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 创建时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "FeeDiscount{" +
                "id=" + id +
                ", uid=" + uid +
                ", rate=" + rate +
                ", status=" + status +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", remark='" + remark + '\'' +
                ", mtime=" + mtime +
                ", ctime=" + ctime +
                '}';
    }

    public static class Builder {
        private FeeDiscount obj;

        public Builder() {
            this.obj = new FeeDiscount();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder rate(Double rate) {
            obj.rate = rate;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public Builder beginTime(Date beginTime) {
            obj.beginTime = beginTime;
            return this;
        }

        public Builder endTime(Date endTime) {
            obj.endTime = endTime;
            return this;
        }

        public Builder remark(String remark) {
            obj.remark = remark;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public FeeDiscount build() {
            return this.obj;
        }
    }
}