package com.exemple.poc.client.dto.response;

import java.util.ArrayList;
import java.util.List;

public class PersonalStatDto {
	
	private PersonDTO player;
	private StatDto globalStat;
	private List<SeasonStatDto> seasonStatDTOs;
	
	public void add(SeasonStatDto seasonStatDto) {
		if(seasonStatDTOs==null)seasonStatDTOs = new ArrayList<SeasonStatDto>();
		seasonStatDTOs.add(seasonStatDto);
	}
	

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



}
