package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.CmsArticleTypeMapper;
import com.chainup.common.exchange.entity.CmsArticleType;
import com.chainup.common.exchange.entity.CmsArticleTypeExample;
import com.chainup.operate.service.CmsArticleTypeService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class CmsArticleTypeServiceImpl implements CmsArticleTypeService {

	@Autowired
	private CmsArticleTypeMapper cmsArticleTypeMapper;

	@Override
	public int countByExample(CmsArticleTypeExample example) {
		return cmsArticleTypeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CmsArticleTypeExample example) {
		return cmsArticleTypeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return cmsArticleTypeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CmsArticleType record) {
		ReflectionUtils.escapeSql(record);
		return cmsArticleTypeMapper.insertSelective(record);
	}

	@Override
	public CmsArticleType selectOnlyOneByExample(CmsArticleTypeExample example) {		
		CmsArticleType cmsArticleType = cmsArticleTypeMapper.selectOnlyOneByExample(example);
		ReflectionUtils.escapeHtml(cmsArticleType);
		return cmsArticleType;
	}

	@Override
	public List<CmsArticleType> selectByExample(CmsArticleTypeExample example) {
		List<CmsArticleType> list = cmsArticleTypeMapper.selectByExample(example);
		if(list!=null){
			for(CmsArticleType type:list){
				CmsArticleType ptype = cmsArticleTypeMapper.selectByPrimaryKey(type.getParentId());
				if(ptype!=null){
					type.setParentName(ptype.getArticleTypeName());
				}
			}
		}
		ReflectionUtils.escapeHtml(list);
		return list;
	}

	@Override
	public CmsArticleType selectByPrimaryKey(Integer id) {
		return cmsArticleTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(CmsArticleType record) {
		return cmsArticleTypeMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKeySelective(CmsArticleType record) {
		return cmsArticleTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<CmsArticleType> selectLeafType(Integer parentId,Integer lang) {
		CmsArticleTypeExample example = new CmsArticleTypeExample();
		example.createCriteria().andParentIdEqualTo(parentId).andLangEqualTo(lang);
		List<CmsArticleType> typeList = new ArrayList<CmsArticleType>();
		List<CmsArticleType> list = cmsArticleTypeMapper.selectByExample(example);
		if(list!=null){
			for(CmsArticleType type:list){
				 getSonNode(typeList,type,lang);
			}
		}
		ReflectionUtils.escapeHtml(typeList);
		return typeList;
	}
	
	private void getSonNode(List<CmsArticleType> typeList,CmsArticleType cmsArticleType,Integer lang){
		CmsArticleTypeExample example = new CmsArticleTypeExample();
		example.createCriteria().andParentIdEqualTo(cmsArticleType.getId()).andLangEqualTo(lang);
		List<CmsArticleType> list = cmsArticleTypeMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			for(CmsArticleType type:list){
				getSonNode(typeList,type,lang);
			}
		}else{
			typeList.add(cmsArticleType);
		}
	}
}
