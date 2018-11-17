package com.springproject.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
public class VechileController {
	
	@CrossOrigin
	@RequestMapping(value="/vehicles",method=RequestMethod.PUT)
	public void setVechiles(@RequestBody List<Vehicle> payload){
		
		for(Vehicle vehicle : payload) {
            System.out.println(vehicle.getVin());
        }
		
	}

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

