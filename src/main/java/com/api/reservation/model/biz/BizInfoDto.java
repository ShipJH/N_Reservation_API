package com.api.reservation.model.biz;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class BizInfoDto {

	/* 사업장 번호 */
	@ApiModelProperty(value="사업장 번호", dataType="int")
	private int bizSeq; //추후 LONG 으로 변경.

	/* 사업장 이름 */
	@ApiModelProperty(value="사업장 이름", dataType="String" , required=true)
	private String bizName;

	/* 사업자 번호 */
	@ApiModelProperty(value="사업장 번호", dataType="String", required=true)
	private String bizNum;

	/* 사업장 분류 (숙박, 단순상품, 샵예약) */
	@ApiModelProperty(value="사업장 분류 (숙박, 단순상품, 샵예약)", dataType="String" , required=true)
	private String bizType;

	/* 주소 */
	@ApiModelProperty(value="주소", dataType="String" , required=true)
	private String bizAddress;

	/*우편번호*/
	@ApiModelProperty(value="주소", dataType="String" , required=true)
	private String bizZipcode;
	
	/*위도*/
	@ApiModelProperty(value="주소", dataType="String")
	private String bizMapLat;
	
	/*경도*/
	@ApiModelProperty(value="주소", dataType="String")
	private String bizMapLon;
	
	/* 전화번호 */
	@ApiModelProperty(value="전화번호", dataType="String")
	private String bizTel;

	/* 사업장 설명 */
	@ApiModelProperty(value="사업장 설명", dataType="String")
	private String bizDes;

	/* 사업장 간략설명 */
	@ApiModelProperty(value="사업장 간략설명", dataType="String")
	private String bizSimpleDes;

	/* 승인상태 */
	@ApiModelProperty(value="승인상태", dataType="String")
	private String approveYn;
	
	/* 사용여부 */
	@ApiModelProperty(value="사용여부 ( Y / N )", dataType="String")
	private String useYn;
	
	/* 등록일 */
	@ApiModelProperty(value="등록일", dataType="LocalDateTime")
	private LocalDateTime regDate;

	/* 수정일 */
	@ApiModelProperty(value="수정일", dataType="LocalDateTime")
	private LocalDateTime updDate;
	

}
