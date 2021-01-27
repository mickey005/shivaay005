package com.luv2code.shivaay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.shivaay.entity.Mail;

@Controller
@RequestMapping("/")
public class ShivaayController {
	
	
	@RequestMapping("/home")
	public String getHomePage(Model theModel) {
		
		theModel.addAttribute("mail",new Mail());
		return "pages/home";
	}
	
	
	@GetMapping("/shivaay")
	public String getTemplate(Model theModel) {
		

		
		return "pages/themeImpementation";
		
	}
	
	@RequestMapping("/mail")
	public String getHomePageMail(@ModelAttribute Mail theEmail) {
		
		System.out.println("anand >> email >>"+theEmail.getEmail());
		
		System.out.println(theEmail.getName());
		
		//theModel.addAttribute("mail",new Mail());
		return "pages/home";
	}

}
