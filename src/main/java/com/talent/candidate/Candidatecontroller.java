package com.talent.candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talent.recruit.MprFormRepository;
@Controller
@RequestMapping("/talent")
public class Candidatecontroller {
	@Autowired
	CandidateFormRepository formrepo;

	@GetMapping(value="/recuritments")
	public String Recurit(Model model) {
		
		
		return "recuritmentHome";
	}

	@GetMapping(value="/candidateregistrationdob")
	public String Candidate(Model model) {
		
		
		return "candidateinfo";
	}


	
}
