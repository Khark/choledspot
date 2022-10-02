package com.coledspot.demo.controller.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coledspot.demo.domain.maria.member.MemberReqDTO;

@Controller
@RequestMapping(path = "/")
public class MainController {

		
	@GetMapping("/home")
	public String home(HttpServletRequest req, HttpServletResponse resp)   {
		System.out.println("##");
		
		HttpSession session =  req.getSession(true);
		System.out.println("####"+ session.getAttribute("membername"));
		
		SecurityContext securityContext = SecurityContextHolder.getContext();
		
		return "main/home";
	}
	
	@GetMapping("signup")
	public String signup(@ModelAttribute("MemberReqDTO") MemberReqDTO memberReqDto, ModelMap model )  {
		
		model.addAttribute("MemberReqDTO", memberReqDto);
		System.out.println("#####memberid?"+memberReqDto.getMemberid());
		
		return "main/signup";
	}
	
	@GetMapping("admin_signup")
	public String admin_signup(@ModelAttribute("MemberReqDTO") MemberReqDTO memberReqDto, ModelMap model )  {
		
		model.addAttribute("MemberReqDTO", memberReqDto);
		return "main/admin_signup";
	}
	

	
	@GetMapping("client_signup")
	public String client_signup(@ModelAttribute("MemberReqDTO") MemberReqDTO memberReqDto, ModelMap model )  {
		
		model.addAttribute("MemberReqDTO", memberReqDto);
		return "main/client_signup";
	}
	

	@GetMapping("test")
	public String test() {
		return "client/clientList";
	}
	
	
	@GetMapping("login")
	public String login() {
		
		return "main/login";
	}
	
	@PostMapping("login")
	public String loginPost() {
		
		System.out.println("######loginpost?");
		return "";
	}
	
}
