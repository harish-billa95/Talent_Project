package com.talent.recruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.talent.login.AppUser;
import com.talent.login.AppUserRepository;
@Controller
@RequestMapping("/talent")
public class RecruitController {
	
	  @Autowired 
	  MprFormRepository formrepo;
	 
	  @Autowired
	  AppUserRepository apprepo;

@GetMapping(value="/recuritment")
public String Recurit(Model model ) {
	
	
	return "recuritmentHome";
}

@GetMapping(value="/mprForm")
public String mprForm(@ModelAttribute MprForm mprform,Model model) {
	model.addAttribute("userObj",apprepo.findAll());
	model.addAttribute("mprObj",formrepo.findAll());
	return "CreateMpr";
}


@PostMapping(value="/mprformPost")
public String mprPost(@RequestParam  Integer mprId ,@ModelAttribute MprForm mprform,AppUser appuser) {
	appuser.setUserName("ArchanaSivaraj");
	MprForm obj = formrepo.findByMprId(mprId);
	obj.setRequestingManager(mprform.get(appuser));
	formrepo.save(obj);
	return "redirect:/talent/mprForm";

}

@GetMapping(value="/addCandidate")
public String addCandidate(Model model) {
	
	
	return "registeration";
}


@GetMapping(value="/trfStatus")
public String trfStatus(@ModelAttribute MprForm mprform,Model model) {
	model.addAttribute("mprObj",formrepo.findAll());
	return "MPRstatus";
}







}
