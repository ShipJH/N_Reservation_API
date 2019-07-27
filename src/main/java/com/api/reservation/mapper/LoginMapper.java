package com.api.reservation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.reservation.model.login.User;

@Mapper
public interface LoginMapper {

	@Select(" SELECT * "
			+ " FROM USER "
			+ " WHERE EMAIL = #{email} ") 
	User findByEmail(String email);

	@Insert(" INSERT INTO USER ( "
            + "               EMAIL "
            + "              ,PASSWORD "
            + "              ,FULLNAME "
            + "              ,USE_YN "
            + "              ,ROLES "
			+ " 			    )  "
			+ " 	     VALUES ( "
            + "               #{email} "
            + "              ,#{password} "
            + "              ,#{fullname} "
            + "              ,#{useYn} "
            + "              ,#{roles} "
			+ " 				) "
			+ " ")
	void saveUser(User user);

}
