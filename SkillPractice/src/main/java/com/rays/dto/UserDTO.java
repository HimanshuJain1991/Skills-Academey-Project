package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name="ST_USER")
public class UserDTO extends BaseDTO {

	@Column(name = "FIRSTNAME", length = 20)
	private String firstName = null;
	@Column(name = "LASTNAME", length = 20)
	private String lastName = null;
	@Column(name = "LOGINID", length = 20)
	private String loginId = null;
	@Column(name = "PASSWORD", length = 20)
	private String password = null;
	@Column(name = "ROLENAME", length = 20)
	private String roleName = null;
	@Column(name = "ROLE_ID")
	private Long roleId;
	private Date dob;
	@Column(name = "IMAGE_ID")
	private Long imageId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
