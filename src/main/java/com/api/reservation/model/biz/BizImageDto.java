package com.api.reservation.model.biz;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class BizImageDto {

	@ApiModelProperty(value="이미지번호", dataType="String" , required=true)
	private int imgSeq;

	@ApiModelProperty(value="이미지경로", dataType="String" , required=true)
	private String imgPath;

	@ApiModelProperty(value="이미지명", dataType="String" , required=true)
	private String imgName;

	@ApiModelProperty(value="저장파일명", dataType="String" , required=true)
	private String imgSavedName;

	@ApiModelProperty(value="사업장번호", dataType="String" , required=true)
	private int bizSeq;

	@ApiModelProperty(value="정렬순서", dataType="String")
	private int orderNum;

	@ApiModelProperty(value="사용여부", dataType="String")
	private String useYn;

	@ApiModelProperty(value="등록일", dataType="String")
	private LocalDateTime regDate;

	@ApiModelProperty(value="수정일", dataType="String")
	private LocalDateTime updDate;

}
