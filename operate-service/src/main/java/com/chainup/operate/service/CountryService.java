package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.Country;

public interface CountryService {
	
	List<Country> getAllCountryList(String lang);
	Country getByNumberCodeAndDialingCode(String dialingCode);

}
