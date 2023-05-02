package com.jsp.hibernate_one_to_one_uni_direction.controller;

import com.jsp.hibernate_one_to_one_uni_direction.exception.IdNotFoundException;
import com.jsp.hibernate_one_to_one_uni_direction.service.PersonService;

public class PersonUpdateController {

	public static void main(String[] args) throws IdNotFoundException {
		
		PersonService personService = new PersonService();
		
		personService.updatePersonAdharDetails(1234, "Pushkar", null);
	}
}
