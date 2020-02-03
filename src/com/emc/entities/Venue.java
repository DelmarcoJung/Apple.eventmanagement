package com.emc.entities;

public class Venue extends EMBase{
	private String Description;
	private String StreetAddress;
	private String City;
	private String State;
	private String pinCode;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
	

}
