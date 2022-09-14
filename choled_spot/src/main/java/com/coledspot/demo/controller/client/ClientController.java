package com.coledspot.demo.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coledspot.demo.domain.maria.client.ClientEntity;


@Controller
@RequestMapping(path = "/client/*")
public class ClientController {

		@GetMapping("clientList")
		public String clienetList(Model model, @RequestParam(required = false, defaultValue = "0") 
		Integer page, @RequestParam(required = false, defaultValue = "10") Integer size ) throws Exception {
			System.out.println("####");
			try {
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			
			
			
			return "/client/clientList";
		}

		@GetMapping("clientWrite")
		public String clientWrite( @ModelAttribute("clientEntity") @Validated ClientEntity clientEntity, ModelMap mode) {

			return "/client/clientWrite";
		}
}
