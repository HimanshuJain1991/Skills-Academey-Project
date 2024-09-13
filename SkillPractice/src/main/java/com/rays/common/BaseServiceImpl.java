package com.rays.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	@Autowired
	protected D baseDao;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Long add(T dto) {
		return baseDao.add(dto);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T dto) {
		baseDao.update(dto);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long save(T dto) {
		Long id = dto.getId();
		if (id != null && id > 0) {
			update(dto);
		} else {
			id = add(dto);
		}
		return id;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public T delete(Long id) {
		T dto = findByPk(id);
		baseDao.delete(dto);
		return dto;
	}

	@Override
	@Transactional(readOnly = true)
	public T findByPk(Long pk) {

		return baseDao.findByPk(pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List search(T dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.search(dto, pageNo, pageSize);
	}
}
