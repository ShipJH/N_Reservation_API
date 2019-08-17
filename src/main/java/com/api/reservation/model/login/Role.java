package com.api.reservation.model.login;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Role {

	@ApiModelProperty(value="email" , dataType ="String" , required=true)
	private String id;

	@ApiModelProperty(value="권한" , dataType ="String" , required=true)
	private String role;
}