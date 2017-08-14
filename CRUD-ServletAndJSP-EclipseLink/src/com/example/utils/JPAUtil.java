package com.example.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

}

