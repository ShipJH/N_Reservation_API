package com.api.reservation.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyPageMapper {

	@Select("  "
			+ " SELECT A.RESERVATION_SEQ "
			+ " 	  ,A.PAY_TYPE "
			+ "       ,A.USE_CD "
			+ "       ,A.TOTAL_PRICE "
			+ " 	  ,B.BIZ_SEQ "
			+ "       ,B.BIZ_NAME "
			+ "       ,C.PRODUCT_SEQ "
			+ "       ,C.PRODUCT_NAME "
			+ "   FROM RESERVATION A INNER JOIN BIZ_INFO B "
			+ " 							 ON A.BIZ_SEQ = B.BIZ_SEQ "
			+ "                      INNER JOIN PRODUCT C "
			+ "                              ON A.PRODUCT_SEQ = C.PRODUCT_SEQ "
			+ "   WHERE USER_SEQ = #{userSeq} "
			+ " ") 
	@Results(value = {@Result(property = "reservationSeq", column = "RESERVATION_SEQ", javaType=Integer.class )
					 ,@Result(property = "payType", column = "PAY_TYPE" )
					 ,@Result(property = "useCd", column = "USE_CD" )
					 ,@Result(property = "totalPrice", column = "TOTAL_PRICE", javaType=Integer.class)
					 ,@Result(property = "bizSeq", column = "BIZ_SEQ" , javaType=Integer.class )	
					 ,@Result(property = "bizName", column = "BIZ_NAME" )
					 ,@Result(property = "productSeq", column = "PRODUCT_SEQ", javaType=Integer.class )
					 ,@Result(property = "productName", column = "PRODUCT_NAME")})
	List<HashMap<String, Object>> getReservationInfo(int userSeq);

	@Select(" "
			+" SELECT A.OPTION_SEQ "
			+" 	     ,B.OPTION_NAME "
			+" 	     ,B.OPTION_DES "
			+"   FROM RESERVATION_DETAIL A INNER JOIN PRODUCT_OPTION B "
			+"     								   ON A.OPTION_SEQ = B.OPTION_SEQ "
			+"  WHERE RESERVATION_SEQ = #{reservationSeq} "
			+ " ")
	@Results(value = {@Result(property = "optionSeq", column = "OPTION_SEQ", javaType=Integer.class )
	 				 ,@Result(property = "optionName", column = "OPTION_NAME" )
					 ,@Result(property = "optionDes", column = "OPTION_DES")})
	List<HashMap<String, Object>> getReservaionDetail(int reservationSeq);

}
