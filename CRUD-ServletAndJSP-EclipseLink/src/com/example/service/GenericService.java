package com.example.service;

import java.util.List;

import com.example.model.BaseModel;

public interface GenericService<T extends BaseModel> {

	public T create(T t);
    public T getById(Long id);
    public T update(T t);
    public void delete(T t);
    public List<T> getAll(Class<T> c);
}
