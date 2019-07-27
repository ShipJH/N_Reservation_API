package com.api.reservation.model.login;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthBody {
    private String email;
    private String password;
}
