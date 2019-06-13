package com.talent.candidate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="candidateregistrationdob")
@Data
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "can_id", updatable=false, nullable=false)
	private Integer canid;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "referred_by")
	private String referredBy;

	@Column(name = "file_path")
	private String filePath;
	@Column(name = "mobile")
	private String mobile;

	@Column(name = "hr")
	private String hrName;

	@Column(name = "email")
	private String email;
	@Column(name = "street")
	private String street;

	@Column(name = "previousCompany")
	private String previousCompany;

	@Column(name = "currentJobTitle")
	private String currentJobTitle;

	@Column(name = "experience")
	private String experience;

	@Column(name = "highestQualification")
	private String highestQualification;

	@Column(name = "specialization")
	private String specialization;

	@Column(name = "candidateStatus")
	private String candidateStatus;

	@Column(name = "source")
	private String source;
	@Column(name = "overallResult")
	private String overallResult;
	
	@Column(name = "candidate_availability")
	private String candidateAvailability;
	
}
