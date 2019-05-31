package com.talent.recruit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="mprform")
@Data
public class MprForm {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
public Integer id;

@Column(name="Approved")
public String approved;

@Column(name="Approvedby")
public String approvedBy;

@Column(name="BenchMark")
public String benchMark;

@Column(name="Budget")
public String budget;

@Column(name="CompletionDate")
public String completionDate;

@Column(name = "domainExpertise")
private String domainExpertise;

@Column(name = "experience")
private String experience;

@Column(name = "functionHead")
private String functionHead;

@Column(name = "gender")
private String gender;

@Column(name = "hrManager")
private String hrManager;

@Column(name = "hireInfo")
private String hireInfo;

@Column(name = "mprDate")
private String mprDate;

@Column(name = "other Recommened")
private String otherrecommened;

@Column(name = "other skills")
private String  otherskills;

@Column(name = "Pipelineprofile")
private String Pipelineprofile;

@Column(name = "Position")
private String Position;

@Column(name = "profileDatabank")
private String profiledatabank;

@Column(name = "requestingManager")
private String requestingManager;

@Column(name = "responsibilties")
private String responsibilties;

@Column(name = "shiftTimings")
private String shiftTimings;

@Column(name = "skillSet")
private String skillSet;

@Column(name = "supervisior")
private String supervisior;

@Column(name = "teamSize")
private String teamSize;

@Column(name = "timeonboard")
private String timeonboard;

@Column(name = "Timelinesourcing")
private String Timelinesourcing;

@Column(name = "visaType")
private String visaType;

@Column(name = "city")
private String city;

@Column(name = "state")
private String state;

@Column(name = "jobType")
private String jobType;

@Column(name = "jobTitle")
private String jobTitle;

@Column(name = "status")
private String status;

@Column(name = "closingDate")
private String closingDate;

@Column(name = "assignHr")
private String assignHr;

@Column(name = "recipient")
private String recipient;

@Column(name = "manager")
private String  manager;

@Column(name = "positionName")
private String positionName;

@Column(name = "projectName")
private String  projectName;

@Column(name = "employeeType")
private String employeeType;

@Column(name = "startDate")
private String startDate;

@Column(name = "mprApprover")
private String mprApprover;

@Column(name = "departmentName")
private String departmentName ;

@Column(name = "deptid")
private String deptid;

@Column(name = "budgetRange")
private String budgetRange;

@Column(name = "content")
private String content;

@Column(name = "filename")
private String filename;

@Column(name = "content_type")
private String content_type;

@Column(name = "assignHr1")
private String assignHr1;

@Column(name = "assignHr2")
private String assignHr2;

@Column(name = "firstName")
private String firstName;

@Column(name = "functionDept")
private String functionDept;

@Column(name = "recipient1")
private String recipient1;


}

























