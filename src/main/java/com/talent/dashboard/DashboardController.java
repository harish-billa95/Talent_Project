package com.talent.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/talent")

@Controller
public class DashboardController {

@GetMapping(value="/dashboard")	
public String dashboard(@ModelAttribute Model model)
{
return "dashboard";	
}
}
