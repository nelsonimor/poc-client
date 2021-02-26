package com.exemple.poc.client.dto.response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RosterDto {
	
	private TeamDTO teamDto;
	private List<RosterItemDto> items;
	private Date startdate,enddate;
	

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
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

}
