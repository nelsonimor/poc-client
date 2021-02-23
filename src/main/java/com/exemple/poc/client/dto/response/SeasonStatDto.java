package com.exemple.poc.client.dto.response;

import java.util.Date;

public class SeasonStatDto {
	
	private String teamName;
	private Date start;
	private Date end;
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

}
