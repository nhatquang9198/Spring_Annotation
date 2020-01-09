package com.uis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.AppConfig;
import com.daos.MyEntityManagerFactory;
import com.entities.Info;
import com.entities.Person;
import com.services.InfoService;
import com.services.PersonService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonService personService = (PersonService) context.getBean("personService");
		InfoService infoService = (InfoService) context.getBean("infoService");

		Person person = (Person) context.getBean("person");
		person.setName("test");
//		person.setId(3);
		
		List<Info> listInfo = new ArrayList<Info>();
		Info info1 = (Info) context.getBean("info");
		info1.setPerson(person);
		Info info2 = (Info) context.getBean("info");
		info1.setPerson(person);
		listInfo.add(info1);
		listInfo.add(info2);
		
		person.setInfo(listInfo);
		
		personService.create(person);
		infoService.createMany(listInfo);

		List<Person> list = personService.readAll();
		list.forEach(p -> System.out.println(p));
		System.out.println("-----------------------------------------------------");
		System.out.println(list.get(0));
		personService.delete(list.get(0));
		System.out.println("-----------------------------------------------------");
		list = personService.readAll();
		list.forEach(p -> System.out.println(p));

		MyEntityManagerFactory.shutdown();
		((AbstractApplicationContext) context).close();

	}
}
