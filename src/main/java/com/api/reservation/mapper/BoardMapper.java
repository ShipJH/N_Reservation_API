package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.board.ReviewDto;

@Mapper
public interface BoardMapper {

	@Select("  SELECT * "
			+ "  FROM REVIEW "
			+ " WHERE BIZ_SEQ = #{bizSeq} "
			+ " ") 
	List<ReviewDto> getReviewList(int bizSeq);

}
