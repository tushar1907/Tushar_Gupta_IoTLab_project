package com.springrest.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.app.dao.VehicleDAO;
import com.springrest.app.model.Vehicle;

@SpringBootApplication
@ComponentScan("com.springrest.app.dao")
@Controller
@RestController
public class SpringBootJdbcApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
//	
//	@Autowired
//	private VehicleDAO vehicleDAO; 
//	
//	@CrossOrigin
//	@RequestMapping(value="/vehicles",method=RequestMethod.PUT)
//	public void setReadings(@RequestBody List<Vehicle> payload){
//		
//		for(Vehicle vehicle : payload) {
//            System.out.println(vehicle.getVin());
//        }
//		
//	}
	
	
	
}
