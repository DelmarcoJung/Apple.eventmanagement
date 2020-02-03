package com.emc.entities;

public class Event extends EMBase{
	private String Description;
	private String startTime;
	private String endTime;
	private Boolean started;
	
	public Event(long id, String name, String Description) {
		this.id = id;
		this.name = name;
		this.Description= Description;
		
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

}
