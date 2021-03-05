package com.exemple.poc.client.dto.response;

import java.util.Date;

public class CompetitionParticipationDto {
	
	private int id;
	private String competitionName;
	private String teamName;
	private Date startdate;
	private Date enddate;
	private int competitionId;
	private int competitionOrganizationId;
	private int rosterId;
	
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
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
	public int getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(int competitionId) {
		this.competitionId = competitionId;
	}
	public int getCompetitionOrganizationId() {
		return competitionOrganizationId;
	}
	public void setCompetitionOrganizationId(int competitionOrganizationId) {
		this.competitionOrganizationId = competitionOrganizationId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRosterId() {
		return rosterId;
	}
	public void setRosterId(int rosterId) {
		this.rosterId = rosterId;
	}

}
