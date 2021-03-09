package com.exemple.poc.client.dto.response;

import java.util.Date;

public class PhasisParticipationDto {
	
	private int id;
	private String competitionName;
	private int competitionId;
	private String phaseName;
	private int phaseId;
	private Date startdate;
	private Date enddate;
	private String teamName;
	private int rosterId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhaseName() {
		return phaseName;
	}
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	public int getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
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
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	public int getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(int competitionId) {
		this.competitionId = competitionId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getRosterId() {
		return rosterId;
	}
	public void setRosterId(int rosterId) {
		this.rosterId = rosterId;
	}

}
