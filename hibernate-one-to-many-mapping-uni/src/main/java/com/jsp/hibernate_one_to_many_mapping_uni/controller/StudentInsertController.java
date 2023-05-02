package com.jsp.hibernate_one_to_many_mapping_uni.controller;

import com.jsp.hibernate_one_to_many_mapping_uni.dto.Student;
import com.jsp.hibernate_one_to_many_mapping_uni.service.StudentService;

/**
 * 
 * @author Mohammad Masood Ansari
 *
 */
public class StudentInsertController {

	/*
	 * hjsdgldnlk
	 */
	public static void main(String[] args) {
		
		StudentService service = new StudentService();
		
		service.saveStudent(new Student(112, "anas", "anas@gmail.com", "CSE"));
	}
}
