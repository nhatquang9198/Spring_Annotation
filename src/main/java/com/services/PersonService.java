package com.services;

import java.util.List;

import com.entities.Person;

public interface PersonService {
	public void create(Person person);

	public List<Person> readAll();

	public void update(Person person);

	public void delete(Person person);
}
