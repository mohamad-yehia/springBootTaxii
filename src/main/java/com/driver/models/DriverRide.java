package com.driver.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DriverRide{
	
	Double longitude;
	Double latitude;
	Integer driverId;
	Integer driverRideId;
	
	public DriverRide(Double longitude, Double largitude, Integer driverId, Integer driverRideId) {
		this.longitude = longitude;
		this.latitude = largitude;
		this.driverId = driverId;
		this.driverRideId = driverRideId;
	}
	
	public void getDriverRide() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Driver Ride::\nDriver Id: " + this.driverId + "\nDriver Ride Id: " + this.driverRideId + "\nLongitude: " + this.longitude + "\nLatitude: " + this.latitude;
	}

}
