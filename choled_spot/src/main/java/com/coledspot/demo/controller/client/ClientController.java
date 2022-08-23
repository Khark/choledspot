package com.coledspot.demo.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/client/*")
public class ClientController {

		@GetMapping("clientList")
		public String clienetList(Model model, @RequestParam(required = false, defaultValue = "0") 
		Integer page, @RequestParam(required = false, defaultValue = "10") Integer size ) throws Exception {
			
			try {
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			
			
			
			return "/client/clientList";
		}
}
