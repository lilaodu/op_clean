package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @author Solar
*/
public class SystemScheduleJob implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 任务分组
     */
    private String jobGroup;

    /**
     * 任务状态,是否启动任务(1才会启动该任务)
     */
    private Boolean jobStatus;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 描述
     */
    private String description;

    /**
     * 任务是否有状态,默认为1(根据状态生成不同实例)
     */
    private Boolean isConcurrent;

    /**
     * 定时器请求地址
     */
    private String url;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    public Boolean getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Boolean jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIsConcurrent() {
        return isConcurrent;
    }

    public void setIsConcurrent(Boolean isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public static class Builder {
        private SystemScheduleJob obj;

        public Builder() {
            this.obj = new SystemScheduleJob();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder jobName(String jobName) {
            obj.jobName = jobName;
            return this;
        }

        public Builder jobGroup(String jobGroup) {
            obj.jobGroup = jobGroup;
            return this;
        }

        public Builder jobStatus(Boolean jobStatus) {
            obj.jobStatus = jobStatus;
            return this;
        }

        public Builder cronExpression(String cronExpression) {
            obj.cronExpression = cronExpression;
            return this;
        }

        public Builder description(String description) {
            obj.description = description;
            return this;
        }

        public Builder isConcurrent(Boolean isConcurrent) {
            obj.isConcurrent = isConcurrent;
            return this;
        }

        public Builder url(String url) {
            obj.url = url;
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.createTime = createTime;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            obj.updateTime = updateTime;
            return this;
        }

        public Builder createBy(String createBy) {
            obj.createBy = createBy;
            return this;
        }

        public Builder updateBy(String updateBy) {
            obj.updateBy = updateBy;
            return this;
        }

        public SystemScheduleJob build() {
            return this.obj;
        }
    }
}