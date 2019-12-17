package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.CmsArticleMapper;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.CmsArticle;
import com.chainup.common.exchange.entity.CmsArticleExample;
import com.chainup.common.exchange.entity.CmsArticleType;
import com.chainup.operate.service.AdminUserService;
import com.chainup.operate.service.CmsArticleService;
import com.chainup.operate.service.CmsArticleTypeService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class CmsArticleServiceImpl implements CmsArticleService {
	
	@Autowired
	private CmsArticleMapper cmsArticleMapper;
	@Autowired
	private CmsArticleTypeService cmsArticleTypeService;
	@Autowired
	private AdminUserService adminUserService;

	@Override
	public int insert(CmsArticle record) {
		ReflectionUtils.escapeSql(record);
		return cmsArticleMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CmsArticle record) {
		ReflectionUtils.escapeSql(record);
		return cmsArticleMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int countByExample(CmsArticleExample example) {
		return cmsArticleMapper.countByExample(example);
	}

	@Override
	public List<CmsArticle> selectByExampleWithBLOBs(CmsArticleExample example) {
		List<CmsArticle> cmsArticleList = cmsArticleMapper.selectByExampleWithBLOBs(example);
		if(cmsArticleList!=null){
			for(CmsArticle cmsArticle:cmsArticleList){
				CmsArticleType cmsArticleType = cmsArticleTypeService.selectByPrimaryKey(cmsArticle.getArticleTypeId());
				if(cmsArticleType!=null) {
					cmsArticle.setArticleTypeName(cmsArticleType.getArticleTypeName());
				}
				AdminUser publisher = adminUserService.findById(cmsArticle.getPublisherId());
				if(publisher!=null)
					cmsArticle.setPublisher(publisher.getNickname());
			}
		}
		ReflectionUtils.escapeHtml(cmsArticleList);
		return cmsArticleList;
	}

	@Override
	public int deleteByExample(CmsArticleExample example) {
		return cmsArticleMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return cmsArticleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public CmsArticle selectByPrimaryKey(Integer id) {
		return cmsArticleMapper.selectByPrimaryKey(id);
	}

	@Override
	public CmsArticle selectOnlyOneByExample(CmsArticleExample example) {
		ReflectionUtils.escapeHtml(example);
		return cmsArticleMapper.selectOnlyOneByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsArticle record) {
	//	ReflectionUtils.escapeSql(record);
		return cmsArticleMapper.updateByPrimaryKeySelective(record);
	}

}
