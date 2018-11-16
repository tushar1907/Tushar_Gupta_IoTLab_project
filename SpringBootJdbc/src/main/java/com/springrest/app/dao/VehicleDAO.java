package com.springrest.app.dao;

import com.springrest.app.model.Vehicle;

public interface VehicleDAO {

	public abstract void createVehicle(Vehicle vehicle); 
	public abstract Vehicle getVehicleById(String vin); 
	public abstract void updateVehicleById(Vehicle vehicle); 
	//public abstract void createVehicle(Vehicle vehicle); 
	
}
