package com.api.reservation.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.BizMapper;
import com.api.reservation.model.BizInfoDto;
import com.api.reservation.model.common.ResponseVo;
import com.api.reservation.service.BizService;

@Service
public class BizServiceImpl implements BizService {

	private BizMapper bizMapper;
	
	@Autowired
	public BizServiceImpl(BizMapper bizMapper) {
		this.bizMapper = bizMapper;
	}
	
	
	@Override
	public List<BizInfoDto> getBizList() {
		return bizMapper.getBizList();
	}


	@Override
	public ResponseVo saveBiz(BizInfoDto bizInfoDto) {
		
		int insertFlag = 0;
		try {
			insertFlag = bizMapper.saveBiz(bizInfoDto);
		} catch (Exception e) {
			return ResponseVo.builder().httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		if(insertFlag > 0) {
			return ResponseVo.builder().httpStatus(HttpStatus.OK).build();
		}
		
		return ResponseVo.builder().httpStatus(HttpStatus.BAD_REQUEST).build();
	}


}
