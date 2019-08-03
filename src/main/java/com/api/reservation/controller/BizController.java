package com.api.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.reservation.model.biz.BizInfoDto;
import com.api.reservation.model.biz.response.BizInfoResponse;
import com.api.reservation.model.common.ResponseVo;
import com.api.reservation.service.BizService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin( value="*" )
@RestController
@RequestMapping(value = "/biz")
@Api(tags = "사업장 관련 API", value = "사업장 관련 API", description = "사업장 관련 API")
public class BizController {

	private BizService bizService;
	
	@Autowired
	public BizController(BizService bizService) {
		this.bizService = bizService;
	}
	
	
	@ApiOperation(value = "매장 정보조회 API")
	@GetMapping(value = "/bizs")
	public ResponseEntity<List<BizInfoResponse>> getBizs() {
		
		List<BizInfoResponse> res = bizService.getBizAllList();
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
}
