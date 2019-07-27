package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.BizInfo;

public interface BizService {

	/**
	 * biz service 가져오는 메서드
	 * @return
	 */
	List<BizInfo> getBizList();

	BizInfo jdbcTest();

}
