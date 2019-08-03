package com.api.reservation.service;

import java.util.List;

import com.api.reservation.model.board.ReviewDto;

public interface BoardService {

	/**
	 * 해당 매장의 리뷰를 가저온다
	 * @param bizSeq
	 * @return
	 */
	List<ReviewDto> getReviewList(int bizSeq);


}
