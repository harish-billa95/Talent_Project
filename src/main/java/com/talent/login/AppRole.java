package com.talent.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

	@Entity
	@Table(name = "APP_ROLE")
	@Data
	public class AppRole {

	@Id
	@Column(name = "ROLE_ID")
	private Long roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

}
