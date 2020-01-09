package com.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.entities.Person;

@Repository
public class PersonDao extends GeneralCRUD<Person> {
	public List<Person> readAll() {
		EntityManager em = MyEntityManagerFactory.getEntityManager();
		Session session = em.unwrap(Session.class);

		try {
			return session.createQuery("FROM Person", Person.class).getResultList();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			session.close();
			em.close();
		}
	}
	
}
