package com.talent.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 @RequestMapping("/talent")
public class LoginController {
	
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	@PostMapping(value = "")
	public String Jack(){
	return "";
	}

}
