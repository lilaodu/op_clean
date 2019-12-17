package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.CmsAdvertMapper;
import com.chainup.common.exchange.entity.CmsAdvert;
import com.chainup.common.exchange.entity.CmsAdvertExample;
import com.chainup.operate.service.CmsAdvertService;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.ReflectionUtils;

@Service
public class CmsAdvertServiceImpl implements CmsAdvertService {
	@Autowired
	private CmsAdvertMapper cmsAdvertMapper;

	@Override
	public Integer add(CmsAdvert cmsAdvert) {
		ReflectionUtils.escapeSql(cmsAdvert);
		return cmsAdvertMapper.insertSelective(cmsAdvert);
	}

	@Override
	public List<CmsAdvert> findAll(CmsAdvertExample example) {
		List<CmsAdvert> list = cmsAdvertMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			for(CmsAdvert cmsAdvert : list){
				String imageUrl = PropertyUtil.getProperties("image_upload_base_url")  + "/" + cmsAdvert.getImageUrl();
				cmsAdvert.setImageUrl(imageUrl);
			}
		}
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public Integer count(CmsAdvertExample example) {
		return cmsAdvertMapper.countByExample(example);
	}

	@Override
	public CmsAdvert findById(Integer id) {
		CmsAdvert cmsAdvert = cmsAdvertMapper.selectByPrimaryKey(id);
		if (cmsAdvert != null) {
			String imageUrl = PropertyUtil.getProperties("image_upload_base_url") + "/" + cmsAdvert.getImageUrl();
			cmsAdvert.setImageUrl(imageUrl);
		}
		ReflectionUtils.escapeHtml(cmsAdvert);
		return cmsAdvert;
	}

	@Override
	public Integer update(CmsAdvert cmsAdvert) {
		ReflectionUtils.escapeSql(cmsAdvert);
		return cmsAdvertMapper.updateByPrimaryKeySelective(cmsAdvert);
	}

	@Override
	public Integer deleteById(Integer id) {
		return cmsAdvertMapper.deleteByPrimaryKey(id);
	}
}