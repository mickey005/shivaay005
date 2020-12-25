package com.luv2code.shivaay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ShivaayController {
	
	
	@RequestMapping("/home")
	public String getHomePage() {
		
		return "pages/home";
	}
	
	
	@GetMapping("/shivaay")
	public String getTemplate(Model theModel) {
		

		
		return "/pages/themeImpementation";
		
	}

}
