package com.exemple.poc.client.dto.response;

import java.util.List;

public class PersonalStatDto {
	
	private PersonDTO player;
	private StatDto globalStat;
	private List<SeasonStatDto> seasonStatDTOs;
	private List<CompetitionStatDto> competitionStatDTOs;
	private List<PhasisStatDto> phasisStatsDTOs;
	
	

	public StatDto getGlobalStat() {
		return globalStat;
	}
	public void setGlobalStat(StatDto globalStat) {
		this.globalStat = globalStat;
	}
	public PersonDTO getPlayer() {
		return player;
	}
	public void setPlayer(PersonDTO player) {
		this.player = player;
	}


	public List<SeasonStatDto> getSeasonStatDTOs() {
		return seasonStatDTOs;
	}


	public void setSeasonStatDTOs(List<SeasonStatDto> seasonStatDTOs) {
		this.seasonStatDTOs = seasonStatDTOs;
	}
	public List<CompetitionStatDto> getCompetitionStatDTOs() {
		return competitionStatDTOs;
	}
	public void setCompetitionStatDTOs(List<CompetitionStatDto> competitionStatDTOs) {
		this.competitionStatDTOs = competitionStatDTOs;
	}
	public List<PhasisStatDto> getPhasisStatsDTOs() {
		return phasisStatsDTOs;
	}
	public void setPhasisStatsDTOs(List<PhasisStatDto> phasisStatsDTOs) {
		this.phasisStatsDTOs = phasisStatsDTOs;
	}



}
