package com.example.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.example.model.BaseModel;
import com.example.utils.JPAUtil;

public class GenericDAOImpl<T extends BaseModel> implements GenericDAO<T> {

	protected Class<T> entityClass;
	protected EntityManager entityManager;

	public GenericDAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
		this.entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	}

	@Override
	public T create(T t) {

		this.entityManager.getTransaction().begin();
		Calendar now = Calendar.getInstance();
		t.setCreateDate(now);
		t.setUpdateDate(now);
		this.entityManager.persist(t);
		this.entityManager.getTransaction().commit();

		return t;
	}

	@Override
	public T getById(Long id) {

		return this.entityManager.find(entityClass, id);
	}

	@Override
	public T update(T t) {

		this.entityManager.getTransaction().begin();
		Calendar now = Calendar.getInstance();
		t.setUpdateDate(now);
		t = this.entityManager.merge(t);
		this.entityManager.getTransaction().commit();

		return t;

	}

	@Override
	public void delete(T t) {

		this.entityManager.getTransaction().begin();
		Calendar now = Calendar.getInstance();
		t.setDeleteDate(now);
		t.setDeleted(true);
		t = this.entityManager.merge(t);
		this.entityManager.getTransaction().commit();

		// OR
		// this.entityManager.remove(t);
	}

	@Override
	public List<T> getAll(Class<T> c) {
		TypedQuery<T> query = (TypedQuery<T>) entityManager
				.createQuery("Select x from " + c.getName() + " x where x.deleted != 1", c);

		return query.getResultList();
	}

}
