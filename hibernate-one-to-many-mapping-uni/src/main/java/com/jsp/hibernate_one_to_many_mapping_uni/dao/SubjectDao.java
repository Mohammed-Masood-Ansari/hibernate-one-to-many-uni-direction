package com.jsp.hibernate_one_to_many_mapping_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_many_mapping_uni.dto.Subject;
/**
 * 
 * @author asus
 *
 */
public class SubjectDao {

	EntityManager entityManager = 
			Persistence.createEntityManagerFactory("ansari").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	/*
	 * 
	 */
	public Subject saveSubject(Subject subject) {
		
		entityTransaction.begin();
		entityManager.persist(subject);
		entityTransaction.commit();
		System.out.println("data-stored");
		return subject;
	}
	
	/*
	 * getBySubjectId
	 */
	public Subject getSubjectBYId(int subjectId) {
		
		return entityManager.find(Subject.class, subjectId);
	}
	
	/*
	 * display all subject Details
	 */
	public List<Subject> getAllSubject(){
		
		String displaySubject = "SELECT s FROM Subject s";
		return entityManager.createQuery(displaySubject,Subject.class).getResultList();
		
	}
}
