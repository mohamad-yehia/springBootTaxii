package com.driver.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Driver{
	
	private DriverRide driverRide;
	private Integer id;
	
	public Driver(Integer id, DriverRide driverRide) {
		this.id = id;
		this.driverRide = driverRide; 
	}
	
	public void getDriver() {
		System.out.println( this.toString());
	}
	
	@Override
	public String toString() {
		return "Driver Ride::\nDriver Id: " + this.id + "\nDriver Ride Id: " + this.driverRide.driverRideId + "\nLongitude: " + this.driverRide.longitude + "\nLatitude: " + this.driverRide.latitude;
	}
}
