package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.mypage.ReservationInfo;

public interface MyPageService {

	/**
	 * 유저의 예약정보를 가져온다
	 * @param userSeq
	 * @return
	 */
	List<ReservationInfo> getReservationHistory(int userSeq);

}
