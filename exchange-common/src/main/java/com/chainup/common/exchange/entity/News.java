package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class News implements Serializable {
    private Integer id;

    @Length(max=100)
    @NotEmpty
    private String title;

    @Length(max=200)
    @NotEmpty
    private String indexImgUrl;

    @Length(max=50)
    @NotEmpty
    private String author;

    @Length(max=100)
    @NotEmpty
    private String source;

    @Length(max=200)
    @NotEmpty
    private String topic;

    @NotEmpty
    private Date ctime;

    private Date mtime;

    @NotEmpty
    private String lang;

    private String content;
    
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

    public String getIndexImgUrl() {
        return indexImgUrl;
    }

    public void setIndexImgUrl(String indexImgUrl) {
        this.indexImgUrl = indexImgUrl == null ? null : indexImgUrl.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
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

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public static class Builder {
        private News obj;

        public Builder() {
            this.obj = new News();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
            return this;
        }

        public Builder indexImgUrl(String indexImgUrl) {
            obj.indexImgUrl = indexImgUrl;
            return this;
        }

        public Builder author(String author) {
            obj.author = author;
            return this;
        }

        public Builder source(String source) {
            obj.source = source;
            return this;
        }

        public Builder topic(String topic) {
            obj.topic = topic;
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

        public Builder lang(String lang) {
            obj.lang = lang;
            return this;
        }

        public Builder content(String content) {
            obj.content = content;
            return this;
        }

        public News build() {
            return this.obj;
        }
    }
}