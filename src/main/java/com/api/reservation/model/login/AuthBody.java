package com.api.reservation.model.login;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthBody {
	
	@ApiModelProperty(value="email" , dataType ="String" , required=true)
    private String email;
	
	@ApiModelProperty(value="password" , dataType ="String" , required=true)
    private String password;
}
