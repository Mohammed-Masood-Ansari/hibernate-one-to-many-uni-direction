package com.jsp.hibernate_one_to_many_mapping_uni.service;

import java.util.List;

import com.jsp.hibernate_one_to_many_mapping_uni.dao.SubjectDao;
import com.jsp.hibernate_one_to_many_mapping_uni.dto.Subject;

/**
 * 
 * @author asus
 *
 */

public class SubjectService {

	SubjectDao dao = new SubjectDao();

	/*
	 * 
	 */
	public Subject saveSubject(Subject subject) {
		
	  return dao.saveSubject(subject);
	}
	
	/*
	 * getBySubjectId
	 */
	public Subject getSubjectBYId(int subjectId) {
	
		return dao.getSubjectBYId(subjectId);
	}
	
	/*
	 * display all subject Details
	 */
	public List<Subject> getAllSubject(){
		return dao.getAllSubject();  
	}
}
