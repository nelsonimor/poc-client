package com.exemple.poc.client.dto.response;

public class ContinentDTO {
	
	private int id;
	private String code,name;
	
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
