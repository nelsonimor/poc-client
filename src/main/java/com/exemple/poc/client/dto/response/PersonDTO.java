package com.exemple.poc.client.dto.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PersonDTO {
	
	private int id;
	private String lastname;
	private String firstname;
	private String nationality1;
	private String nationality2;
	private String birthCityPlace;
	private String birthCountryPlace;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getNationality1() {
		return nationality1;
	}
	public void setNationality1(String nationality1) {
		this.nationality1 = nationality1;
	}
	public String getNationality2() {
		return nationality2;
	}
	public void setNationality2(String nationality2) {
		this.nationality2 = nationality2;
	}

	public String getBirthCountryPlace() {
		return birthCountryPlace;
	}
	public void setBirthCountryPlace(String birthCountryPlace) {
		this.birthCountryPlace = birthCountryPlace;
	}
	public String getBirthCityPlace() {
		return birthCityPlace;
	}
	public void setBirthCityPlace(String birthCityPlace) {
		this.birthCityPlace = birthCityPlace;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


}
