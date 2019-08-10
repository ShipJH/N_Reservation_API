package com.api.reservation.model.biz.response;

import java.util.List;

import com.api.reservation.model.biz.BizImageDto;
import com.api.reservation.model.biz.BizInfoDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BizInfoResponse {

	@ApiModelProperty(value="매장 번호", dataType="int")
	private int bizSeq;
	
	@ApiModelProperty(value="매장 정보", dataType="Object")
	private BizInfoDto bizInfo;
	
	@ApiModelProperty(value="매장  이미지", dataType="Object")
	private List<BizImageDto> bizImageList;
	
}
