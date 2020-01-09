package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.daos.PersonDao;
import com.entities.Person;

@Configuration
@Import({ PersonDao.class, Person.class })
public class ComponentConfig {

}
