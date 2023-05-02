package com.jsp.hibernate_one_to_many_mapping_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private int subjectId;
	private String subjectName;
	private String subjectAutor;
	private double subjectPrice;
	
	
	
	
	public Subject() {
		super();
	}

	public Subject(int subjectId, String subjectName, String subjectAutor, double subjectPrice) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectAutor = subjectAutor;
		this.subjectPrice = subjectPrice;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectAutor() {
		return subjectAutor;
	}
	public void setSubjectAutor(String subjectAutor) {
		this.subjectAutor = subjectAutor;
	}
	public double getSubjectPrice() {
		return subjectPrice;
	}
	public void setSubjectPrice(double subjectPrice) {
		this.subjectPrice = subjectPrice;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectAutor=" + subjectAutor
				+ ", subjectPrice=" + subjectPrice + "]";
	}
	
	
	
}
