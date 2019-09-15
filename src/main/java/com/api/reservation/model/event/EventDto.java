package com.api.reservation.model.event;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class EventDto {
	
	/* 이벤트 번호 */
	@ApiModelProperty(value="이벤트 번호", dataType="int")
	private int eventSeq;
	
	/* 사업장 번호 */
	@ApiModelProperty(value="사업장 번호", dataType="int")
	private int bizSeq; 
	
	/* 이벤트 내용 */
	@ApiModelProperty(value="이벤트 내용", dataType="String")
	private String content;
	
	/* 이벤트 시작일 */
	@ApiModelProperty(value="이벤트 시작일", dataType="int")
	private int startDate;
	
	/* 이벤트 종료일 */
	@ApiModelProperty(value="이벤트 종료일", dataType="int")
	private int endDate;
	
	/* 등록일 */
	@ApiModelProperty(value="등록일", dataType="int")
	private int regDate;
	
	/* 수정일 */
	@ApiModelProperty(value="수정일", dataType="int")
	private int updDate;

}
