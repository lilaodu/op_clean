package com.chainup.operate.service.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chainup.common.enums.Language;
import com.chainup.common.exchange.entity.Country;
import com.chainup.operate.service.CountryService;
import com.chainup.common.util.XmlUtil;

@Service
public class CountryServiceImpl implements CountryService {
	private static final Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);
	/**
	 * 根据语言环境查询电话区号列表
	 * @param lang
	 * @return
	 */
	@Override
	public List<Country> getAllCountryList(String lang) {
		logger.info("getAllCountryList lang={}", lang);
		Language language = Language.fromValue(lang);
		URL url = CountryServiceImpl.class.getClassLoader().getResource("CountryList.xml");
		List<HashMap<String, String>> list = XmlUtil.getListFromXml(url, "Country");
		if(list!=null){
			List<Country> countryList = new ArrayList<>();
			for (HashMap<String, String> countryMap : list) {
				Country country = new Country();
				if (countryMap.get(language.phoneCountryName)==null) {
					country.setShowName(countryMap.get("enName"));
				}else if(lang.equals(Language.English.lang)){
					country.setShowName(countryMap.get(language.phoneCountryName));
				}else {
					country.setShowName(countryMap.get(language.phoneCountryName)+"("+countryMap.get("enName")+")");
				}
				country.setEnName(countryMap.get("enName"));
				country.setCnName(countryMap.get("cnName"));
				country.setDialingCode(countryMap.get("dialingCode"));
				country.setNumberCode(countryMap.get("NumberCode"));
				countryList.add(country);
			}
			return countryList;
		}else{
			return null;
		}
	}

	/**
	 * 根据区号查询国家
	 * @param numberCodeAndDialingCode
	 * @return
	 */
    @Override
    public Country getByNumberCodeAndDialingCode(String numberCodeAndDialingCode) {
        URL url = CountryServiceImpl.class.getClassLoader().getResource("CountryList.xml");
        List<HashMap<String, String>> list = XmlUtil.getListFromXml(url, "Country");
        Country country = null;
        if(list!=null){
            for (HashMap<String, String> countryMap : list) {
                String nd = countryMap.get("NumberCode")+countryMap.get("dialingCode");
                if(nd.equals(numberCodeAndDialingCode)){
                	country = new Country();
                	country.setCnName(countryMap.get("cnName"));
                	country.setEnName(countryMap.get("enName"));
    				country.setDialingCode(countryMap.get("dialingCode"));
    				country.setNumberCode(countryMap.get("NumberCode"));
                    break;
                }
            }
            return country;
        }else{
            return null;
        }
    }
    
    
    

}
