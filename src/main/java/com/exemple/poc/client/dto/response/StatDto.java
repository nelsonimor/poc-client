package com.exemple.poc.client.dto.response;

public class StatDto {
	
	private Double pointsAvg;
	private Integer totalPoints;
	private Integer maxPoints;
	private Integer nbGames;
	
	public Double getPointsAvg() {
		return pointsAvg;
	}
	public void setPointsAvg(Double pointsAvg) {
		this.pointsAvg = pointsAvg;
	}
	public Integer getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	public Integer getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(Integer maxPoints) {
		this.maxPoints = maxPoints;
	}
	public Integer getNbGames() {
		return nbGames;
	}
	public void setNbGames(Integer nbGames) {
		this.nbGames = nbGames;
	}

}
