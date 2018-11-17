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
import com.springproject.demo.model.Vehicle;
import com.springproject.demo.repository.AlertJpaRepo;
import com.springproject.demo.repository.ReadingJpaRepo;
import com.springproject.demo.repository.VehicleJpaRepo;




@RestController
public class VechileController {
	
	@Autowired
	private VehicleJpaRepo vehicleJpaRepo;
	
	@Autowired
	private ReadingJpaRepo readingJpaRepo;
	
	@Autowired
	private AlertJpaRepo alertJpaRepo;
	
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
			Optional<Vehicle> v = vehicleJpaRepo.findById(reading.getVin());
		
			if(readingJpaRepo.existsById(reading.getVin())) {
				readingJpaRepo.deleteById(reading.getVin());
				readingJpaRepo.save(reading);	
				System.out.println("Old Vehicle Reading  ID  -->"+reading.getVin());
				System.out.println("Old Vehicle Reading -->"+reading);
			}
			else {
				readingJpaRepo.save(reading);				
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
				
				System.out.println("New Vehicle Reading ID  -->"+reading.getVin());
				System.out.println("New Vehicle Reading -->"+reading);
			}	
	}
}

