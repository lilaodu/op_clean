package com.chainup.operate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.RqImageMapper;
import com.chainup.common.exchange.entity.RqImage;
import com.chainup.common.exchange.entity.RqImageExample;
import com.chainup.operate.service.RqImageService;

@Service
public class RqImageServiceImpl implements RqImageService {
	@Autowired
	private RqImageMapper rqImageMapper;

	@Override
	public Integer add(RqImage rqImage) {
		return rqImageMapper.insert(rqImage);
	}

	@Override
	public List<RqImage> findAll(RqImageExample example) {
		return rqImageMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public RqImage findById(Integer id) {
		return rqImageMapper.selectByPrimaryKey(id);
	}
}