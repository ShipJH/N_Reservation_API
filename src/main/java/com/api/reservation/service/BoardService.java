package com.api.reservation.service;

import java.util.HashMap;
import java.util.List;

import com.api.reservation.model.board.request.ReviewRequest;
import com.api.reservation.model.board.response.ReviewResponse;
import com.api.reservation.model.common.CommonResponseVo;

public interface BoardService {

	/**
	 * 해당 매장의 리뷰를 가저온다
	 * @param bizSeq
	 * @return
	 */
	List<ReviewResponse> getReviewList(int bizSeq);

	/**
	 * 해당 매장의 리뷰의 평가점수를 가져온다.
	 * @param bizSeq
	 * @return
	 */
	HashMap<String, Double> getReviewStatistics(int bizSeq);

	/**
	 * 매장 리뷰를 저장한다.
	 * @param reviewRequest
	 * @return
	 */
	CommonResponseVo saveReview(ReviewRequest reviewRequest);


}
