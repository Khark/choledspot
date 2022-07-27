package com.coledspot.demo.controller.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coledspot.demo.domain.maria.member.MemberReqDTO;
import com.coledspot.demo.svc.member.MemberSvc;

@RestController
@RequestMapping(path = "/rest/*")
public class MainRestController {

	@Autowired
	public MemberSvc membersvc;
	
	@PostMapping("signup")
	public String signup(MemberReqDTO dto, HttpServletRequest request ) throws Exception {
		System.out.println("#############rest/signup");
		String result = "";
		
		
		membersvc.save(dto);
				
		return result;
	}
	
	
	
}
