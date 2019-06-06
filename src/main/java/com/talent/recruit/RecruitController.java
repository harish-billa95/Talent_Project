package com.talent.recruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/talent")
public class RecruitController {
@Autowired
MprFormRepository formrepo;

@GetMapping(value="/recuritment")
public String Recurit(Model model) {
	
	
	return "recuritmentHome";
}

@GetMapping(value="/mprForm")
public String mprForm(Model model) {
	
	
	return "CreateMpr";
}


@GetMapping(value="/addCandidate")
public String addCandidate(Model model) {
	
	
	return "registeration";
}


@GetMapping(value="/trfStatus")
public String trfStatus(Model model) {
	
	return "MPRstatus";
}







}
