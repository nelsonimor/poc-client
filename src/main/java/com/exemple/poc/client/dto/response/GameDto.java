package com.exemple.poc.client.dto.response;

import java.util.Date;
import java.util.List;

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
	private List<BoxlineDto> localBoxlines;
	private List<BoxlineDto> visitBoxlines;
	private Integer localQt1score;
	private Integer localQt2score;
	private Integer localQt3score;
	private Integer localQt4score;
	private Integer localOt1score;
	private Integer localOt2score;
	private Integer localOt3score;
	private Integer localOt4score;
	private Integer localOt5score;
	private Integer visitQt1score;
	private Integer visitQt2score;
	private Integer visitQt3score;
	private Integer visitQt4score;
	private Integer visitOt1score;
	private Integer visitOt2score;
	private Integer visitOt3score;
	private Integer visitOt4score;
	private Integer visitOt5score;
	
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
	public List<BoxlineDto> getLocalBoxlines() {
		return localBoxlines;
	}
	public void setLocalBoxlines(List<BoxlineDto> localBoxlines) {
		this.localBoxlines = localBoxlines;
	}
	public List<BoxlineDto> getVisitBoxlines() {
		return visitBoxlines;
	}
	public void setVisitBoxlines(List<BoxlineDto> visitBoxlines) {
		this.visitBoxlines = visitBoxlines;
	}
	public Integer getLocalQt1score() {
		return localQt1score;
	}
	public void setLocalQt1score(Integer localQt1score) {
		this.localQt1score = localQt1score;
	}
	public Integer getLocalQt2score() {
		return localQt2score;
	}
	public void setLocalQt2score(Integer localQt2score) {
		this.localQt2score = localQt2score;
	}
	public Integer getLocalQt3score() {
		return localQt3score;
	}
	public void setLocalQt3score(Integer localQt3score) {
		this.localQt3score = localQt3score;
	}
	public Integer getLocalQt4score() {
		return localQt4score;
	}
	public void setLocalQt4score(Integer localQt4score) {
		this.localQt4score = localQt4score;
	}
	public Integer getLocalOt1score() {
		return localOt1score;
	}
	public void setLocalOt1score(Integer localOt1score) {
		this.localOt1score = localOt1score;
	}
	public Integer getLocalOt2score() {
		return localOt2score;
	}
	public void setLocalOt2score(Integer localOt2score) {
		this.localOt2score = localOt2score;
	}
	public Integer getLocalOt3score() {
		return localOt3score;
	}
	public void setLocalOt3score(Integer localOt3score) {
		this.localOt3score = localOt3score;
	}
	public Integer getLocalOt4score() {
		return localOt4score;
	}
	public void setLocalOt4score(Integer localOt4score) {
		this.localOt4score = localOt4score;
	}
	public Integer getLocalOt5score() {
		return localOt5score;
	}
	public void setLocalOt5score(Integer localOt5score) {
		this.localOt5score = localOt5score;
	}
	public Integer getVisitQt1score() {
		return visitQt1score;
	}
	public void setVisitQt1score(Integer visitQt1score) {
		this.visitQt1score = visitQt1score;
	}
	public Integer getVisitQt2score() {
		return visitQt2score;
	}
	public void setVisitQt2score(Integer visitQt2score) {
		this.visitQt2score = visitQt2score;
	}
	public Integer getVisitQt3score() {
		return visitQt3score;
	}
	public void setVisitQt3score(Integer visitQt3score) {
		this.visitQt3score = visitQt3score;
	}
	public Integer getVisitQt4score() {
		return visitQt4score;
	}
	public void setVisitQt4score(Integer visitQt4score) {
		this.visitQt4score = visitQt4score;
	}
	public Integer getVisitOt1score() {
		return visitOt1score;
	}
	public void setVisitOt1score(Integer visitOt1score) {
		this.visitOt1score = visitOt1score;
	}
	public Integer getVisitOt2score() {
		return visitOt2score;
	}
	public void setVisitOt2score(Integer visitOt2score) {
		this.visitOt2score = visitOt2score;
	}
	public Integer getVisitOt3score() {
		return visitOt3score;
	}
	public void setVisitOt3score(Integer visitOt3score) {
		this.visitOt3score = visitOt3score;
	}
	public Integer getVisitOt4score() {
		return visitOt4score;
	}
	public void setVisitOt4score(Integer visitOt4score) {
		this.visitOt4score = visitOt4score;
	}
	public Integer getVisitOt5score() {
		return visitOt5score;
	}
	public void setVisitOt5score(Integer visitOt5score) {
		this.visitOt5score = visitOt5score;
	}

}
