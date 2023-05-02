package com.jsp.hibernate_one_to_one_uni_direction.controller;

import com.jsp.hibernate_one_to_one_uni_direction.dto.Adhar;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Person;
import com.jsp.hibernate_one_to_one_uni_direction.exception.IdNotFoundException;
import com.jsp.hibernate_one_to_one_uni_direction.service.PersonService;

public class PersonAdharGetController {

	public static void main(String[] args) throws IdNotFoundException {
		
		PersonService personService = new PersonService();
		
		Person person=personService.getPersonAdharById(1234);
		
		System.out.println("person......Details......");
		
		System.out.println("personId = "+person.getPersonId());
		System.out.println("personName = "+person.getPersonName());
		System.out.println("personEmail = "+person.getPersonemail());
		
		System.out.println("Adhar......Details.....");
		System.out.println("adharId = "+person.getAdhar().getAdharId());
		System.out.println("adharAddress = "+person.getAdhar().getAdharAddress());
		System.out.println("adharNumber = "+person.getAdhar().getAdharNumber());
		
	}
}
