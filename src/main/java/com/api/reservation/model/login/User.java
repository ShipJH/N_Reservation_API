package com.api.reservation.model.login;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

	private String userSeq;
	private String email;
	private String password;
	private String fullname;
	private String useYn;
	private String roles;

}