package com.exemple.poc.client.dto.response;

import java.util.ArrayList;
import java.util.List;

public class RosterDto {
	
	private TeamDTO teamDto;
	private List<RosterItemDto> items;
	

	public List<RosterItemDto> getItems() {
		return items;
	}
	public void setItems(List<RosterItemDto> items) {
		this.items = items;
	}
	public void addItem(RosterItemDto itemDto) {
		if(items==null)items = new ArrayList<RosterItemDto>();
		items.add(itemDto);
		
	}
	public TeamDTO getTeamDto() {
		return teamDto;
	}
	public void setTeamDto(TeamDTO teamDto) {
		this.teamDto = teamDto;
	}

}
