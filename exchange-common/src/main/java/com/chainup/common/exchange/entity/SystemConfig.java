package com.chainup.common.exchange.entity;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class SystemConfig implements Serializable {
    private Integer id;

    @Length(max=50)
    @NotEmpty
    private String language;  // 多语言设置项

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public static class Builder {
        private SystemConfig obj;

        public Builder() {
            this.obj = new SystemConfig();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder language(String language) {
            obj.language = language;
            return this;
        }

        public SystemConfig build() {
            return this.obj;
        }
    }
}