package com.coledspot.demo.svc.jwt;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("jwtService")
public class JwtServiceImpl implements JwtService {

	private static final String SALT =  "luvookSecret";

	@Override
	public <T> String create(String key, T data, String subject) {
		// TODO Auto-generated method stub
		String jwt = Jwts.builder()
				 .setHeaderParam("typ", "JWT")
				 .setHeaderParam("regDate", System.currentTimeMillis())
				 .setSubject(subject)
				 .claim(key, data)
				 .signWith(SignatureAlgorithm.HS256, this.generateKey())
				 .compact();
				
		
		
		
		return jwt;
	}
	
	private byte[] generateKey() {
		byte [] key = null;
		try {
			key = SALT.getBytes("UTF-8");
		}catch (UnsupportedEncodingException e) {
		
			if(log.isInfoEnabled()){
				e.printStackTrace();
			}else{
				log.error("Making JWT Key Error ::: {}", e.getMessage());
			}
		
		}
		
		return key;
	}

	@Override
	public boolean isUsable(String jwt) {
		// TODO Auto-generated method stub
		try {

			return false;

		}catch (Exception e) {
			// TODO: handle exception
			return new UnauthorizedException();

		}
		
	}
	
	
}
