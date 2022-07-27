package com.coledspot.demo.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class MainController {

		
	@GetMapping("/home")
	public String home() {
		
	
		
		
		return "main/home";
	}
	
	@GetMapping("signup")
	public String signup() {
		
		
		return "main/signup";
	}
	
	

	
}
