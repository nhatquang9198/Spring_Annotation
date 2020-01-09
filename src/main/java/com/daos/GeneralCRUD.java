package com.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class GeneralCRUD<T> {

	public void create(T t) {
		EntityManager em = MyEntityManagerFactory.getEntityManager();
		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();
			em.persist(t);
			et.commit();
		} catch (Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	public void update(T t) {
		EntityManager em = MyEntityManagerFactory.getEntityManager();
		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();
			em.merge(t);
			et.commit();
		} catch (Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	public void delete(T t) {
		EntityManager em = MyEntityManagerFactory.getEntityManager();
		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();
			em.remove(em.contains(t) ? t : em.merge(t));
			et.commit();
		} catch (Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}
