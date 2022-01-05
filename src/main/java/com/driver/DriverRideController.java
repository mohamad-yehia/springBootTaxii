package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.driver.models.Driver;
import com.driver.models.DriverRide;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DriverRideController {

	@Autowired
    private DriverHelper driverHelper;
	
	@GetMapping(path = "/driverRide/{driverRideId}")
	public JsonNode index(@PathVariable(value = "driverRideId") Integer driverRideId) throws JsonMappingException, JsonProcessingException {
	
		JsonNode result = driverHelper.getDriverRide(driverRideId);
		JsonNode driverRide = result.get("driver_ride");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Double longitude = driverRide.get("longitude").asDouble();
		Double largitude = driverRide.get("latitude").asDouble();
		Integer driverId = driverRide.get("driver_id").asInt();
		
	    DriverRide ride = context.getBean(DriverRide.class, longitude, largitude, driverId, driverRideId);
	    Driver driver = context.getBean(Driver.class, ride);
	    driver.getDriver();
		return result;
	}

}