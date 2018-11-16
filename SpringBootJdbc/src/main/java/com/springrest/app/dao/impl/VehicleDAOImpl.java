package com.springrest.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springrest.app.dao.VehicleDAO;
import com.springrest.app.model.Vehicle;

public class VehicleDAOImpl implements VehicleDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void createVehicle(Vehicle vehicle) {
		
		String CREATE_VEHICLE_SQL = "INSERT INTO vehicle_table(vin,make,model,year,redlineRpm,maxFuelVolume,lastServiceDate) VALUES(?,?,?,?,?,?,?)";

	}

	@Override
	public Vehicle getVehicleById(String vin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVehicleById(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

}
