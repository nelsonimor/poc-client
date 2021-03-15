package com.exemple.poc.client.dto.response;

import java.util.List;

public class CompetitionDto {
	
	private int id;
	private String name;
	private String contient;
	private String country;
	private int nbOrgnizations;
	private List<CompetitionOrganizationDto> competitionOrganizations;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContient() {
		return contient;
	}
	public void setContient(String contient) {
		this.contient = contient;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNbOrgnizations() {
		return nbOrgnizations;
	}
	public void setNbOrgnizations(int nbOrgnizations) {
		this.nbOrgnizations = nbOrgnizations;
	}
	public List<CompetitionOrganizationDto> getCompetitionOrganizations() {
		return competitionOrganizations;
	}
	public void setCompetitionOrganizations(List<CompetitionOrganizationDto> competitionOrganizations) {
		this.competitionOrganizations = competitionOrganizations;
	}

}
