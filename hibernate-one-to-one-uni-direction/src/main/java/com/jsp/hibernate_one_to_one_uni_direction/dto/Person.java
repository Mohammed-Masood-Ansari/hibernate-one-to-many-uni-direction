package com.jsp.hibernate_one_to_one_uni_direction.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int personId;
	private String personName;
	private String personemail;
	
	@OneToOne
	@JoinColumn(name = "adharid")
	private Adhar adhar;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonemail() {
		return personemail;
	}

	public void setPersonemail(String personemail) {
		this.personemail = personemail;
	}

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	
}
