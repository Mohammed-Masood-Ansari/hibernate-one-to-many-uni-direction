package com.jsp.hibernate_one_to_one_uni_direction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jsp.hibernate_one_to_one_uni_direction.dto.Adhar;
import com.jsp.hibernate_one_to_one_uni_direction.dto.Person;

public class PersonDao {
	
	EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * Save Method For Person And Adhar
	 */
	public Person savePersonAdhar(Person person,Adhar adhar) {
		
		entityTransaction.begin();
		entityManager.persist(adhar);
		entityManager.persist(person);
		entityTransaction.commit();
		
		return person;
	}
	/*
	 * getPersonAdharById method
	 */
	public Person getPersonAdharById(int personId) {
		
		return entityManager.find(Person.class, personId);
	}
	
	/*
	 * getPersonAdharById method
	 */
	public void deletePersonAdharById(int personId) {
			
		Person person=getPersonAdharById(personId);
		
		if(person!=null) {
			
			Adhar adhar=person.getAdhar();
			
			entityTransaction.begin();
			entityManager.remove(adhar);
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}
	
	/*
	 * updatePersonAdharDetails() method
	 */
	public void updatePersonAdharDetails(int personId,String personName,String adharAddress) {
			
		Person person=getPersonAdharById(personId);
		
		if(person!=null) {
			
			Adhar adhar=person.getAdhar();
			
			person.setPersonName(personName);
			adhar.setAdharAddress(adharAddress);
			entityTransaction.begin();
			entityManager.merge(adhar);
			entityManager.merge(person);
			entityTransaction.commit();
		}
	}
	
	public List<Person> displayAllPersonAdhr(){
		
		String displayQuery = "SELECT S FROM Person S";
		
		//Query query=entityManager.createQuery(displayQuery);
		
		return entityManager.createQuery(displayQuery,Person.class).getResultList();
		
		//return query.getResultList();
	}
}
