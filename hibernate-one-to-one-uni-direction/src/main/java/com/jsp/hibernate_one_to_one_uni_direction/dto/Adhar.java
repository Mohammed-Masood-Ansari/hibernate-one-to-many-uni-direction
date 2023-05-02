package com.jsp.hibernate_one_to_one_uni_direction.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {

	@Id
	private int adharId;
	private int adharNumber;
	private String adharAddress;
	
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public int getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getAdharAddress() {
		return adharAddress;
	}
	public void setAdharAddress(String adharAddress) {
		this.adharAddress = adharAddress;
	}
}
