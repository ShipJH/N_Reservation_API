package com.api.reservation.model.biz.response;

import com.api.reservation.model.biz.BizInfoDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BizInfoMainResponse {

	@ApiModelProperty(value="매장 번호", dataType="int")
	private int bizSeq;
	
	@ApiModelProperty(value="매장 대표이미지", dataType="String")
	private String img;
	
	@ApiModelProperty(value="매장 정보", dataType="Object")
	private BizInfoDto bizInfo;
}
