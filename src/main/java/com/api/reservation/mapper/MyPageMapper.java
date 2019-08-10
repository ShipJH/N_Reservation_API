package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.mypage.ReservationInfo;

@Mapper
public interface MyPageMapper {

	@Select("  "
			+ " SELECT *  "
			+ "   FROM RESERVATION "
			+ "  WHERE USER_SEQ = #{userSeq} "
			+ " ") 
	List<ReservationInfo> getReservationHistory(int userSeq);

}
