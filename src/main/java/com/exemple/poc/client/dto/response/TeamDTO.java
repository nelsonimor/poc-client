package com.exemple.poc.client.dto.response;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class TeamDTO {
	
	private int id;
	
	@Pattern(regexp = "^[a-zA-Z&éç\\- ]*$")
	@Size(min = 2,max = 60)
	private String name;
	
	@JsonInclude(Include.NON_NULL)
	private String cityName1;
	
	@JsonInclude(Include.NON_NULL)
	private String countryOfCity1;
	
	@JsonInclude(Include.NON_NULL)
	private String cityName2;
	
	@JsonInclude(Include.NON_NULL)
	private String countryOfCity2;
	
	@JsonInclude(Include.NON_NULL)
	private String cityName3;
	
	@JsonInclude(Include.NON_NULL)
	private String countryOfCity3;
	
	@JsonInclude(Include.NON_NULL)
	private String countryName;
	
	@JsonInclude(Include.NON_NULL)
	private String type;
	
	public TeamDTO() {
		
	}
	
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

	public String getCityName1() {
		return cityName1;
	}

	public void setCityName1(String cityName1) {
		this.cityName1 = cityName1;
	}

	public String getCityName2() {
		return cityName2;
	}

	public void setCityName2(String cityName2) {
		this.cityName2 = cityName2;
	}

	public String getCityName3() {
		return cityName3;
	}

	public void setCityName3(String cityName3) {
		this.cityName3 = cityName3;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountryOfCity1() {
		return countryOfCity1;
	}

	public void setCountryOfCity1(String countryOfCity1) {
		this.countryOfCity1 = countryOfCity1;
	}

	public String getCountryOfCity2() {
		return countryOfCity2;
	}

	public void setCountryOfCity2(String countryOfCity2) {
		this.countryOfCity2 = countryOfCity2;
	}

	public String getCountryOfCity3() {
		return countryOfCity3;
	}

	public void setCountryOfCity3(String countryOfCity3) {
		this.countryOfCity3 = countryOfCity3;
	}

}
