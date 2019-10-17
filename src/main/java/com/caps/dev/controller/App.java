package com.caps.dev.controller;

import com.caps.dev.beans.Movie;
import com.caps.dev.dao.HibernateImpl;
import com.caps.dev.dao.MovieDAO;

public class App {
	public static void main(String[] args) {
		MovieDAO dao = new HibernateImpl();
//		Movie m = dao.searchById(4);
//		System.out.println(m);
		Movie m = new Movie();
		m.setMovieId(6);
		m.setName("DDLJ");
		m.setDescription("Boring");
		m.setRating(2);
		
		dao.createMovie(m);
		
	}
}
