package com.exemple.poc.client.dto.response;

import java.util.Date;

public class GameDto {
	
	private int id;
	private String localTeamName;
	private int localTeamId;
	private int localRosterId;
	private String visitTeamName;
	private int visitTeamId;
	private int visitRosterId;
	private int localScore;
	private int visitScore;
	private String arenaName;
	private String arenaCity;
	private Date gamedate;
	private String competitionName;
	private int competitionId;
	private String phasisName;
	private int phaseId;
	private int phasisOrganizationId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalTeamName() {
		return localTeamName;
	}
	public void setLocalTeamName(String localTeamName) {
		this.localTeamName = localTeamName;
	}
	public int getLocalTeamId() {
		return localTeamId;
	}
	public void setLocalTeamId(int localTeamId) {
		this.localTeamId = localTeamId;
	}
	public int getLocalRosterId() {
		return localRosterId;
	}
	public void setLocalRosterId(int localRosterId) {
		this.localRosterId = localRosterId;
	}
	public String getVisitTeamName() {
		return visitTeamName;
	}
	public void setVisitTeamName(String visitTeamName) {
		this.visitTeamName = visitTeamName;
	}
	public int getVisitTeamId() {
		return visitTeamId;
	}
	public void setVisitTeamId(int visitTeamId) {
		this.visitTeamId = visitTeamId;
	}

	public int getLocalScore() {
		return localScore;
	}
	public void setLocalScore(int localScore) {
		this.localScore = localScore;
	}
	public int getVisitScore() {
		return visitScore;
	}
	public void setVisitScore(int visitScore) {
		this.visitScore = visitScore;
	}
	public String getArenaName() {
		return arenaName;
	}
	public void setArenaName(String arenaName) {
		this.arenaName = arenaName;
	}
	public String getArenaCity() {
		return arenaCity;
	}
	public void setArenaCity(String arenaCity) {
		this.arenaCity = arenaCity;
	}
	public Date getGamedate() {
		return gamedate;
	}
	public void setGamedate(Date gamedate) {
		this.gamedate = gamedate;
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
	public String getPhasisName() {
		return phasisName;
	}
	public void setPhasisName(String phasisName) {
		this.phasisName = phasisName;
	}
	public int getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}
	public int getPhasisOrganizationId() {
		return phasisOrganizationId;
	}
	public void setPhasisOrganizationId(int phasisOrganizationId) {
		this.phasisOrganizationId = phasisOrganizationId;
	}
	public int getVisitRosterId() {
		return visitRosterId;
	}
	public void setVisitRosterId(int visitRosterId) {
		this.visitRosterId = visitRosterId;
	}

}
