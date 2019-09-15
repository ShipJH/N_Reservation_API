package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.biz.BizImageDto;
import com.api.reservation.model.biz.BizInfoDto;

@Mapper
public interface BizMapper {

	@Select("  SELECT * "
			+ "  FROM BIZ_INFO "
			+ " ")
	List<BizInfoDto> getBizInfoList();

	@Select("  SELECT * "
			+ "  FROM BIZ_IMAGE "
			+ " WHERE BIZ_SEQ = #{bizSeq} "
			+ " ORDER BY ORDER_NUM ASC ")
	List<BizImageDto> getBizImgList(int bizSeq);

	@Select("  SELECT * "
			+ "  FROM BIZ_INFO "
			+ " WHERE BIZ_SEQ = #{bizSeq} "
			+ " ")
	BizInfoDto getBiz(int bizSeq);
	
	@Insert("  INSERT INTO BIZ_INFO ("
		+ "						BIZ_NAME"
		+ "						,BIZ_NUM"
		+ "						,BIZ_TYPE"
		+ "						,BIZ_ADDRESS"
		+ "						,BIZ_ZIPCODE"
		+ "						,BIZ_MAP_LAT"
		+ "						,BIZ_MAP_LON"
		+ "						,BIZ_TEL"
		+ "						,BIZ_EMAIL"
		+ "						,BIZ_SIMPLE_DES"
		+ "						,BIZ_DES"
		+ "						,REG_DATE"
		+ "	 						)"
		+ "					VALUES ("
		+ "						#{bizName}"
		+ "						,#{bizNum}"
		+ "						,#{bizType}"
		+ "						,#{bizAddress}"
		+ "						,#{bizZipcode}"
		+ "						,#{bizMapLat}"
		+ "						,#{bizMapLon}"
		+ "						,#{bizTel}"
		+ "						,#{bizEmail}"
		+ "						,#{bizSimpleDes}"
		+ "						,#{bizDes}"
		+ "						,NOW()"
			+ "						)")
	void saveBizInfo(BizInfoDto bizInfoDto);
	
}
