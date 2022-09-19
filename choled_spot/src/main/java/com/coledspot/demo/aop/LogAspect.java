package com.coledspot.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.log4j.Log4j2;



@Aspect
@Component
@Log4j2
public class LogAspect {
	//Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	//@Before("execution(* com.coledspot.demo.controller.*(..))")
	@Around("execution(* *..controller.*.*(..))")
	public Object calculateExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
		// 해당 클래스 처리 전의 시간
		StopWatch sw = new StopWatch();
		sw.start();

		// 해당 클래스의 메소드 실행
		Object result = pjp.proceed();

		// 해당 클래스 처리 후의 시간
		sw.stop();
		long executionTime = sw.getTotalTimeMillis();

		String className = pjp.getTarget().getClass().getName();
		String methodName = pjp.getSignature().getName();
		String task = className + "." + methodName;

		log.debug("[ExecutionTime] " + task + "-->" + executionTime + "(ms)");

		return result;
	}
    @Before("execution(* com.coledspot.demo.controller.*.*(..)) ")
   	public void loggerBefore() {
           System.out.println("aopaopffffㄹㄹㄹㄹㄹㄹㄹ222");
       }
    
    @After("execution(* com.coledspot.demo.controller.*.*(..)) ")
   	public void loggerAfter() {
           System.out.println("aopaopffffㄹㄹㄹㄹㄹㄹㄹ333");
       }
//    @After("execution(* com.coledspot.demo.controller.*(..))")
//    public void loggerAfter() {
//        System.out.println("get으로 시작하는 메서드가 끝났습니다.");
//    }
//	
}
