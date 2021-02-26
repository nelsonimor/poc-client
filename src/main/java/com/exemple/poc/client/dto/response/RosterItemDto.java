package com.exemple.poc.client.dto.response;

import java.util.Date;

public class RosterItemDto {
	
	
	private PersonDTO personDto;
	private Date startdate;
	private Date enddate;
	
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public PersonDTO getPersonDto() {
		return personDto;
	}
	public void setPersonDto(PersonDTO personDto) {
		this.personDto = personDto;
	}


}
