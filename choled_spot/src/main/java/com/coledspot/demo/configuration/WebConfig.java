package com.coledspot.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	private static final String[] EXCLUDE_PATH = {
			"member/**",
			"error/**"
	}
	;
	
	@Autowired
	private JwtInterceptor jwtIntercepter;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtIntercepter).addPathPatterns("/**")
			.excludePathPatterns(EXCLUDE_PATH);
	}
}
