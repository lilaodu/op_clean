package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class CmsArticle implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer articleTypeId;

    @Length(max=100)
    @NotEmpty
    private String title;

    @NotEmpty
    private Integer publisherId;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    private String content;
    
    private String articleTypeName;
    
    private String publisher;
    
    private String fileName;
     
    @NotEmpty
    private Integer footerFlag;
    
    @NotEmpty
    private String lang;

    @NotEmpty
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getArticleTypeName() {
		return articleTypeName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getFooterFlag() {
		return footerFlag;
	}

	public void setFooterFlag(Integer footerFlag) {
		this.footerFlag = footerFlag;
	}

	public void setArticleTypeName(String articleTypeName) {
		this.articleTypeName = articleTypeName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public static class Builder {
        private CmsArticle obj;

        public Builder() {
            this.obj = new CmsArticle();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder articleTypeId(Integer articleTypeId) {
            obj.articleTypeId = articleTypeId;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
            return this;
        }

        public Builder publisherId(Integer publisherId) {
            obj.publisherId = publisherId;
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

        public Builder content(String content) {
            obj.content = content;
            return this;
        }

        public Builder sort(Integer sort) {
            obj.sort = sort;
            return this;
        }

        public CmsArticle build() {
            return this.obj;
        }
    }
}