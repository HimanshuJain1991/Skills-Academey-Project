package com.rays.dao;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RoleDTO;

@Repository
public class RoleDAOImpl  extends BaseDAOImpl<RoleDTO> implements RoleDAOInt{

	@Override
	public Class<RoleDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return RoleDTO.class;
	}

	
}
