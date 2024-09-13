package com.rays.common;

import java.util.List;

public interface BaseServiceInt<T extends BaseDTO> {
	public Long add(T dto);

	public void update(T dto);

	public long save(T dto);

	public T delete(Long id);

	public T findByPk(Long pk);

	public List search(T dto, int pageNo, int pageSize);

}
