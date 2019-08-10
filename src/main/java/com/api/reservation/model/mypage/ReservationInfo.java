package com.api.reservation.model.mypage;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ReservationInfo {

	@ApiModelProperty(value="예약번호", dataType="int" , required=true)
	private int reservationSeq;

	@ApiModelProperty(value="사용자번호", dataType="int" , required=true)
	private int userSeq;

	//TODO: 2개 추가, 매장seq랑 , 상품 seq 
	
	@ApiModelProperty(value="결제방법(card,money)" , dataType ="String" )
	private String payType;

	@ApiModelProperty(value="결재일" , dataType ="LocalDateTime" )
	private LocalDateTime payDate;

	@ApiModelProperty(value="예약상태 (대기,승인,취소) wait,ok,cancel" , dataType ="String" )
	private String useCd;
	
	@ApiModelProperty(value="결재금액" , dataType ="int" ,required=true)
	private int totalPrice;


}
