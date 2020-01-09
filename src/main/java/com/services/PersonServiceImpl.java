package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.PersonDao;
import com.entities.Person;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public void create(Person person) {
		this.personDao.create(person);
	}

	@Override
	public List<Person> readAll() {
		return this.personDao.readAll();
	}

	@Override
	public void update(Person person) {
		this.personDao.update(person);
	}

	@Override
	public void delete(Person person) {
		this.personDao.delete(person);
	}

}
