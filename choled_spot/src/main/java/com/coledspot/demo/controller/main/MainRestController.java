package com.coledspot.demo.controller.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coledspot.demo.domain.maria.member.MemberEntity;
import com.coledspot.demo.domain.maria.member.MemberReqDTO;
import com.coledspot.demo.svc.member.MemberSvc;

@RestController
@RequestMapping("rest/*")
public class MainRestController {

	@Autowired
	public MemberSvc membersvc;
	
	@SuppressWarnings("unused")
	@PostMapping("signup")
	public MemberEntity signup(@RequestBody MemberReqDTO dto, HttpServletRequest request )  {
		//String referer = (String)request.getHeader("REFERER");
		//회원용 가입 
		MemberEntity me = new MemberEntity();
		String refer = request.getHeader("REFERER");
		System.out.println("###refer? "+refer.substring(refer.lastIndexOf("/")+1 , refer.length()));
		
		if(refer != null ) {
			refer = refer.substring(refer.lastIndexOf("/")+1 , refer.length());
			dto.setUseyn("Y");
			if(refer.equals("signup")) {
				dto.setRole(1);
			}else if(refer.equals("clientup")) {
				dto.setRole(2);
				
			}else if(refer.equals("adminup")) {
				dto.setRole(9);
				
			}
			if(dto.getRole() != null) {
				me = membersvc.save(dto);
			}else {
				me.setError("ProcessFail");
			}
		}else {
			me.setError("NotAccess");
		}
		
		
		
		return  me;
	}
	
	
	
}
