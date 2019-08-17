package com.api.reservation.handler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AopLogHandler {

	@Around("within(com.api.reservation.controller.*)")
    public Object logBefore(ProceedingJoinPoint point) throws Throwable {

        long start = System.currentTimeMillis();
        Object resultVal = point.proceed();
        long processTime = System.currentTimeMillis() - start;

        StringBuilder sb = new StringBuilder();
        Object[] params = point.getArgs();

        int i = 0;
        for (Object param : params) {
            if (param != null) {
                if (i > 0) sb.append(", ");
                sb.append(param.toString());
                i++;
            }
        } 
        
        log.info("---------------------------------------------------------------------------------------------------------------------------");
        log.info("Processing Time({}) : {} ms", point.getSignature().toShortString(), processTime);
        log.info("Param : {}", sb.toString());
        if (resultVal != null) {
        	log.info("Result : {}", resultVal.toString());        	
        }
        log.info("---------------------------------------------------------------------------------------------------------------------------");

        return resultVal;
    }
}
