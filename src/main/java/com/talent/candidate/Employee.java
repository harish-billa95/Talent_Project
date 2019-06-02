package com.talent.candidate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee_evaluation")
@Data
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_form_id")
	public Integer id;
   	
	@Column(name = "interview_date")
	public String interviewDate;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "experience")
	public String experience;
    
	@Column(name = "technical_panel1")
	public String technicalPanel1;
	
	@Column(name = "technical_panel2")
	public String technicalPanel2;

	@Column(name = "concept_one")
	public String conceptOne;
	
	@Column(name = "concept_two")
	public String conceptTwo;

	@Column(name = "technical_one")
	public String technicalOne;

	@Column(name = "technical_two")
	public String technicalTwo;

	@Column(name = "analaytical_one")
	public String analayticalOne;

	@Column(name = "mode_Of")
	public String modeOf;
	
	@Column(name = "analaytical_two")
	public String analayticalTwo;

	///@Column(name = "problem_one")
//	public String problemOne;

//	@Column(name = "problem_two")
//	public String problemTwo;

//	@Column(name = "overall_one")
	//public String overallOne;
	
	//@Column(name = "overall_two")
	//public String overallTwo;

	@Column(name = "hr_comments1")
	public String hr_Comments1;

	@Column(name = "hr_comments2")
	public String hr_Comments2;

	@Column(name = "technicalInterviewStatus")
	public String technicalInterviewStatus;

	@Column(name = "previous_company")
	public String previousCompany;

	@Column(name = "current_job_title")
	public String currentJobTitle;

	@Column(name = "previous_ctc")
	public String previousCtc;

	@Column(name = "expected_ctc")
	public String expectedCtc;

	//@Column(name = "notice_period")
	//public String noticePeriod;

	@Column(name = "buy_out_option")
	public String buyOutOption;

	//@Column(name = "interview_panel3")
	//public String interviewPanel3;

	//@Column(name = "interview_panel4")
	//public String interviewPanel4;

	@Column(name = "referred_by")
	public String referredBy;

	@Column(name = "communication_one")
	public String communicationOne;

	@Column(name = "communicatio_two")
	public String communicationTwo;

	@Column(name = "aptitude_one")
	public String aptitudeOne;

	@Column(name = "aptitude_two")
	public String aptitudeTwo;

	//@Column(name = "leader_one")
	//public String leaderOne;

	//@Column(name = "leader_two")
	//public String leaderTwo;

	//@Column(name = "initiative_one")
	//public String initiativeOne;

	 @Column(name = "initiative_two")
	public String initiativeTwo;

//	@Column(name = "willlear_one")
//	public String willlearnOne;
	
	//@Column(name = "willlearn_two")
	//public String willlearnTwo;

	//@Column(name = "overall_three")
	//public String overallThree;

	//@Column(name = "overall_four")
	//public String overallFour;
	
	@Column(name = "hr_interview_status")
	public String hrInterviewStatus;

	@Column(name = "hr_comments3")
	public String hrcomments3;

	@Column(name = "hr_comments4")
	public String hrcomments4;
	
	@Column(name = "overall_result")
	public String overallResult;
	
	@Column(name = "position_name")
	public String positionName;
	
	

}
