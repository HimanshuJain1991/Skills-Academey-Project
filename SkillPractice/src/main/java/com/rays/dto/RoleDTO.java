package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ROLE")
public class RoleDTO extends BaseDTO {

	@Column(name = "NAME", length = 20)
	private String name = null;
	@Column(name = "DESCRIPTION", length = 20)
	private String description = null;

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
