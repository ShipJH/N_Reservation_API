package com.api.reservation.model.board.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ReviewRequest {

	@ApiModelProperty(value="후기내용" , dataType ="String" , required=true)
	private String reviewContent;

	@ApiModelProperty(value="사업장번호" , dataType ="int" , required=true)
	private int bizSeq;

	@ApiModelProperty(value="사용자번호" , dataType ="int" , required=true)
	private int userSeq;

	@ApiModelProperty(value="옵션번호" , dataType ="int" , required=true)
	private int optionSeq;

	@ApiModelProperty(value="상품번호" , dataType ="int" , required=true)
	private int productSeq;
	
	@ApiModelProperty(value="별점" , dataType ="double" , required=true)
	private double starPoint;


}
