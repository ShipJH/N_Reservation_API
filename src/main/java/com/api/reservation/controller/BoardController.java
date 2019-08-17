package com.api.reservation.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.reservation.model.board.request.ReviewRequest;
import com.api.reservation.model.board.response.ReviewResponse;
import com.api.reservation.model.common.CommonResponseVo;
import com.api.reservation.service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin( value="*" )
@RestController
@RequestMapping(value = "/board")
@Api(tags = "글 관련 API", value = "글 관련 API", description = "글 관련 API")
public class BoardController {

	private BoardService boardService;
	
	@Autowired
	public BoardController(BoardService BoardService) {
		this.boardService = BoardService;
	}
	
	
	@ApiOperation(value = "매장리뷰 조회 API")
	@GetMapping(value = "/reviews/{bizSeq}")
	public ResponseEntity<List<ReviewResponse>> getReviews(@PathVariable int bizSeq) {
		
		List<ReviewResponse> res = boardService.getReviewList(bizSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@ApiOperation(value = "매장리뷰 점수,평균조회 API")
	@GetMapping(value = "/reviewStatistics/{bizSeq}")
	public ResponseEntity<HashMap<String, Double>> getReviewStatistics(@PathVariable int bizSeq) {
		
		HashMap<String, Double> res = boardService.getReviewStatistics(bizSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}	
	
	@ApiOperation(value = "매장리뷰 저장 API")
	@PostMapping(value = "/save")
	public ResponseEntity<CommonResponseVo> saveReview(ReviewRequest reviewRequest) {
		
		CommonResponseVo res = boardService.saveReview(reviewRequest);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}	
}
