package com.UST.Hib.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.UST.Hib.Model.Person;

public class PersonDao {
	
	@Autowired
	private SessionFactory factory;

	
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		getSession().save(person);
	}
	
	private Session getSession() {
		Session session = factory.getCurrentSession();
		if(session==null) {
			session = factory.openSession();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Person.class).list();
	}

	
}
