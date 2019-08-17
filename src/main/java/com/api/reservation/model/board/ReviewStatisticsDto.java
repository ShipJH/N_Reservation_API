package com.api.reservation.model.board;

import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter @Setter
public class ReviewStatisticsDto {

	@ApiModelProperty(value="컬럼1 (명칭)" , dataType ="String" )
	private int col1;
	
	@ApiModelProperty(value="컬럼2 (갯수)", dataType ="int" )
	private Double col2;
	
}
