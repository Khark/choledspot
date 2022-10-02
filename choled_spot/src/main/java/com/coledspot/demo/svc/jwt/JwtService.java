package com.coledspot.demo.svc.jwt;



public interface JwtService {

	
	public <T> String create(String key, T data, String subject);

	public boolean isUsable(String jwt);
}
