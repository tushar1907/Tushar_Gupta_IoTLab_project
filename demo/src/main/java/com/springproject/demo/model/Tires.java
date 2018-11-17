package com.springproject.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tires {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String vin;
	private String frontLeft;
	private String frontRight;
	private String rearLeft;
	private String rearRight;
	
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(String frontLeft) {
		this.frontLeft = frontLeft;
	}
	public String getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(String frontRight) {
		this.frontRight = frontRight;
	}
	public String getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(String rearLeft) {
		this.rearLeft = rearLeft;
	}
	public String getRearRight() {
		return rearRight;
	}
	public void setRearRight(String rearRight) {
		this.rearRight = rearRight;
	}
	
	
}
