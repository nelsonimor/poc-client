package com.exemple.poc.client.dto.response;

import java.util.Date;

public class RosterItemDto {
	
	
	private PersonDto personDto;
	private Date startdate;
	private Date enddate;
	private String teamName;
	private Date seasonStartdate;
	private Date seasonEnddate;
	private Integer rosterId;
	
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
	public PersonDto getPersonDto() {
		return personDto;
	}
	public void setPersonDto(PersonDto personDto) {
		this.personDto = personDto;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Date getSeasonStartdate() {
		return seasonStartdate;
	}
	public void setSeasonStartdate(Date seasonStartdate) {
		this.seasonStartdate = seasonStartdate;
	}
	public Date getSeasonEnddate() {
		return seasonEnddate;
	}
	public void setSeasonEnddate(Date seasonEnddate) {
		this.seasonEnddate = seasonEnddate;
	}
	public Integer getRosterId() {
		return rosterId;
	}
	public void setRosterId(Integer rosterId) {
		this.rosterId = rosterId;
	}


}
