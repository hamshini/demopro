package org.tr.detail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TRAIN_DETAILS")
public class TrainDetails {

public TrainDetails() {
		super();
		
	}
public TrainDetails(int trainNo, String trainName, String trainStrarts, String trainEnds, String stationName,
			String arrives, String departs, String stopTime, String distanceTravelled, int day, int route) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.trainStrarts = trainStrarts;
		this.trainEnds = trainEnds;
		this.stationName = stationName;
		Arrives = arrives;
		Departs = departs;
		this.stopTime = stopTime;
		this.distanceTravelled = distanceTravelled;
		this.day = day;
		this.route = route;
	}
@Id
private int trainNo;
@Column(name = "TRAIN_NAME",length=20,nullable=false)
private String trainName;
@Column(name="STARTS")
private String trainStrarts;
@Column(name="ENDS")
private String trainEnds;
@Column(name="STATION_NAME")
private String stationName;
@Column(name="ARRIVES")
private String Arrives;
@Column(name="Departs")
private String Departs;
@Column(name="STOP_TIME")
private String stopTime;
@Column(name="DIS_TRAVELLED")
private String distanceTravelled;
@Column(name="DAYS")
private int day;
@Column(name="ROUTE")
private int route;
public int getTrainNo() {
	return trainNo;
}
public void setTrainNo(int trainNo) {
	this.trainNo = trainNo;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getTrainStrarts() {
	return trainStrarts;
}
public void setTrainStrarts(String trainStrarts) {
	this.trainStrarts = trainStrarts;
}
public String getTrainEnds() {
	return trainEnds;
}
public void setTrainEnds(String trainEnds) {
	this.trainEnds = trainEnds;
}
public String getStationName() {
	return stationName;
}
public void setStationName(String stationName) {
	this.stationName = stationName;
}
public String getArrives() {
	return Arrives;
}
public void setArrives(String arrives) {
	Arrives = arrives;
}
public String getDeparts() {
	return Departs;
}
public void setDeparts(String departs) {
	Departs = departs;
}
public String getStopTime() {
	return stopTime;
}
public void setStopTime(String stopTime) {
	this.stopTime = stopTime;
}
public String getDistanceTravelled() {
	return distanceTravelled;
}
public void setDistanceTravelled(String distanceTravelled) {
	this.distanceTravelled = distanceTravelled;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getRoute() {
	return route;
}
public void setRoute(int route) {
	this.route = route;
}


}
