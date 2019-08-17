package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.board.ReviewStatisticsDto;
import com.api.reservation.model.board.request.ReviewRequest;
import com.api.reservation.model.board.response.ReviewResponse;

import io.swagger.annotations.ApiModelProperty;

@Mapper
public interface BoardMapper {

	@Select(" SELECT A.REVIEW_SEQ " 
			+ "	    ,A.REVIEW_CONTENT " 
			+ "	    ,A.BIZ_SEQ " 
			+ "	    ,A.USER_SEQ " 
			+ "	    ,A.STAR_POINT " 
			+ "	    ,A.PRODUCT_SEQ " 
			+ "	    ,A.OPTION_SEQ " 
			+ "	    ,A.REG_DATE " 
			+ "	    ,A.UPD_DATE " 
			+ "	    ,B.PRODUCT_NAME " 
			+ " FROM REVIEW A INNER JOIN PRODUCT B  " 
			+ "						ON A.PRODUCT_SEQ = B.PRODUCT_SEQ " 
			+ "WHERE A.BIZ_SEQ = #{bizSeq} "
			+ " ") 
	List<ReviewResponse> getReviewList(int bizSeq);

	@Select("  "
			+ " SELECT STAR_POINT AS col1 "
			+ " 	  ,COUNT(1) OVER(PARTITION BY STAR_POINT) AS col2 "
			+ "   FROM REVIEW "
			+ "  WHERE BIZ_SEQ = #{bizSeq} "
			+ "  "
			+ " UNION ALL "
			+ "  "
			+ " SELECT COUNT(1) "
			+ " 	  ,AVG(STAR_POINT) "
			+ "   FROM REVIEW  "
			+ "  WHERE BIZ_SEQ = #{bizSeq} "
			+ " ")
	List<ReviewStatisticsDto> getReviewStatistics(int bizSeq);

	@Insert(" "
			+ "INSERT INTO REVIEW ( "
			+ "					REVIEW_CONTENT "
			+ "					,BIZ_SEQ "
			+ "					,USER_SEQ "
			+ "					,OPTION_SEQ "
			+ "					,PRODUCT_SEQ "
			+ "					,STAR_POINT "
			+ "					,RESERVATION_SEQ "
			+ "					)  "
			+ "			VALUES ("
			+ "					 #{reviewContent} "
			+ "					,#{bizSeq} "
			+ "					,#{userSeq} "
			+ "					,#{optionSeq} "
			+ "					,#{productSeq} "
			+ "					,#{starPoint} "
			+ "					,#{reservationSeq} "
			+ "					) "
			+ " ")
	int saveReview(ReviewRequest reviewRequest);

}

