package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.NoticeInfoMapper;
import com.chainup.common.exchange.entity.NoticeInfo;
import com.chainup.common.exchange.entity.NoticeInfoExample;
import com.chainup.operate.service.NoticeInfoService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class NoticeInfoServiceImpl implements NoticeInfoService {
	@Autowired
	private NoticeInfoMapper noticeInfoMapper;

	@Override
	public void add(NoticeInfo noticeInfo) {
		noticeInfo.setTitle(ReflectionUtils.sqlEncode(noticeInfo.getTitle()));
		noticeInfoMapper.insert(noticeInfo);
	}

	@Override
	public Integer count(NoticeInfoExample example) {
		return noticeInfoMapper.countByExample(example);
	}

	@Override
	public List<NoticeInfo> findAll(NoticeInfoExample example) {
		List<NoticeInfo> list = noticeInfoMapper.selectByExampleWithBLOBs(example);
		for (NoticeInfo noticeInfo : list) {
			noticeInfo.setTitle(ReflectionUtils.htmlEncode(noticeInfo.getTitle()));
		}
		return list;
	}

	@Override
	public NoticeInfo findById(Integer id) {
		NoticeInfo noticeInfo = noticeInfoMapper.selectByPrimaryKey(id);
		noticeInfo.setTitle(ReflectionUtils.htmlEncode(noticeInfo.getTitle()));
		return noticeInfo;
	}

	@Override
	public void deleteById(Integer id) {
		noticeInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(NoticeInfo noticeInfo) {
		noticeInfo.setTitle(ReflectionUtils.sqlEncode(noticeInfo.getTitle()));
		noticeInfoMapper.updateByPrimaryKeySelective(noticeInfo);
	}

	@Override
	public void deleteByExample(NoticeInfoExample example) {
		noticeInfoMapper.deleteByExample(example);
	}
}