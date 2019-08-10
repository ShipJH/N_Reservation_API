package com.api.reservation.model.mypage.response;

import java.util.HashMap;
import java.util.List;

import com.api.reservation.model.mypage.ReservationInfoVo;
import com.api.reservation.model.mypage.ReservationInfoDetailVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ReservationResponse {

	@ApiModelProperty(value="예약 정보 고유값", dataType="int")
	private int reservationSeq;
	
	@ApiModelProperty(value="지불방법", dataType="String")
	private String payType;
	
	@ApiModelProperty(value="예약상태 (대기,승인,취소) wait,ok,cancel" , dataType ="String" )
	private String useCd;
	
	@ApiModelProperty(value="합계가격", dataType="int")
	private int totalPrice;
	
	@ApiModelProperty(value="매장 고유값", dataType="int")
	private int bizSeq;
	
	@ApiModelProperty(value="매장 명", dataType="String")
	private String bizName;
	
	@ApiModelProperty(value="상품 고유값", dataType="int")
	private int productSeq;
	
	@ApiModelProperty(value="상품 명", dataType="String")
	private String productName;
	
	@ApiModelProperty(value="예약 정보", dataType="Object")
	private List<HashMap<String, Object>> reservationDetailList;
	
}
