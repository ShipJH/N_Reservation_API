package com.api.reservation.mapper;

import java.util.List;

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
	
}
