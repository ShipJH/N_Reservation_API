package com.api.reservation.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reservation.mapper.BoardMapper;
import com.api.reservation.model.board.response.ReviewResponse;
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

}
