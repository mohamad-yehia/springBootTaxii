package com.taxii.driver.models;


import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.taxii.driver.identifier.Identifier;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @NoArgsConstructor
@Table("driver_ride")
public class DriverRide{
	
	@Column Double longitude;
	@Column Double latitude;
	@Column @PrimaryKey Integer driverId;
	@Column Integer driverRideId;
	
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