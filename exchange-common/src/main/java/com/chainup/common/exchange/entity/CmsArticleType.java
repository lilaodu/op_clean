package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class CmsArticleType implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer parentId;

    @Length(max=50)
    @NotEmpty
    private String articleTypeName;

    @NotEmpty
    private Integer sortId;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;
    
    @NotEmpty
    private Integer lang;
    
    private String parentName;
    
    List<CmsArticle> cmsArticleList;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName == null ? null : articleTypeName.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
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

    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}



	public List<CmsArticle> getCmsArticleList() {
		return cmsArticleList;
	}

	public void setCmsArticleList(List<CmsArticle> cmsArticleList) {
		this.cmsArticleList = cmsArticleList;
	}

	public Integer getLang() {
		return lang;
	}

	public void setLang(Integer lang) {
		this.lang = lang;
	}



	public static class Builder {
        private CmsArticleType obj;

        public Builder() {
            this.obj = new CmsArticleType();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder parentId(Integer parentId) {
            obj.parentId = parentId;
            return this;
        }

        public Builder articleTypeName(String articleTypeName) {
            obj.articleTypeName = articleTypeName;
            return this;
        }

        public Builder sortId(Integer sortId) {
            obj.sortId = sortId;
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

        public CmsArticleType build() {
            return this.obj;
        }
    }
}