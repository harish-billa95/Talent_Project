package com.talent.recruit;

import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talent.login.AppUserRepository;
@Controller
@RequestMapping("/talent")
public class RecruitController {
	
	  @Autowired 
	  MprFormRepository mprepo;
	 
	  @Autowired
	  AppUserRepository apprepo;

@GetMapping(value="/recuritment")
public String Recurit(Model model ) {
	
	
	return "recuritmentHome";
}

@GetMapping(value="/viewMpr")
public String getViewMpr(Model model ) {
	
	
	return "ViewMPR";
}


@GetMapping(value="/mprForm")
public String mprForm(@ModelAttribute MprForm mprform,Model model,Principal principal) {
	String userName = principal.getName();
	DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
	String formattedDate = df.format(new Date());
	model.addAttribute("dateObj", formattedDate);
	model.addAttribute("addObj",userName);
	model.addAttribute("mprObj",mprepo.findAll());
	return "CreateMpr";
}


@PostMapping(value="/mprformPost")
public String mprPost(@ModelAttribute MprForm mprform,Principal principal) {
	MprForm obj = new MprForm();
	String userName = principal.getName();
	obj.setRequestingManager(userName);
	obj.setDepartmentName(mprform.getDepartmentName());
	obj.setPosition(mprform.getPosition());
	obj.setGender(mprform.getGender());
	obj.setPositionName(mprform.getPositionName());
	obj.setExperience(mprform.getExperience());
	obj.setShiftTimings(mprform.getShiftTimings());
	obj.setHireInfo(mprform.getHireInfo());
	obj.setTeamSize(mprform.getTeamSize());
	obj.setMprDate(mprform.getMprDate());
	obj.setSupervisior(mprform.getSupervisior());
	obj.setClosingDate(mprform.getClosingDate());
	obj.setResponsibilties(mprform.getResponsibilties());
	obj.setSkillSet(mprform.getSkillSet());
	obj.setDomainExpertise(mprform.getDomainExpertise());
	obj.setVisaType(mprform.getVisaType());
	mprepo.save(obj);
	return "redirect:/talent/mprForm";

}

@GetMapping(value="/addCandidate")
public String addCandidate(Model model) {
	
	
	return "registeration";
}


@GetMapping(value="/trfStatus")
public String trfStatus(@ModelAttribute MprForm mprform,Model model) {
	model.addAttribute("mprObj",mprepo.findAll());
	return "MPRstatus";
}







}
