package com.springproject.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.demo.model.Alert;
import com.springproject.demo.model.Reading;
import com.springproject.demo.model.Tires;
import com.springproject.demo.model.Vehicle;
import com.springproject.demo.repository.AlertJpaRepo;
import com.springproject.demo.repository.ReadingJpaRepo;
import com.springproject.demo.repository.TipeJpaRepo;
import com.springproject.demo.repository.VehicleJpaRepo;




@RestController
public class VechileController {
	
	@Autowired
	private VehicleJpaRepo vehicleJpaRepo;
	
	@Autowired
	private ReadingJpaRepo readingJpaRepo;
	
	@Autowired
	private AlertJpaRepo alertJpaRepo;
	
	@Autowired
	private TipeJpaRepo tipeJpaRepo;
	
	@CrossOrigin
	@PutMapping(value="/vehicles")
	public void setVechiles(@RequestBody List<Vehicle> payload){		
		
		for(Vehicle vehicle : payload) {
			System.out.println(vehicle);
			if(vehicleJpaRepo.existsById(vehicle.getVin())) {
				vehicleJpaRepo.deleteById(vehicle.getVin());
				vehicleJpaRepo.save(vehicle);	
				System.out.println("Ols Vehicle ID  -->"+vehicle.getVin());
				System.out.println("Old Vehicle -->"+vehicle);
			}
			else {
				vehicleJpaRepo.save(vehicle);				
				System.out.println("New Vehicle ID  -->"+vehicle.getVin());
				System.out.println("New Vehicle -->"+vehicle);
			}			
			
        }
		
	}
	
	@CrossOrigin
	@PostMapping(value="/readings")
	public void setReadings(@RequestBody Reading reading){	
		
		System.out.println(reading);
		
			Optional<Vehicle> v = vehicleJpaRepo.findById(reading.getVin());
			
			if(readingJpaRepo.existsById(reading.getVin())) {
				tipeJpaRepo.deleteById(reading.getVin());
				readingJpaRepo.deleteById(reading.getVin());
				Tires tires = new Tires();
				tires.setFrontLeft(reading.getTires().getFrontLeft());
				tires.setFrontRight(reading.getTires().getFrontRight());
				tires.setRearLeft(reading.getTires().getRearLeft());
				tires.setRearRight(reading.getTires().getRearRight());
				tires.setVin(reading.getTires().getVin());
				tipeJpaRepo.save(tires);
				readingJpaRepo.save(reading);	
				System.out.println("Old Vehicle Reading  ID  -->"+reading.getVin());
				System.out.println("Old Vehicle Reading -->"+reading);
			}
			else {
				
				Tires tires = new Tires();
				tires.setFrontLeft(reading.getTires().getFrontLeft());
				tires.setFrontRight(reading.getTires().getFrontRight());
				tires.setRearLeft(reading.getTires().getRearLeft());
				tires.setRearRight(reading.getTires().getRearRight());
				tires.setVin(reading.getTires().getVin());
				System.out.println(tires);
				tipeJpaRepo.save(tires);	
				
				Reading r = new Reading();
				r.setVin(reading.getVin());
				r.setCheckEngineLightOn(reading.getCheckEngineLightOn());
				r.setCruiseControlOn(reading.getCruiseControlOn());
				r.setEngineCoolantLow(reading.getEngineCoolantLow());
				r.setEngineHp(reading.getEngineHp());
				r.setEngineRpm(reading.getEngineRpm());
				r.setFuelVolume(reading.getFuelVolume());
				r.setLatitude(reading.getLatitude());
				r.setLongitude(reading.getLongitude());
				r.setSpeed(reading.getSpeed());
				r.setTimestamp(reading.getTimestamp());
				r.setTires(tires);				
				readingJpaRepo.save(r);	
				System.out.println(v.get().getRedlineRpm());
				System.out.println(reading.getEngineRpm());
				if(reading.getEngineRpm() > v.get().getRedlineRpm()) {
					Alert alert = new Alert();
					alert.setPriority("HIGH");
					alert.setVin(reading.getVin());
					alertJpaRepo.save(alert);
				}
				
				if(reading.getFuelVolume() < (v.get().getRedlineRpm()/10)){
					
					Alert alert = new Alert();
					alert.setPriority("MEDIUM");
					alert.setVin(reading.getVin());
					alertJpaRepo.save(alert);
					
				}
				
				if(reading.getFuelVolume() < (v.get().getRedlineRpm()/10)){
					
					Alert alert = new Alert();
					alert.setPriority("MEDIUM");
					alert.setVin(reading.getVin());
					alertJpaRepo.save(alert);
					
				}
				
				System.out.println("New Vehicle Reading ID  -->"+reading.getVin());
				System.out.println("New Vehicle Reading -->"+reading);
			}	
	}
}

