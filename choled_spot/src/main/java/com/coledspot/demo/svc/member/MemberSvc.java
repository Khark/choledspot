package com.coledspot.demo.svc.member;

import java.util.HashMap;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.coledspot.demo.domain.maria.member.MemberEntity;
import com.coledspot.demo.domain.maria.member.MemberReqDTO;
import com.coledspot.demo.domain.maria.member.MemberResDTO;

//public interface MemberSvc extends UserDetailsService{

public interface MemberSvc extends UserDetailsService {

	
	MemberEntity save(MemberReqDTO dto);
	HashMap<String, Object> findAll(Integer page, Integer size);
}
