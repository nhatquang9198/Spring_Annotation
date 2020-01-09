package com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.entities.Info;

@Repository
public class InfoDao extends GeneralCRUD<Info> {

	public void createMany(List<Info> list) {
		EntityManager em = MyEntityManagerFactory.getEntityManager();
		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();
			list.forEach(b -> em.persist(b));
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
