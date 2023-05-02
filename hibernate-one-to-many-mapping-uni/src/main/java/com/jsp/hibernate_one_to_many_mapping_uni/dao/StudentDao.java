package com.jsp.hibernate_one_to_many_mapping_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_many_mapping_uni.dto.Student;
import com.jsp.hibernate_one_to_many_mapping_uni.dto.Subject;
import com.jsp.hibernate_one_to_many_mapping_uni.service.SubjectService;

public class StudentDao {

	SubjectService service = new SubjectService();
	
	EntityManager entityManager = 
			Persistence.createEntityManagerFactory("ansari").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		
		List<Subject> subjects=service.getAllSubject();
		
		student.setSubjects(subjects);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	
	/*
	 * 
	 */
	public Student updateSubjectPrice(int studentId,double price,int subjectId) {
		
		/*
		 * this will give student details from databases
		 */
		Student student=entityManager.find(Student.class, studentId);
		
		/*
		 * this will give all the subject details of particular student
		 */
		List<Subject> subjects=student.getSubjects();
		
		/*
		 * inside this for each loop will update subject price
		 */
		for (Subject subject : subjects) {
			if(subject.getSubjectId()==subjectId) {
				subject.setSubjectPrice(price);
				entityTransaction.begin();
				entityManager.merge(subject);
				entityTransaction.commit();
				System.out.println("Data-Updated");
			}
		}
		return student;
	}
}
