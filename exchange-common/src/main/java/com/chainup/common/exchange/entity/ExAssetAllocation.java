package com.chainup.common.exchange.entity;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExAssetAllocation implements Serializable {
    private Long id;

    @Length(max=20)
    @NotEmpty
    private String assetType;

    @Length(max=11)
    @NotEmpty
    private String assetA;

    @Length(max=11)
    @NotEmpty
    private String assetBc;

    @Length(max=50)
    @NotEmpty
    private String coinSymbol;

    @Length(max=50)
    @NotEmpty
    private String symbol;

    @Length(max=255)
    @NotEmpty
    private String tag;

    @Length(max=255)
    @NotEmpty
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType == null ? null : assetType.trim();
    }

    public String getAssetA() {
        return assetA;
    }

    public void setAssetA(String assetA) {
        this.assetA = assetA == null ? null : assetA.trim();
    }

    public String getAssetBc() {
        return assetBc;
    }

    public void setAssetBc(String assetBc) {
        this.assetBc = assetBc == null ? null : assetBc.trim();
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol == null ? null : coinSymbol.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public static class Builder {
        private ExAssetAllocation obj;

        public Builder() {
            this.obj = new ExAssetAllocation();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder assetType(String assetType) {
            obj.assetType = assetType;
            return this;
        }

        public Builder assetA(String assetA) {
            obj.assetA = assetA;
            return this;
        }

        public Builder assetBc(String assetBc) {
            obj.assetBc = assetBc;
            return this;
        }

        public Builder coinSymbol(String coinSymbol) {
            obj.coinSymbol = coinSymbol;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder tag(String tag) {
            obj.tag = tag;
            return this;
        }

        public Builder description(String description) {
            obj.description = description;
            return this;
        }

        public ExAssetAllocation build() {
            return this.obj;
        }
    }
}