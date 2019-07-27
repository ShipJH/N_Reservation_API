package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.BizInfoDto;
import com.api.reservation.model.common.ResponseVo;

public interface BizService {

	/**
	 * biz service 가져오는 메서드
	 * @return
	 */
	List<BizInfoDto> getBizList();

	/**
	 * 유저정보 저장한다.
	 * @param bizInfoDto
	 * @return
	 */
	ResponseVo saveBiz(BizInfoDto bizInfoDto);


}
