package com.chainup.common.exchange.entity;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExLanguageConfig implements Serializable {
    private Integer id;

    @NotEmpty
    private Byte isOpen;

    @NotEmpty
    private Integer type;

    @Length(max=50)
    @NotEmpty
    private String key;

    @Length(max=50)
    @NotEmpty
    private String language;

    @Length(max=50)
    @NotEmpty
    private String title;

    @Length(max=50)
    @NotEmpty
    private String icon;

    @Length(max=255)
    @NotEmpty
    private String smsHeader;

    @Length(max=255)
    @NotEmpty
    private String emailHeader;

    @Length(max=255)
    @NotEmpty
    private String otcPayMode;

    @Length(max=255)
    @NotEmpty
    private String otcCountry;

    @Length(max=255)
    @NotEmpty
    private String otcPaycoin;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getSmsHeader() {
        return smsHeader;
    }

    public void setSmsHeader(String smsHeader) {
        this.smsHeader = smsHeader == null ? null : smsHeader.trim();
    }

    public String getEmailHeader() {
        return emailHeader;
    }

    public void setEmailHeader(String emailHeader) {
        this.emailHeader = emailHeader == null ? null : emailHeader.trim();
    }

    public String getOtcPayMode() {
        return otcPayMode;
    }

    public void setOtcPayMode(String otcPayMode) {
        this.otcPayMode = otcPayMode == null ? null : otcPayMode.trim();
    }

    public String getOtcCountry() {
        return otcCountry;
    }

    public void setOtcCountry(String otcCountry) {
        this.otcCountry = otcCountry == null ? null : otcCountry.trim();
    }

    public String getOtcPaycoin() {
        return otcPaycoin;
    }

    public void setOtcPaycoin(String otcPaycoin) {
        this.otcPaycoin = otcPaycoin == null ? null : otcPaycoin.trim();
    }

    public static class Builder {
        private ExLanguageConfig obj;

        public Builder() {
            this.obj = new ExLanguageConfig();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder isOpen(Byte isOpen) {
            obj.isOpen = isOpen;
            return this;
        }

        public Builder type(Integer type) {
            obj.type = type;
            return this;
        }

        public Builder key(String key) {
            obj.key = key;
            return this;
        }

        public Builder language(String language) {
            obj.language = language;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
            return this;
        }

        public Builder icon(String icon) {
            obj.icon = icon;
            return this;
        }

        public Builder smsHeader(String smsHeader) {
            obj.smsHeader = smsHeader;
            return this;
        }

        public Builder emailHeader(String emailHeader) {
            obj.emailHeader = emailHeader;
            return this;
        }

        public Builder otcPayMode(String otcPayMode) {
            obj.otcPayMode = otcPayMode;
            return this;
        }

        public Builder otcCountry(String otcCountry) {
            obj.otcCountry = otcCountry;
            return this;
        }

        public Builder otcPaycoin(String otcPaycoin) {
            obj.otcPaycoin = otcPaycoin;
            return this;
        }

        public ExLanguageConfig build() {
            return this.obj;
        }
    }
}