package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.mypage.response.ReservationResponse;

public interface MyPageService {

	/**
	 * 유저의 예약정보를 가져온다
	 * @param userSeq
	 * @return
	 */
	List<ReservationResponse> getReservationHistory(int userSeq);

}
