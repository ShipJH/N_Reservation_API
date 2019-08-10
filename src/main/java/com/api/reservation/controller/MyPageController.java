package com.api.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.reservation.model.mypage.ReservationInfoVo;
import com.api.reservation.model.mypage.response.ReservationResponse;
import com.api.reservation.service.MyPageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin( value="*" )
@RestController
@RequestMapping(value = "/myPage")
@Api(tags = "MyPage 관련 API", value = "MyPage 관련 API", description = "MyPage 관련 API")
public class MyPageController {

	private MyPageService myPageService;
	
	@Autowired
	public MyPageController(MyPageService myPageService) {
		this.myPageService = myPageService;
	}
	
	@ApiOperation(value = "예약내역 조회 API")
	@GetMapping(value = "/history/{userSeq}")
	public ResponseEntity<List<ReservationResponse>> getReservationHistory(@PathVariable int userSeq) {
		
		List<ReservationResponse> res = myPageService.getReservationHistory(userSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
	
}
