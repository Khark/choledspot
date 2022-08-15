package com.coledspot.demo.controller.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coledspot.demo.domain.maria.member.MemberReqDTO;
import com.coledspot.demo.svc.member.MemberSvc;

@RestController
@RequestMapping("rest/*")
public class MainRestController {

	@Autowired
	public MemberSvc membersvc;
	
	@PostMapping("signup")
	public MemberReqDTO signup(@RequestBody MemberReqDTO dto, HttpServletRequest request )  {
		MemberReqDTO vo = new MemberReqDTO();
		System.out.println("##sayhi?");
		
		String result = "";
		System.out.println("@@accountid?"+dto.getAccountid());
				
		vo = dto;
		// membersvc.save(dto);
				
		
		return  vo ;
	}
	
	
	
}
