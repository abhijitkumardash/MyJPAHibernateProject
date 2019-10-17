package com.caps.dev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caps.dev.beans.Movie;

public class HibernateImpl implements MovieDAO {

	public boolean createMovie(Movie m) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		boolean state = false;
		em.getTransaction().begin();
		try {
			em.persist(m);
			state = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		return state;
	}

	public boolean deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateRatings(Movie m) {
		// TODO Auto-generated method stub
		return false;
	}

	public Movie searchById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		Movie m = em.find(Movie.class, id);
		em.close();
		emf.close();
		return m;
	}

}
