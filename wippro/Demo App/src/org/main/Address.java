package org.main;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private int doorNo;
private String streetName;
private String cityName;
private String state;

public Address() {
	
}

public int getDoorNo() {
	return doorNo;
}
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
