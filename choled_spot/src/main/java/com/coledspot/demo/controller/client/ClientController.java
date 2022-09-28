package com.coledspot.demo.controller.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coledspot.demo.domain.maria.client.ClientEntity;
import com.coledspot.demo.domain.maria.client.ClientReqDTO;


@Controller
@RequestMapping("/client/*")
public class ClientController {

		@GetMapping("clientList")
		public String clienetList(Model model, @RequestParam(required = false, defaultValue = "0") 
		Integer page, @RequestParam(required = false, defaultValue = "10") Integer size ,HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		
		// session data parameter is null..
		
		try {
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			
			
			
			return "client/clientList";
		}

		@GetMapping("clientWrite")
		public String clientWrite( @ModelAttribute("ClientReqDTO") @Validated ClientReqDTO ClientReqDTO, ModelMap model, HttpServletRequest request) {
			HttpSession session = request.getSession();
			System.out.println("####memberid?"+session.getAttribute("memberid"));
			model.addAttribute("ClientReqDTO", ClientReqDTO);
			
			return "client/clientWrite";
		}
}
