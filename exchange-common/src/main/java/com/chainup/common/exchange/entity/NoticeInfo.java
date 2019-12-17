package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class NoticeInfo implements Serializable {
    private Integer id;

    @Length(max=200)
    @NotEmpty
    private String title;

    private String content;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @NotEmpty
    private Date stime;

    @Length(max=100)
    @NotEmpty
    private String lang;

    private String httpUrl;
    
    private static final long serialVersionUID = 1L;

    public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public static class Builder {
        private NoticeInfo obj;

        public Builder() {
            this.obj = new NoticeInfo();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
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

        public Builder stime(Date stime) {
            obj.stime = stime;
            return this;
        }

        public Builder lang(String lang) {
            obj.lang = lang;
            return this;
        }

        public Builder content(String content) {
            obj.content = content;
            return this;
        }

        public NoticeInfo build() {
            return this.obj;
        }
    }
}