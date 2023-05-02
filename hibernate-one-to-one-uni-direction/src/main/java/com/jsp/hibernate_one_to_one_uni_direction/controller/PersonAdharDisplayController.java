package com.jsp.hibernate_one_to_one_uni_direction.controller;

import java.util.List;

import com.jsp.hibernate_one_to_one_uni_direction.dto.Adhar;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Person;
import com.jsp.hibernate_one_to_one_uni_direction.service.PersonService;

public class PersonAdharDisplayController {

	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		
		List<Person> persons=personService.displayAllPersonAdhr();
		
		for (Person person : persons) {
			
			Adhar adhar=person.getAdhar();
		}
	}
}
