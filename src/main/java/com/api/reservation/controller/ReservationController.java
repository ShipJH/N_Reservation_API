package com.api.reservation.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.reservation.model.BizInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin( value="*" )
@RestController
@Api(tags = "사업장 관련 API", value = "사업장 관련 API", description = "사업장 관련 API")
public class ReservationController {

	@ApiOperation(value = "사업장 정보조회 API")
	@GetMapping(value = "/test")
	public ResponseEntity<List<BizInfo>> test() {
		
		List<BizInfo> resultList = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			resultList.add(
					 BizInfo.builder()
					.bizSeq(i)
					.bizName("사업장"+i)
					.bizNum("123-45-12345")
					.bizType("ITEM")
					.bizAddress("경기도 고양시")
					.bizTel("0319990000"+i)
					.regDate(LocalDateTime.now())
					.approveYn("N")
					.bizDes("설명"+i)
					.bizSimpleDes("간략설명"+i)
					.useYn( i%2 == 0? "Y" : "N")
					.build());

		}
		
		return new ResponseEntity<>(resultList, HttpStatus.OK);
	}
	
}
