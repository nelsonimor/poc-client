package com.exemple.poc.client.dto.response;

public class CountryDTO {
	
	private int id;
	private String name;
	private String codeiso2;
	private String codeiso3;
	private String nationality;
	private String continentName;
	

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodeiso2() {
		return codeiso2;
	}
	public void setCodeiso2(String codeiso2) {
		this.codeiso2 = codeiso2;
	}
	public String getCodeiso3() {
		return codeiso3;
	}
	public void setCodeiso3(String codeiso3) {
		this.codeiso3 = codeiso3;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

}
