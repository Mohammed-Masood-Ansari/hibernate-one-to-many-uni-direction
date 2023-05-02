package com.jsp.hibernate_one_to_one_uni_direction.controller;

import com.jsp.hibernate_one_to_one_uni_direction.exception.IdNotFoundException;
import com.jsp.hibernate_one_to_one_uni_direction.service.PersonService;

/**
 * 
 * @author asus
 *
 */
public class PersonAdharDeleteController {

	public static void main(String[] args) throws IdNotFoundException {
		
		PersonService personService = new PersonService();
		
		personService.deletePersonAdharById(102);
		
	}
}
