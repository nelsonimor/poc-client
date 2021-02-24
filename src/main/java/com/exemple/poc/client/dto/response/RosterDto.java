package com.exemple.poc.client.dto.response;

import java.util.ArrayList;
import java.util.List;

public class RosterDto {
	
	private String teamName;
	private List<RosterItemDto> items;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
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

}
