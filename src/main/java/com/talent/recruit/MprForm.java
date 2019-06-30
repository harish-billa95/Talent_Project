package com.talent.recruit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "mprform")
@Data
public class MprForm {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mpr_id")
	public Integer mprId;

	@Column(name = "department_name")
	public String departmentName;

	@Column(name = "requesting_manager")
	public String requestingManager;

	@Column(name = "position")
	public String position;
	

	@Column(name = "gender")
	public String gender;

	@Column(name = "skill_set")
	public String skillSet;

	@Column(name = "experience")
	public String experience;

	@Column(name = "visa_type")
	public String visaType;

	@Column(name = "shift_timings")
	public String shiftTimings;

	@Column(name = "supervisior")
	public String supervisior;

	@Column(name = "team_size")
	public String teamSize;

	@Column(name = "completion_date")
	public String completionDate;

	@Column(name = "hire_info")
	public String hireInfo;

	@Column(name = "mpr_date")
	public String mprDate;

	@Column(name = "responsibilties")
	public String responsibilties;

	@Column(name = "domain_expertise")
	public String domainExpertise;

	@Column(name = "function_head")
	public String functionHead;

	@Column(name = "hr_manager")
	public String hrManager;

	@Column(name = "approved")
	public String approved;

	@Column(name = "approvedby")
	public String approvedby;

	@Column(name = "status")
	public String status;

	@Column(name = "closing_date")
	public String closingDate;

	@Column(name = "recipient")
	public String recipient;

	@Column(name = "position_name")
	public String positionName;

	@Column(name = "budget_range")
	public String budgetRange;

	@Column(name = "assign_hr1")
	public String assignHr1;

	@Column(name = "assign_hr2")
	public String assignHr2;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "recipient1")
	public String recipient1;



}
