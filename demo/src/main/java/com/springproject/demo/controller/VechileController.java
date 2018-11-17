package com.springproject.demo.controller;

import java.util.List;

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

import com.springproject.demo.model.Reading;
import com.springproject.demo.model.Vehicle;
import com.springproject.demo.repository.ReadingJpaRepo;
import com.springproject.demo.repository.VehicleJpaRepo;




@RestController
public class VechileController {
	
	@Autowired
	private VehicleJpaRepo vehicleJpaRepo;
	
	@Autowired
	private ReadingJpaRepo readingJpaRepo;
	
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
		
//		System.out.println(string);
//		 System.out.println(reading);
			System.out.println(reading.getVin());
			System.out.println(reading.getTimestamp());
			System.out.println(reading.getTire());
//			System.out.println(reading.getTire().getFrontLeft());
//			System.out.println(reading.getTire().getFrontLeft());
//			System.out.println(reading.getTire().getFrontLeft());
//		System.out.println("-----------------------------");
//			System.out.println(reading.getTimestamp());
//			
//			if(readingJpaRepo.existsById(reading.getVin())) {
//				readingJpaRepo.deleteById(reading.getVin());
//				readingJpaRepo.save(reading);	
//				System.out.println("Old Vehicle Reading  ID  -->"+reading.getVin());
//				System.out.println("Old Vehicle Reading -->"+reading);
//			}
//			else {
//				readingJpaRepo.save(reading);
//				System.out.println("New Vehicle Reading ID  -->"+reading.getVin());
//				System.out.println("New Vehicle Reading -->"+reading);
//			}			
//			
        
		
	}
	
	
//	@CrossOrigin
//	@GetMapping(value="/vehicle")
//	public void getVechiles(@RequestBody List<Vehicle> payload){		
//		
//		for(Vehicle vehicle : payload) {
//			vehicleJpaRepo.existsById(vehicle.getVin());
//            
//        }
//		
//	}
	

//	public List<Alien> setVehicleReadings(){
//		
//		List<Alien> alien = new ArrayList();
//		
//		Alien a1 = new Alien();
//		a1.setId("100");
//		a1.setName("Tushar");
//		a1.setPoints(30);
//		
//		Alien a2 = new Alien();
//		a2.setId("101");
//		a2.setName("Gupta");
//		a2.setPoints(70);
//		
//		alien.add(a1);
//		alien.add(a2);
//		
//		return alien;	
//		
//	}
}

