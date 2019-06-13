package com.talent.login;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USER_ROLE")
@Data
public class UserRole {

@Id
@Column(name = "ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;

@Column(name = "USER_ID")
private Long userId;

@Column(name = "ROLE_ID")
private Long roleId;



}
