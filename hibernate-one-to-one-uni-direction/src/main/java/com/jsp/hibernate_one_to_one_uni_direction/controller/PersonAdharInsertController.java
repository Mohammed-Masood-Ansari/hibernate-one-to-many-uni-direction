package com.jsp.hibernate_one_to_one_uni_direction.controller;

import com.jsp.hibernate_one_to_one_uni_direction.dto.Adhar;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Person;
import com.jsp.hibernate_one_to_one_uni_direction.service.PersonService;

public class PersonAdharInsertController {
	
	public static void main(String[] args) {

		PersonService personService = new PersonService();
		
		Person person = new Person();
		person.setPersonId(1234);
		person.setPersonName("Rahul");
		person.setPersonemail("rahul@outlook.com");
		
		Adhar adhar = new Adhar();
		adhar.setAdharId(101);
		adhar.setAdharNumber(324677);
		adhar.setAdharAddress("noida-sector-3");
		
		personService.savePersonAdhar(person, adhar);
	}
}
