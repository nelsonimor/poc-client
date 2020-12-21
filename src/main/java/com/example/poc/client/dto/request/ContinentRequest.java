package com.example.poc.client.dto.request;

import java.io.Serializable;

public class ContinentRequest implements Serializable {
	
	private String nane;
	private String code;
	private Integer id;
	
	public ContinentRequest(Integer id,String name,String code) {
		this.id = id;
		this.nane = name;
		this.code = code;
	}
	
	public String getNane() {
		return nane;
	}
	public void setNane(String nane) {
		this.nane = nane;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
