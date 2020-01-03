package com.chainup.operate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.enums.Status;
import com.chainup.common.exchange.entity.ExLanguageConfig;
import com.chainup.common.exchange.entity.ExLanguageConfigExample;
import com.chainup.common.exchange.vo.AttrModel;
import com.chainup.common.exchange.vo.OtcLanguage;
import com.chainup.exchange.dao.ExLanguageConfigMapper;
import com.chainup.operate.service.ExLanguageService;

@Service
public class ExLanguageServiceImpl implements ExLanguageService {

	@Resource
	private ExLanguageConfigMapper	exLanguageConfigMapper;



	@Override
	public List<ExLanguageConfig> getAllUsedLang() throws Exception {
		ExLanguageConfigExample example = new ExLanguageConfigExample();
		example.createCriteria().andIsOpenEqualTo((byte) Status.OPEN.getValue());

		return exLanguageConfigMapper.selectByExample(example);
	}

	@Override
	public ExLanguageConfig getLangByKey(String key) throws Exception {
		ExLanguageConfigExample example = new ExLanguageConfigExample();
		example.createCriteria().andIsOpenEqualTo((byte) Status.OPEN.getValue()).andKeyEqualTo(key);

		List<ExLanguageConfig> list = exLanguageConfigMapper.selectByExample(example);

		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}

		return null;
	}

	@Override
	public OtcLanguage getOtcLangByKey(String key) throws Exception {

		ExLanguageConfig lang = getLangByKey(key);
		if (null == lang)
			return null;
		OtcLanguage language = new OtcLanguage();
		if (StringUtils.isNotBlank(lang.getOtcPayMode())) {
			List<AttrModel> models = JSONObject.parseArray(lang.getOtcPayMode(), AttrModel.class);
			language.setOtcPayModes(models);
		}
		if (StringUtils.isNotBlank(lang.getOtcCountry())) {
			List<AttrModel> models = JSONObject.parseArray(lang.getOtcCountry(), AttrModel.class);
			language.setOtcCountries(models);
		}
		if (StringUtils.isNotBlank(lang.getOtcPaycoin())) {
			List<AttrModel> models = JSONObject.parseArray(lang.getOtcPaycoin(), AttrModel.class);
			language.setOtcPaycoins(models);
		}
		return language;
	}




}
