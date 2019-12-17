package com.chainup.common.exchange.vo;

import java.io.Serializable;
import java.util.List;

public class OtcLanguage implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	/** 支付方式 */
	private List<AttrModel>		otcPayModes;

	/** 国家 */
	private List<AttrModel>		otcCountries;

	/** 支付币种 */
	private List<AttrModel>		otcPaycoins;

	public List<AttrModel> getOtcPayModes() {
		return otcPayModes;
	}

	public void setOtcPayModes(List<AttrModel> otcPayModes) {
		this.otcPayModes = otcPayModes;
	}

	public List<AttrModel> getOtcCountries() {
		return otcCountries;
	}

	public void setOtcCountries(List<AttrModel> otcCountries) {
		this.otcCountries = otcCountries;
	}

	public List<AttrModel> getOtcPaycoins() {
		return otcPaycoins;
	}

	public void setOtcPaycoins(List<AttrModel> otcPaycoins) {
		this.otcPaycoins = otcPaycoins;
	}

}
