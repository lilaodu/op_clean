package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExSymbolPair implements Serializable {
    private Long id;

    @Length(max=50)
    @NotEmpty
    private String symbol;

    @Length(max=50)
    @NotEmpty
    private String base;

    @Length(max=50)
    @NotEmpty
    private String quote;

    @Length(max=4)
    @NotEmpty
    private String isOpen;

    @NotEmpty
    private BigDecimal openPrice;

    @Length(max=4)
    @NotEmpty
    private String isFiat;

    @Length(max=255)
    @NotEmpty
    private String depth0Pre;

    @Length(max=255)
    @NotEmpty
    private String depth1Pre;

    @Length(max=255)
    @NotEmpty
    private String depth2Pre;

    @NotEmpty
    private BigDecimal pricePre;

    @NotEmpty
    private BigDecimal volumePre;

    @Length(max=255)
    @NotEmpty
    private String depthFullVolume;

    @NotEmpty
    private BigDecimal limitSellMinVolume;

    @NotEmpty
    private BigDecimal limitSellMinPrice;

    @NotEmpty
    private BigDecimal marketBuyMinPeice;

    @NotEmpty
    private BigDecimal marketBuyMinVolume;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base == null ? null : base.trim();
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote == null ? null : quote.trim();
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen == null ? null : isOpen.trim();
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public String getIsFiat() {
        return isFiat;
    }

    public void setIsFiat(String isFiat) {
        this.isFiat = isFiat == null ? null : isFiat.trim();
    }

    public String getDepth0Pre() {
        return depth0Pre;
    }

    public void setDepth0Pre(String depth0Pre) {
        this.depth0Pre = depth0Pre == null ? null : depth0Pre.trim();
    }

    public String getDepth1Pre() {
        return depth1Pre;
    }

    public void setDepth1Pre(String depth1Pre) {
        this.depth1Pre = depth1Pre == null ? null : depth1Pre.trim();
    }

    public String getDepth2Pre() {
        return depth2Pre;
    }

    public void setDepth2Pre(String depth2Pre) {
        this.depth2Pre = depth2Pre == null ? null : depth2Pre.trim();
    }

    public BigDecimal getPricePre() {
        return pricePre;
    }

    public void setPricePre(BigDecimal pricePre) {
        this.pricePre = pricePre;
    }

    public BigDecimal getVolumePre() {
        return volumePre;
    }

    public void setVolumePre(BigDecimal volumePre) {
        this.volumePre = volumePre;
    }

    public String getDepthFullVolume() {
        return depthFullVolume;
    }

    public void setDepthFullVolume(String depthFullVolume) {
        this.depthFullVolume = depthFullVolume == null ? null : depthFullVolume.trim();
    }

    public BigDecimal getLimitSellMinVolume() {
        return limitSellMinVolume;
    }

    public void setLimitSellMinVolume(BigDecimal limitSellMinVolume) {
        this.limitSellMinVolume = limitSellMinVolume;
    }

    public BigDecimal getLimitSellMinPrice() {
        return limitSellMinPrice;
    }

    public void setLimitSellMinPrice(BigDecimal limitSellMinPrice) {
        this.limitSellMinPrice = limitSellMinPrice;
    }

    public BigDecimal getMarketBuyMinPeice() {
        return marketBuyMinPeice;
    }

    public void setMarketBuyMinPeice(BigDecimal marketBuyMinPeice) {
        this.marketBuyMinPeice = marketBuyMinPeice;
    }

    public BigDecimal getMarketBuyMinVolume() {
        return marketBuyMinVolume;
    }

    public void setMarketBuyMinVolume(BigDecimal marketBuyMinVolume) {
        this.marketBuyMinVolume = marketBuyMinVolume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public static class Builder {
        private ExSymbolPair obj;

        public Builder() {
            this.obj = new ExSymbolPair();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder base(String base) {
            obj.base = base;
            return this;
        }

        public Builder quote(String quote) {
            obj.quote = quote;
            return this;
        }

        public Builder isOpen(String isOpen) {
            obj.isOpen = isOpen;
            return this;
        }

        public Builder openPrice(BigDecimal openPrice) {
            obj.openPrice = openPrice;
            return this;
        }

        public Builder isFiat(String isFiat) {
            obj.isFiat = isFiat;
            return this;
        }

        public Builder depth0Pre(String depth0Pre) {
            obj.depth0Pre = depth0Pre;
            return this;
        }

        public Builder depth1Pre(String depth1Pre) {
            obj.depth1Pre = depth1Pre;
            return this;
        }

        public Builder depth2Pre(String depth2Pre) {
            obj.depth2Pre = depth2Pre;
            return this;
        }

        public Builder pricePre(BigDecimal pricePre) {
            obj.pricePre = pricePre;
            return this;
        }

        public Builder volumePre(BigDecimal volumePre) {
            obj.volumePre = volumePre;
            return this;
        }

        public Builder depthFullVolume(String depthFullVolume) {
            obj.depthFullVolume = depthFullVolume;
            return this;
        }

        public Builder limitSellMinVolume(BigDecimal limitSellMinVolume) {
            obj.limitSellMinVolume = limitSellMinVolume;
            return this;
        }

        public Builder limitSellMinPrice(BigDecimal limitSellMinPrice) {
            obj.limitSellMinPrice = limitSellMinPrice;
            return this;
        }

        public Builder marketBuyMinPeice(BigDecimal marketBuyMinPeice) {
            obj.marketBuyMinPeice = marketBuyMinPeice;
            return this;
        }

        public Builder marketBuyMinVolume(BigDecimal marketBuyMinVolume) {
            obj.marketBuyMinVolume = marketBuyMinVolume;
            return this;
        }

        public Builder description(String description) {
            obj.description = description;
            return this;
        }

        public ExSymbolPair build() {
            return this.obj;
        }
    }
}