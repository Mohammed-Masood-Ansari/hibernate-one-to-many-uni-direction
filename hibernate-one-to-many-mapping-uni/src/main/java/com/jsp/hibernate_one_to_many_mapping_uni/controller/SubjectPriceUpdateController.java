package com.jsp.hibernate_one_to_many_mapping_uni.controller;

import com.jsp.hibernate_one_to_many_mapping_uni.service.StudentService;

public class SubjectPriceUpdateController {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.updateSubjectPrice(112, 400, 101);
	}
}
