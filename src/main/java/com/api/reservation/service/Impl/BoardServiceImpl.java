package com.api.reservation.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.BoardMapper;
import com.api.reservation.model.board.ReviewStatisticsDto;
import com.api.reservation.model.board.request.ReviewRequest;
import com.api.reservation.model.board.response.ReviewResponse;
import com.api.reservation.model.common.CommonResponseVo;
import com.api.reservation.model.common.MsgEnum;
import com.api.reservation.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	private BoardMapper boardMapper;
	
	@Autowired
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	@Override
	public List<ReviewResponse> getReviewList(int bizSeq) {
		return boardMapper.getReviewList(bizSeq);
	}

	@Override
	public HashMap<String, Double> getReviewStatistics(int bizSeq) {

		List<ReviewStatisticsDto> res = boardMapper.getReviewStatistics(bizSeq);
		
		HashMap<String, Double> map = new HashMap<>();
		
		for(int i=0; i < res.size(); i++) {
			
			if(i!=res.size()-1) {
				map.put(String.valueOf(res.get(i).getCol1()), res.get(i).getCol2());		
			}else {
				map.put("totalCnt", (double) res.get(i).getCol1());
				map.put("avg", res.get(i).getCol2());
			}
		}
		
		return map;
	}

	@Override
	public CommonResponseVo saveReview(ReviewRequest reviewRequest) {
		
		int saveCnt =0;
		try {
			saveCnt = boardMapper.saveReview(reviewRequest);	
		} catch (Exception e) {
			
			return CommonResponseVo.builder()
								   .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
								   .msg(MsgEnum.getMsg(HttpStatus.INTERNAL_SERVER_ERROR.value()))
								   .build();
		}
		
		if(saveCnt < 0) {
			return CommonResponseVo.builder()
								   .httpStatus(HttpStatus.BAD_REQUEST)
								   .msg(MsgEnum.getMsg(HttpStatus.BAD_REQUEST.value()))
								   .build();
		}else {
			return CommonResponseVo.builder()
								   .httpStatus(HttpStatus.OK)
								   .msg(MsgEnum.getMsg(HttpStatus.OK.value()))
								   .build();
		}
	}

}
