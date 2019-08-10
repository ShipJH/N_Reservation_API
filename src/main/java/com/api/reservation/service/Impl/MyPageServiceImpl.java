package com.api.reservation.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.MyPageMapper;
import com.api.reservation.model.mypage.ReservationInfoVo;
import com.api.reservation.model.mypage.response.ReservationResponse;
import com.api.reservation.service.MyPageService;

@Service
public class MyPageServiceImpl implements MyPageService{

	private MyPageMapper myPageMapper;
	
	@Autowired
	public MyPageServiceImpl(MyPageMapper myPageMapper) {
		this.myPageMapper = myPageMapper;
	}
	
	@Override
	public List<ReservationResponse> getReservationHistory(int userSeq) {
		
		List<ReservationResponse> res = new ArrayList<>();
		
		List<HashMap<String, Object>> reservationInfo = myPageMapper.getReservationInfo(userSeq);
		
		for(HashMap<String, Object> list : reservationInfo) {
			ReservationResponse reservationResponse = new ReservationResponse();
			reservationResponse.setReservationSeq((int)list.get("reservationSeq"));
			reservationResponse.setPayType(list.get("payType").toString());
			reservationResponse.setUseCd(list.get("useCd").toString());
			reservationResponse.setTotalPrice((int)list.get("totalPrice"));
			reservationResponse.setBizSeq((int)list.get("bizSeq"));
			reservationResponse.setBizName(list.get("bizName").toString());
			reservationResponse.setProductSeq((int)list.get("productSeq"));
			reservationResponse.setProductName(list.get("productName").toString());
			
			List<HashMap<String, Object>> resultMap = myPageMapper.getReservaionDetail((int)list.get("reservationSeq"));
			reservationResponse.setReservationDetailList(resultMap);
			res.add(reservationResponse);
		}
		
		
		return res;
	}

}
