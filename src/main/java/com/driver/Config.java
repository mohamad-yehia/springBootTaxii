package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.driver.models.Driver;
import com.driver.models.DriverRide;



@Configuration
@ComponentScan
public class Config{
	@Autowired
	DriverHelper driverHelper;
	
	@Bean (name = "ride")
	@Scope(value = "prototype")
	public DriverRide driverRide(Double longitude, Double latitude, Integer driverId, Integer driverRideIde) {
		return new DriverRide(longitude, latitude, driverId, driverRideIde);
	}
	
	@Bean (name = "driver")
	@Scope(value = "prototype")
	public Driver driver(DriverRide driverRide) {
		return new Driver(driverRide.getDriverId(), driverRide);
	}
}
