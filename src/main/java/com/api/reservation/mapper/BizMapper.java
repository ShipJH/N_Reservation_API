package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.biz.BizImageDto;
import com.api.reservation.model.biz.BizInfoDto;

@Mapper
public interface BizMapper {

	
	@Select(" SELECT * "
			+ " FROM BIZ_INFO ")
	List<BizInfoDto> getBizList();

	@Select("  SELECT * "
			+ "  FROM BIZ_INFO "
			+ " ")
	List<BizInfoDto> getBizInfoList();

	@Select("  SELECT * "
			+ "  FROM BIZ_IMAGE "
			+ " WHERE BIZ_SEQ = #{bizSeq} ")
	List<BizImageDto> getBizImgList(int bizSeq);
	
}
