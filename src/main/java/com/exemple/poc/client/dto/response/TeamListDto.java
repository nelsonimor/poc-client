package com.exemple.poc.client.dto.response;

import java.util.List;

public class TeamListDto {
	
	private int nbTeams;
	private int differentCountries;
	private List<CountryDto> countries;
	private List<TeamDto> teams;
	
	public int getNbTeams() {
		return nbTeams;
	}
	public void setNbTeams(int nbTeams) {
		this.nbTeams = nbTeams;
	}
	public int getDifferentCountries() {
		return differentCountries;
	}
	public void setDifferentCountries(int differentCountries) {
		this.differentCountries = differentCountries;
	}
	public List<CountryDto> getCountries() {
		return countries;
	}
	public void setCountries(List<CountryDto> countries) {
		this.countries = countries;
	}
	public List<TeamDto> getTeams() {
		return teams;
	}
	public void setTeams(List<TeamDto> teams) {
		this.teams = teams;
	}
	

}
