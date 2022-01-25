package com.opd.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.opd.management.model.LoginRequest;
import com.opd.management.model.RegistrationRequestModel;
import com.opd.management.service.AuthService;

@Controller
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/register")
	public String signup(@ModelAttribute("registration") RegistrationRequestModel reg) {
		if(authService.registration(reg)!=null) {
			return "login";
		}else
		{
			return "registration";
		}
		
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("LoginRequest") LoginRequest req) {
		if(authService.login(req)!=null) {
			return "welcome";
		}else {
			return "login";
		}
	
	}
	@GetMapping("/")
	public String strat() {
		return "login";
	
	}
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	
	}

}
