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
public class ProductImageVo {

	@ApiModelProperty(value = "상품이미지번호", dataType = "int", required = true)
	private int productImgSeq;

	@ApiModelProperty(value = "사업장번호", dataType = "int")
	private int bizSeq;

	@ApiModelProperty(value = "상품번호", dataType = "int")
	private int productSeq;

	@ApiModelProperty(value = "이미지경로", dataType = "String")
	private String imgPath;

	@ApiModelProperty(value = "이미지명", dataType = "String")
	private String imgName;

	@ApiModelProperty(value = "저장파일명", dataType = "String")
	private String imgSavedName;

	@ApiModelProperty(value = "대표이미지여부", dataType = "String")
	private String mainYn;

	@ApiModelProperty(value = "정렬순서", dataType = "String")
	private int orderNum;

	@ApiModelProperty(value = "사용여부", dataType = "String")
	private String useYn;

	@ApiModelProperty(value = "등록일", dataType = "LocalDateTime")
	private LocalDateTime regDate;

	@ApiModelProperty(value = "수정일", dataType = "LocalDateTime")
	private LocalDateTime updDate;

}
