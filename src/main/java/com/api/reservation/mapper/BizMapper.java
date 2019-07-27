package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.BizInfoDto;

@Mapper
public interface BizMapper {

	
	@Select(" SELECT * "
			+ " FROM BIZ_INFO ")
	List<BizInfoDto> getBizList();

	@Insert(" INSERT INTO BIZ_INFO ( "
			+ " 					  BIZ_NAME "
			+ " 					, BIZ_NUM "
			+ " 					, BIZ_TYPE "
			+ " 					, BIZ_ADDRESS "
			+ " 					, BIZ_ZIPCODE "
			+ " 					, BIZ_MAP_LAT "
			+ " 					, BIZ_MAP_LON "
			+ " 					, BIZ_TEL "
			+ " 					, BIZ_SIMPLE_DES "
			+ " 					, BIZ_DES "
			+ " 					)  "
			+ " 			 VALUES ( "
			+ " 					  #{bizName} "
			+ " 					, #{bizNum} "
			+ " 					, #{bizType} "
			+ " 					, #{bizAddress} "
			+ " 					, #{bizZipcode} "
			+ " 					, #{bizMapLat} "
			+ " 					, #{bizMapLon} "
			+ " 					, #{bizTel} "
			+ " 					, #{bizSimpleDes} "
			+ " 					, #{bizDes} "
			+ " 					) "
			+ " ")
	int saveBiz(BizInfoDto bizInfoDto);
	
}
