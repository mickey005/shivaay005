package com.luv2code.shivaay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ShivaayController {
	
	
	@RequestMapping("/home")
	public String getHomePage() {
		
		return "pages/home";
	}

}
