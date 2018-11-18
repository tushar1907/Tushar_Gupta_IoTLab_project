package com.springproject.demo.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reading {	
	
	@Id
	private String vin;	
	private double latitude;
	private double longitude;
	private String timestamp;
	private double fuelVolume;
	private double speed;
	private double engineHp;
	private Boolean checkEngineLightOn;
	private Boolean engineCoolantLow;
	private Boolean cruiseControlOn;
	private double engineRpm;
	
	@OneToOne(cascade=CascadeType.REMOVE, optional=true)
	private Tires tires;
	
	
	public Tires getTires() {
		return tires;
	}
	public void setTires(Tires tires) {
		this.tires = tires;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public double getFuelVolume() {
		return fuelVolume;
	}
	public void setFuelVolume(double fuelVolume) {
		this.fuelVolume = fuelVolume;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getEngineHp() {
		return engineHp;
	}
	public void setEngineHp(double engineHp) {
		this.engineHp = engineHp;
	}
	public Boolean getCheckEngineLightOn() {
		return checkEngineLightOn;
	}
	public void setCheckEngineLightOn(Boolean checkEngineLightOn) {
		this.checkEngineLightOn = checkEngineLightOn;
	}
	public Boolean getEngineCoolantLow() {
		return engineCoolantLow;
	}
	public void setEngineCoolantLow(Boolean engineCoolantLow) {
		this.engineCoolantLow = engineCoolantLow;
	}
	public Boolean getCruiseControlOn() {
		return cruiseControlOn;
	}
	public void setCruiseControlOn(Boolean cruiseControlOn) {
		this.cruiseControlOn = cruiseControlOn;
	}
	public double getEngineRpm() {
		return engineRpm;
	}
	public void setEngineRpm(double engineRpm) {
		this.engineRpm = engineRpm;
	}
	
}
