package com.api.reservation.model.common;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CommonResponseVo {

	@ApiModelProperty(value="HTTP 상태값")
	private HttpStatus httpStatus; 
}
