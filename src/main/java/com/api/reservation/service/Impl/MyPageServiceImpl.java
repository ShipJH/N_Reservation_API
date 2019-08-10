package com.api.reservation.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.MyPageMapper;
import com.api.reservation.model.mypage.ReservationInfo;
import com.api.reservation.service.MyPageService;

@Service
public class MyPageServiceImpl implements MyPageService{

	private MyPageMapper myPageMapper;
	
	@Autowired
	public MyPageServiceImpl(MyPageMapper myPageMapper) {
		this.myPageMapper = myPageMapper;
	}
	
	@Override
	public List<ReservationInfo> getReservationHistory(int userSeq) {
		return myPageMapper.getReservationHistory(userSeq);
	}

}
