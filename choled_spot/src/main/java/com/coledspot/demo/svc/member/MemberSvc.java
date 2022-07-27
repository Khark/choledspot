package com.coledspot.demo.svc.member;

import java.util.HashMap;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.coledspot.demo.domain.maria.member.MemberReqDTO;

//public interface MemberSvc extends UserDetailsService{

public interface MemberSvc extends UserDetailsService {

	
	Integer save(MemberReqDTO dto);
	HashMap<String, Object> findAll(Integer page, Integer size);
}
