package com.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManagerFactory {

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("spring_hibernate");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public static void shutdown() {
		entityManagerFactory.close();
	}
}
