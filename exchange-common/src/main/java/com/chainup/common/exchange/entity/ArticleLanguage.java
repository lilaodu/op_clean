package com.chainup.common.exchange.entity;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ArticleLanguage implements Serializable {
    private Integer id;

    @Length(max=10)
    @NotEmpty
    private String languageCode;

    @Length(max=50)
    @NotEmpty
    private String cnName;

    @Length(max=50)
    private String enName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode == null ? null : languageCode.trim();
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public static class Builder {
        private ArticleLanguage obj;

        public Builder() {
            this.obj = new ArticleLanguage();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder languageCode(String languageCode) {
            obj.languageCode = languageCode;
            return this;
        }

        public Builder cnName(String cnName) {
            obj.cnName = cnName;
            return this;
        }

        public Builder enName(String enName) {
            obj.enName = enName;
            return this;
        }

        public ArticleLanguage build() {
            return this.obj;
        }
    }
}