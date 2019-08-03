package com.api.reservation.model.product;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter @Setter
public class ProductOptionVo {

	@ApiModelProperty(value="옵션번호", dataType="int" , required=true)
	private int optionSeq;

	@ApiModelProperty(value="상품번호", dataType="int" , required=true)
	private int productSeq;

	@ApiModelProperty(value="옵션명", dataType="String" , required=true)
	private String optionName;

	@ApiModelProperty(value="옵션설명", dataType="String" , required=true)
	private String optionDes;

	@ApiModelProperty(value="가격", dataType="int" , required=true)
	private int price;

	@ApiModelProperty(value="등록일" , dataType ="LocalDateTime" )
	private LocalDateTime regDate;

	@ApiModelProperty(value="수정일" , dataType ="LocalDateTime" )
	private LocalDateTime updDate;

}
