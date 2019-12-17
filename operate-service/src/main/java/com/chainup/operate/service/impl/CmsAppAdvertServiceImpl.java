package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.common.exchange.entity.CmsAppAdvert;
import com.chainup.common.exchange.entity.CmsAppAdvertExample;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.ReflectionUtils;
import com.chainup.exchange.dao.CmsAppAdvertMapper;
import com.chainup.operate.service.CmsAppAdvertService;

@Service
public class CmsAppAdvertServiceImpl implements CmsAppAdvertService {
	@Autowired
	private CmsAppAdvertMapper cmsAppAdvertMapper;

	@Override
	public Integer add(CmsAppAdvert cmsAdvert) {
		ReflectionUtils.escapeSql(cmsAdvert);
		return cmsAppAdvertMapper.insertSelective(cmsAdvert);
	}

	@Override
	public List<CmsAppAdvert> findAll(CmsAppAdvertExample example) {
		List<CmsAppAdvert> list = cmsAppAdvertMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			for(CmsAppAdvert cmsAdvert : list){
				String imageUrl = PropertyUtil.getProperties("image_upload_base_url")  + "/" + cmsAdvert.getImageUrl();
				cmsAdvert.setImageUrl(imageUrl);
			}
		}
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public Integer count(CmsAppAdvertExample example) {
		return cmsAppAdvertMapper.countByExample(example);
	}

	@Override
	public CmsAppAdvert findById(Integer id) {
		CmsAppAdvert cmsAdvert = cmsAppAdvertMapper.selectByPrimaryKey(id);
		if (cmsAdvert != null) {
			String imageUrl = PropertyUtil.getProperties("image_upload_base_url") + "/" + cmsAdvert.getImageUrl();
			cmsAdvert.setImageUrl(imageUrl);
		}
		ReflectionUtils.escapeHtml(cmsAdvert);
		return cmsAdvert;
	}

	@Override
	public Integer update(CmsAppAdvert cmsAdvert) {
		ReflectionUtils.escapeSql(cmsAdvert);
		return cmsAppAdvertMapper.updateByPrimaryKeySelective(cmsAdvert);
	}

	@Override
	public Integer deleteById(Integer id) {
		return cmsAppAdvertMapper.deleteByPrimaryKey(id);
	}
}