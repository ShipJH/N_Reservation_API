package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.biz.BizInfoDto;
import com.api.reservation.model.biz.response.BizInfoMainResponse;
import com.api.reservation.model.biz.response.BizInfoResponse;
import com.api.reservation.model.common.CommonResponseVo;

public interface BizService {

	/**
	 * 모든 기업정보를 반환한다.
	 * @return
	 */
	List<BizInfoResponse> getBizAllList();

	/**
	 * 메인화면에 뿌릴 기업정보 반환힌다.
	 * @return
	 */
	List<BizInfoMainResponse> getBizMainList();

	/**
	 * 하나의 매장정보를 가져온다.
	 * @param bizSeq
	 * @return
	 */
	BizInfoResponse getBiz(int bizSeq);


}
