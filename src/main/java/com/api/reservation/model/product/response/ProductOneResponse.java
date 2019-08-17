package com.api.reservation.model.product.response;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductOneResponse {
	@ApiModelProperty(value="상품번호", dataType="int" , required=true)
	private int productSeq;

	@ApiModelProperty(value="사업장번호", dataType="int" , required=true)
	private int bizSeq;

	@ApiModelProperty(value="상품명", dataType="String" , required=true)
	private String productName;

	@ApiModelProperty(value="상품설명", dataType="String" , required=true)
	private String productDes;

	@ApiModelProperty(value="상품타입 (날짜,날짜시간,단순옵션)", dataType="String" , required=true)
	private String productType;

	@ApiModelProperty(value="복수선택여부(단수,복수)", dataType="String" , required=true)
	private String multiYn;

	@ApiModelProperty(value="사용여부", dataType="String" , required=true)
	private String useYn;

	@ApiModelProperty(value="시스템결제여부", dataType="String" )
	private String payYn;

	@ApiModelProperty(value="등록일" , dataType ="LocalDateTime" )
	private LocalDateTime regDate;

	@ApiModelProperty(value="수정일" , dataType ="LocalDateTime" )
	private LocalDateTime updDate;
	
	@ApiModelProperty(value="이미지경로" , dataType ="String" )
	private String imgPath;
}
