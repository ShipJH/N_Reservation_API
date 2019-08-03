package com.api.reservation.model.board.response;

import java.time.LocalDateTime;

import com.api.reservation.model.board.ReviewDto;
import com.api.reservation.model.board.ReviewDto.ReviewDtoBuilder;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ReviewResponse {

	@ApiModelProperty(value="후기번호" , dataType ="int" , required=true)
	private int reviewSeq;

	@ApiModelProperty(value="후기내용" , dataType ="String" , required=true)
	private String reviewContent;

	@ApiModelProperty(value="사업장번호" , dataType ="String" , required=true)
	private String bizSeq;

	@ApiModelProperty(value="사용자번호" , dataType ="int" , required=true)
	private int userSeq;

	@ApiModelProperty(value="별점" , dataType ="double" , required=true)
	private double starPoint;

	@ApiModelProperty(value="상품번호" , dataType ="int" , required=true)
	private int productSeq;

	@ApiModelProperty(value="상품명" , dataType ="String")
	private String productName;
	
	@ApiModelProperty(value="옵션번호" , dataType ="int" , required=true)
	private int optionSeq;

	@ApiModelProperty(value="등록일" , dataType ="LocalDateTime" )
	private LocalDateTime regDate;

	@ApiModelProperty(value="수정일" , dataType ="LocalDateTime" )
	private LocalDateTime updDate;
	
}
