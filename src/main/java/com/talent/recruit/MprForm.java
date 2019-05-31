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
	@Column(name = "id")
	public Integer id;

	@Column(name = "departmentName")
	private String departmentName;
	@Column(name = "requestingManager")
	private String requestingManager;
	@Column(name = "position")
	private String position;
	@Column(name = "gender")
	private String gender;
	@Column(name = "skillSet")
	private String skillSet;
	@Column(name = "experience")
	private String experience;
	@Column(name = "visaType")
	private String visaType;
	@Column(name = "shiftTimings")
	private String shiftTimings;
	@Column(name = "supervisior")
	private String supervisior;
	@Column(name = "teamSize")
	private String teamSize;
	@Column(name = "completionDate")
	private String completionDate;
	@Column(name = "hireInfo")
	private String hireInfo;
	@Column(name = "mprDate")
	private String mprDate;
	@Column(name = "responsibilties")
	private String responsibilties;
	@Column(name = "domainExpertise")
	private String domainExpertise;
	@Column(name = "functionHead")
	private String functionHead;
	@Column(name = "hrManager")
	private String hrManager;
	@Column(name = "approved")
	private String approved;
	@Column(name = "approvedby")
	private String approvedby;
	@Column(name = "status")
	private String status;
	@Column(name = "closingDate")
	private String closingDate;
	@Column(name = "recipient")
	private String recipient;
	@Column(name = "positionName")
	private String positionName;
	@Column(name = "budgetRange")
	private String budgetRange;
	@Column(name = "assignHr1")
	private String assignHr1;
	@Column(name = "assignHr2")
	private String assignHr2;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "recipient1")
	private String recipient1;

}
