package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.biz.BizInfoDto;
import com.api.reservation.model.biz.response.BizInfoResponse;
import com.api.reservation.model.common.ResponseVo;

public interface BizService {

	/**
	 * biz service 가져오는 메서드
	 * @return
	 */
	List<BizInfoDto> getBizList();

	/**
	 * 모든 기업정보를 반환한다.
	 * @return
	 */
	List<BizInfoResponse> getBizAllList();


}
