package com.springrest;

import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import com.springrest.Vehicle;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleResource {
	
	@CrossOrigin
	@RequestMapping(value="/vehicles",method=RequestMethod.PUT)
	public void setReadings(@RequestBody List<Vehicle> payload){
		
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
