package com.exemple.poc.client.dto.response;

import java.util.Date;

public class PhasisStatDto {
	
	private String teamName;
	private Date start;
	private Date end;
	private String competitionName;
	private String phasisName;
	private StatDto statDto;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public StatDto getStatDto() {
		return statDto;
	}
	public void setStatDto(StatDto statDto) {
		this.statDto = statDto;
	}
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	public String getPhasisName() {
		return phasisName;
	}
	public void setPhasisName(String phasisName) {
		this.phasisName = phasisName;
	}


}
