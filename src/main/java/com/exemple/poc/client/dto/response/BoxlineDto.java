package com.exemple.poc.client.dto.response;

import java.util.Date;

public class BoxlineDto {
	
	private int id;
	private String lastname;
	private String firstname;
	private int points;
	private String teamname;
	
	private Integer totalShoot;
	private Integer totalShootAttempts;
	private Integer threePointShoot;
	private Integer threePointShootAttempts;
	private Integer freeThrow;
	private Integer freeThrowAttempts;
	private Integer rebound;
	private Integer reboundOffensive;
	private Integer reboundDefensive;
	private Integer assist;
	private Integer steal;
	private Integer turnover;
	private Integer block;
	private Integer ranking;
	private Integer foulsPersonal;
	private Integer foulsProvoked;
	private Integer minutes;
	private boolean starter;
	private boolean doubledouble;
	private boolean tripledouble;
	
	private Date gameDate;
	private String gameCompetitionName;
	private String gamePhasisName;
	private String gameLocalTeam;
	private String gameVisitorTeam;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Integer getTotalShoot() {
		return totalShoot;
	}
	public void setTotalShoot(Integer totalShoot) {
		this.totalShoot = totalShoot;
	}
	public Integer getTotalShootAttempts() {
		return totalShootAttempts;
	}
	public void setTotalShootAttempts(Integer totalShootAttempts) {
		this.totalShootAttempts = totalShootAttempts;
	}

	public Integer getFreeThrow() {
		return freeThrow;
	}
	public void setFreeThrow(Integer freeThrow) {
		this.freeThrow = freeThrow;
	}
	public Integer getFreeThrowAttempts() {
		return freeThrowAttempts;
	}
	public void setFreeThrowAttempts(Integer freeThrowAttempts) {
		this.freeThrowAttempts = freeThrowAttempts;
	}
	public Integer getRebound() {
		return rebound;
	}
	public void setRebound(Integer rebound) {
		this.rebound = rebound;
	}
	public Integer getReboundOffensive() {
		return reboundOffensive;
	}
	public void setReboundOffensive(Integer reboundOffensive) {
		this.reboundOffensive = reboundOffensive;
	}
	public Integer getReboundDefensive() {
		return reboundDefensive;
	}
	public void setReboundDefensive(Integer reboundDefensive) {
		this.reboundDefensive = reboundDefensive;
	}
	public Integer getAssist() {
		return assist;
	}
	public void setAssist(Integer assist) {
		this.assist = assist;
	}
	public Integer getSteal() {
		return steal;
	}
	public void setSteal(Integer steal) {
		this.steal = steal;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public Integer getBlock() {
		return block;
	}
	public void setBlock(Integer block) {
		this.block = block;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public Integer getFoulsPersonal() {
		return foulsPersonal;
	}
	public void setFoulsPersonal(Integer foulsPersonal) {
		this.foulsPersonal = foulsPersonal;
	}
	public Integer getFoulsProvoked() {
		return foulsProvoked;
	}
	public void setFoulsProvoked(Integer foulsProvoked) {
		this.foulsProvoked = foulsProvoked;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public boolean isStarter() {
		return starter;
	}
	public void setStarter(boolean starter) {
		this.starter = starter;
	}
	public Integer getThreePointShoot() {
		return threePointShoot;
	}
	public void setThreePointShoot(Integer threePointShoot) {
		this.threePointShoot = threePointShoot;
	}
	public Integer getThreePointShootAttempts() {
		return threePointShootAttempts;
	}
	public void setThreePointShootAttempts(Integer threePointShootAttempts) {
		this.threePointShootAttempts = threePointShootAttempts;
	}

	public Date getGameDate() {
		return gameDate;
	}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	public String getGameCompetitionName() {
		return gameCompetitionName;
	}
	public void setGameCompetitionName(String gameCompetitionName) {
		this.gameCompetitionName = gameCompetitionName;
	}
	public String getGamePhasisName() {
		return gamePhasisName;
	}
	public void setGamePhasisName(String gamePhasisName) {
		this.gamePhasisName = gamePhasisName;
	}
	public String getGameLocalTeam() {
		return gameLocalTeam;
	}
	public void setGameLocalTeam(String gameLocalTeam) {
		this.gameLocalTeam = gameLocalTeam;
	}
	public String getGameVisitorTeam() {
		return gameVisitorTeam;
	}
	public void setGameVisitorTeam(String gameVisitorTeam) {
		this.gameVisitorTeam = gameVisitorTeam;
	}
	public boolean isDoubledouble() {
		return doubledouble;
	}
	public void setDoubledouble(boolean doubledouble) {
		this.doubledouble = doubledouble;
	}
	public boolean isTripledouble() {
		return tripledouble;
	}
	public void setTripledouble(boolean tripledouble) {
		this.tripledouble = tripledouble;
	}

}
