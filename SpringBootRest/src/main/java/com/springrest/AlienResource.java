package com.springrest;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@CrossOrigin
	@GetMapping(value="/aliens")
	public void setReadings(){
		
		
		Timer timer = new Timer();
		timer.schedule((TimerTask) setVehicleReadings(), 0, 5000);
		
	}

	
	public List<Alien> setVehicleReadings(){
		
		List<Alien> alien = new ArrayList();
		
		Alien a1 = new Alien();
		a1.setId("100");
		a1.setName("Tushar");
		a1.setPoints(30);
		
		Alien a2 = new Alien();
		a2.setId("101");
		a2.setName("Gupta");
		a2.setPoints(70);
		
		alien.add(a1);
		alien.add(a2);
		
		return alien;	
	}
}
