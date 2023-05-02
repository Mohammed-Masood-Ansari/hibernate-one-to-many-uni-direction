package com.jsp.hibernate_one_to_many_mapping_uni.service;

import com.jsp.hibernate_one_to_many_mapping_uni.dao.StudentDao;
import com.jsp.hibernate_one_to_many_mapping_uni.dto.Student;

public class StudentService {

	StudentDao dao = new StudentDao();
	
	public Student saveStudent(Student student) {
		
		return dao.saveStudent(student);
		
	}
	
	/*
	 * 
	 */
	public Student updateSubjectPrice(int studentId,double price,int subjectId) {
		
		return dao.updateSubjectPrice(studentId, price, subjectId);
	}
}
