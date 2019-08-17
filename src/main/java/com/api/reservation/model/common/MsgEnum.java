package com.api.reservation.model.common;

import lombok.Getter;
import lombok.Setter;

public enum MsgEnum {
	
	OK("success", 200),
	CREATED("리소스가 정상적으로 적용되었습니다.", 201),
	ERROR_400("잘못된 요청입니다.",400),
	ERROR_401("인증에 실패하였습니다.",401),
	ERROR_403("권한이 없습니다.",403),
	ERROR_404("해당 요청 페이지가 없습니다.",404),
	ERROR_500("내부 서버오류입니다. 담당자에게 문의하세요.", 500)
	;	
	
	/** 메세지 */
	@Getter @Setter
	private String msg;
	
	/** 코드 값 */
	@Getter	@Setter
	private int httpStatusCode;
    
    private MsgEnum(String msg, int httpStatusCode) {
    	this.msg = msg;
    	this.httpStatusCode = httpStatusCode;
    }
    
    public static String getMsg(int httpStatusCode) {
    	
    	String result = "";
    	   for(MsgEnum val : MsgEnum.values() ) {
    		   if(val.getHttpStatusCode() == httpStatusCode) {
    			   result = val.getMsg();
    		   }
           }
    	return result;
    }
}
