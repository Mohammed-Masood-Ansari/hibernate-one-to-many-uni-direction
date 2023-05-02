package com.jsp.hibernate_one_to_many_mapping_uni.controller;

import com.jsp.hibernate_one_to_many_mapping_uni.dto.Subject;
import com.jsp.hibernate_one_to_many_mapping_uni.service.SubjectService;

public class SubjectInsertController {

	public static void main(String[] args) {
		
		SubjectService service = new SubjectService();
		
		service.saveSubject(new Subject(101, "BCC", "VK", 200));
	}
}
