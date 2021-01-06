package com.exemple.poc.client.dto.response;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContinentDTO {
	
	private int id;
	
	@Size(min = 2,max = 2)
	private String code;
	
	@Pattern(regexp = "^[a-zA-Z&éç\\- ]*$")
	@Size(min = 2,max = 60)
	private String name;
	
	public ContinentDTO() {
		
	}
	
	public ContinentDTO(int id,String code,String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
