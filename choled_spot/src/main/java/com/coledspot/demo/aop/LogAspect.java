package com.coledspot.demo.aop;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
	Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Before("execution(* com.coledspot.demo.controller.*(..))")
    public void loggerBefore() {
        System.out.println("get으로 시작하는 메서드가 시작됩니다.");
    }
 
    @After("execution(* com.coledspot.demo.controller.*(..))")
    public void loggerAfter() {
        System.out.println("get으로 시작하는 메서드가 끝났습니다.");
    }
	
}
