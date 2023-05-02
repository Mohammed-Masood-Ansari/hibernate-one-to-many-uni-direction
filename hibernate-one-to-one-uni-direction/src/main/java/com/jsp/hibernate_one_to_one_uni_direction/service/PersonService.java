package com.jsp.hibernate_one_to_one_uni_direction.service;

import java.util.List;

import com.jsp.hibernate_one_to_one_uni_direction.dao.PersonDao;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Adhar;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Person;
import com.jsp.hibernate_one_to_one_uni_direction.exception.IdNotFoundException;

public class PersonService {

	PersonDao personDao = new PersonDao();

	/*
	 * Save Method For Person And Adhar
	 */
	public Person savePersonAdhar(Person person, Adhar adhar) {

		person.setAdhar(adhar);

		return personDao.savePersonAdhar(person, adhar);
	}

	/*
	 * getPersonAdharById method
	 */
	public Person getPersonAdharById(int personId) throws IdNotFoundException {

		Person person = personDao.getPersonAdharById(personId);

		if (person != null) {
			return person;
		} else {
			throw new IdNotFoundException("id is not found..");
		}
	}

	/*
	 * getPersonAdharById method
	 */
	public void deletePersonAdharById(int personId) throws IdNotFoundException {

		if (personDao.getPersonAdharById(personId) != null) {
			
			personDao.deletePersonAdharById(personId);
			
		} else {
			throw new IdNotFoundException("id is not found..");
		}
	}

	/*
	 * updatePersonAdharDetails() method
	 */
	public void updatePersonAdharDetails(int personId,String personName,String adharAddress)
			throws IdNotFoundException {
		if (personDao.getPersonAdharById(personId) != null) {

			personDao.updatePersonAdharDetails(personId,personName,adharAddress);
		} else {
			throw new IdNotFoundException("id is not found..");
		}
	}
	
	public List<Person> displayAllPersonAdhr(){
	
		return personDao.displayAllPersonAdhr();
	}
}
