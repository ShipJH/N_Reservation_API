package com.api.reservation.model.login;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

	@ApiModelProperty(value="유저 고유번호" , dataType ="String" , required=true)
	private String userSeq;
	
	@ApiModelProperty(value="email" , dataType ="String" , required=true)
	private String email;
	
	@ApiModelProperty(value="password" , dataType ="String" , required=true)
	private String password;
	
	@ApiModelProperty(value="이름" , dataType ="String" , required=true)
	private String fullname;
	
	@ApiModelProperty(value="사용상태" , dataType ="String")
	private String useYn;
	
	@ApiModelProperty(value="권한" , dataType ="String")
	private String roles;

}