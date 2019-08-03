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

import com.api.reservation.model.board.ReviewDto;
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
	public ResponseEntity<List<ReviewDto>> getReviews(@PathVariable int bizSeq) {
		
		List<ReviewDto> res = boardService.getReviewList(bizSeq);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
}