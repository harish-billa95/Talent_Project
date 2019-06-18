package com.talent.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/talent")
public class DashboardController {

@GetMapping(value="/dashboard")	
public String dashboard( Model model){

	return "dashboard";	
}
}
