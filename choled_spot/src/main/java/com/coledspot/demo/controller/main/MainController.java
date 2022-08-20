package com.coledspot.demo.controller.main;

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
	public String home() {
		
	
		
		
		return "main/home";
	}
	
	@GetMapping("signup")
	public String signup(@ModelAttribute("MemberReqDTO") MemberReqDTO memberReqDto, ModelMap model )  {
		
		model.addAttribute("MemberReqDTO", memberReqDto);
		return "main/signup";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "main/login";
	}
	
	@PostMapping("login")
	public String loginPost() {
		
		
		return "";
	}
	
}
