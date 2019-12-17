package com.chainup.common.exchange.entity;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class CmsAppAdvert implements Serializable {
    private Integer id;

    @Length(max=50)
    @NotEmpty
    private String title;

    @Length(max=7)
    @NotEmpty
    private String type;

    @Length(max=500)
    @NotEmpty
    private String imageUrl;

    @Length(max=500)
    @NotEmpty
    private String httpUrl;

    @NotEmpty
    private Integer sort;

    @Length(max=100)
    private String lang;

    private static final long serialVersionUID = 1L;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl == null ? null : httpUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public static class Builder {
        private CmsAppAdvert obj;

        public Builder() {
            this.obj = new CmsAppAdvert();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
            return this;
        }

        public Builder type(String type) {
            obj.type = type;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            obj.imageUrl = imageUrl;
            return this;
        }

        public Builder httpUrl(String httpUrl) {
            obj.httpUrl = httpUrl;
            return this;
        }

        public Builder sort(Integer sort) {
            obj.sort = sort;
            return this;
        }

        public Builder lang(String lang) {
            obj.lang = lang;
            return this;
        }

        public CmsAppAdvert build() {
            return this.obj;
        }
    }
}