package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.board.response.ReviewResponse;

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

}
