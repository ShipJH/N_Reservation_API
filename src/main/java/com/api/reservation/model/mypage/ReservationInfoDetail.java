package com.api.reservation.model.mypage;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ReservationInfoDetail {
	
	@ApiModelProperty(value="예약상세번호", dataType="int" , required=true)
	private int reservationDetailSeq;

	@ApiModelProperty(value="사업장번호", dataType="int" , required=true)
	private int bizSeq;

	@ApiModelProperty(value="상품번호", dataType="int" , required=true)
	private int productSeq;

	@ApiModelProperty(value="옵션번호", dataType="int" , required=true)
	private int optionSeq;
}
