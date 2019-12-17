package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExSymbol implements Serializable {
	private Long				id;

	@Length(max = 50)
	@NotEmpty
	private String				coinSymbol;

	@NotEmpty
	private Integer				precision;

	@Length(max = 4)
	@NotEmpty
	private String				otcOpen;

	@Length(max = 4)
	@NotEmpty
	private String				isFiat;

	@Length(max = 4)
	@NotEmpty
	private String				isQuote;

	@Length(max = 4)
	@NotEmpty
	private String				isOpen;

	@Length(max = 4)
	@NotEmpty
	private String				depositOpen;

	@Length(max = 4)
	@NotEmpty
	private String				withdrawOpen;

	@Length(max = 4)
	@NotEmpty
	private String				useRate;

	@Length(max = 255)
	@NotEmpty
	private String				tokenBase;

	@Length(max = 500)
	@NotEmpty
	private String				chainAddress;

	@Length(max = 500)
	@NotEmpty
	private String				chainTx;

	@NotEmpty
	private Integer				depositConfirm;

	@Length(max = 255)
	@NotEmpty
	private String				icon;

	@Length(max = 255)
	@NotEmpty
	private String				link;

	@NotEmpty
	private Integer				sort;

	private List<ExFee>			fees;

	private static final long	serialVersionUID	= 1L;

	public List<ExFee> getFees() {
		return fees;
	}

	public void setFees(List<ExFee> fees) {
		this.fees = fees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCoinSymbol() {
		return coinSymbol;
	}

	public void setCoinSymbol(String coinSymbol) {
		this.coinSymbol = coinSymbol == null ? null : coinSymbol.trim();
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public String getOtcOpen() {
		return otcOpen;
	}

	public void setOtcOpen(String otcOpen) {
		this.otcOpen = otcOpen == null ? null : otcOpen.trim();
	}

	public String getIsFiat() {
		return isFiat;
	}

	public void setIsFiat(String isFiat) {
		this.isFiat = isFiat == null ? null : isFiat.trim();
	}

	public String getIsQuote() {
		return isQuote;
	}

	public void setIsQuote(String isQuote) {
		this.isQuote = isQuote == null ? null : isQuote.trim();
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen == null ? null : isOpen.trim();
	}

	public String getDepositOpen() {
		return depositOpen;
	}

	public void setDepositOpen(String depositOpen) {
		this.depositOpen = depositOpen == null ? null : depositOpen.trim();
	}

	public String getWithdrawOpen() {
		return withdrawOpen;
	}

	public void setWithdrawOpen(String withdrawOpen) {
		this.withdrawOpen = withdrawOpen == null ? null : withdrawOpen.trim();
	}

	public String getUseRate() {
		return useRate;
	}

	public void setUseRate(String useRate) {
		this.useRate = useRate == null ? null : useRate.trim();
	}

	public String getTokenBase() {
		return tokenBase;
	}

	public void setTokenBase(String tokenBase) {
		this.tokenBase = tokenBase == null ? null : tokenBase.trim();
	}

	public String getChainAddress() {
		return chainAddress;
	}

	public void setChainAddress(String chainAddress) {
		this.chainAddress = chainAddress == null ? null : chainAddress.trim();
	}

	public String getChainTx() {
		return chainTx;
	}

	public void setChainTx(String chainTx) {
		this.chainTx = chainTx == null ? null : chainTx.trim();
	}

	public Integer getDepositConfirm() {
		return depositConfirm;
	}

	public void setDepositConfirm(Integer depositConfirm) {
		this.depositConfirm = depositConfirm;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link == null ? null : link.trim();
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public static class Builder {
		private ExSymbol	obj;

		public Builder() {
			this.obj = new ExSymbol();
		}

		public Builder id(Long id) {
			obj.id = id;
			return this;
		}

		public Builder coinSymbol(String coinSymbol) {
			obj.coinSymbol = coinSymbol;
			return this;
		}

		public Builder precision(Integer precision) {
			obj.precision = precision;
			return this;
		}

		public Builder otcOpen(String otcOpen) {
			obj.otcOpen = otcOpen;
			return this;
		}

		public Builder isFiat(String isFiat) {
			obj.isFiat = isFiat;
			return this;
		}

		public Builder isQuote(String isQuote) {
			obj.isQuote = isQuote;
			return this;
		}

		public Builder isOpen(String isOpen) {
			obj.isOpen = isOpen;
			return this;
		}

		public Builder depositOpen(String depositOpen) {
			obj.depositOpen = depositOpen;
			return this;
		}

		public Builder withdrawOpen(String withdrawOpen) {
			obj.withdrawOpen = withdrawOpen;
			return this;
		}

		public Builder useRate(String useRate) {
			obj.useRate = useRate;
			return this;
		}

		public Builder tokenBase(String tokenBase) {
			obj.tokenBase = tokenBase;
			return this;
		}

		public Builder chainAddress(String chainAddress) {
			obj.chainAddress = chainAddress;
			return this;
		}

		public Builder chainTx(String chainTx) {
			obj.chainTx = chainTx;
			return this;
		}

		public Builder depositConfirm(Integer depositConfirm) {
			obj.depositConfirm = depositConfirm;
			return this;
		}

		public Builder icon(String icon) {
			obj.icon = icon;
			return this;
		}

		public Builder link(String link) {
			obj.link = link;
			return this;
		}

		public Builder sort(Integer sort) {
			obj.sort = sort;
			return this;
		}

		public ExSymbol build() {
			return this.obj;
		}
	}
}