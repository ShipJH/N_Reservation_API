package com.api.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.BizInfo;

@Mapper
public interface BizMapper {

	
	@Select(" SELECT * "
			+ " FROM BIZ_INFO ")
	List<BizInfo> getBizList();

	@Select(" SELECT BIZ_NAME as bizName , BIZ_ADDRESS FROM BIZ_INFO WHERE BIZ_SEQ = 1 ")
	BizInfo jdbcTest();

	
	
	
}
