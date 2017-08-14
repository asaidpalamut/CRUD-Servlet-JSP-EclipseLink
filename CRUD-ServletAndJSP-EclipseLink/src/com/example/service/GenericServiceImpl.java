package com.example.service;

import java.util.List;

import com.example.dao.GenericDAO;
import com.example.dao.GenericDAOImpl;
import com.example.model.BaseModel;

public class GenericServiceImpl<T extends BaseModel> implements GenericService<T> {

	protected GenericDAO<T> genericDAO;

	public GenericServiceImpl() {
		genericDAO = new GenericDAOImpl<T>();
	}

	@Override
	public T create(T t) {
		
		if (t == null) {
			throw new RuntimeException("Model can't be null");
		}
		
		return this.genericDAO.create(t);
	}

	@Override
	public T getById(Long id) {
		
		if (id == null) {
			throw new RuntimeException("Id cannot be null");
		}
		return this.genericDAO.getById(id);
	}

	@Override
	public T update(T t) {
		
		if (t == null) {
			throw new RuntimeException("Model can't be null");
		}
		
		return this.genericDAO.update(t);
	}

	@Override
	public void delete(T t) {
		
		if (t == null) {
			throw new RuntimeException("Model can't be null");
		}
		
		this.genericDAO.delete(t);
	}

	@Override
	public List<T> getAll(Class<T> c) {

		if (c == null) {
			throw new RuntimeException("Class can't be null");
		}
		
		return this.genericDAO.getAll(c);
	}

}
