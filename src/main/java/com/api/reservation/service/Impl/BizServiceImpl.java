package com.api.reservation.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.BizMapper;
import com.api.reservation.model.BizInfo;
import com.api.reservation.service.BizService;

@Service
public class BizServiceImpl implements BizService {

	private BizMapper bizMapper;
	
	@Autowired
	public BizServiceImpl(BizMapper bizMapper) {
		this.bizMapper = bizMapper;
	}
	
	
	@Override
	public List<BizInfo> getBizList() {
		
		
		
		return bizMapper.getBizList();
	}


	@Override
	public BizInfo jdbcTest() {
		return bizMapper.jdbcTest();
	}

}
