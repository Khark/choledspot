package com.coledspot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopLoggingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AopLoggingApplication.class, args);
	}

	
}
