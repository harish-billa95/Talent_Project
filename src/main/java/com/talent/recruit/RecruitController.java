package com.talent.recruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
(value="/talent")
public class RecruitController {
@Autowired
MprFormRepository formrepo;

@GetMapping(value="/requestor")
public String Recurit(@ModelAttribute MprForm mprForm) {
	
	
	return "";
}

}
