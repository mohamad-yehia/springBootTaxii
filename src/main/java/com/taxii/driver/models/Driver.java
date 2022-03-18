package com.taxii.driver.models;

import com.taxii.driver.identifier.Identifier;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Data @NoArgsConstructor
@Table("driver")
public class Driver {
  @Column @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED) private Integer driverId;
  @Column @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED) private String driverName;
  @Column @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED) private String driverEmail;
  @Column private String address;
  @Column private String userName;
  @Column private String password;
    
  public Driver(Integer driverId, String driverName, String address, String userName, String password, String driverEmail) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.driverEmail = driverEmail;
	}
	
	public void getDriver() {
		System.out.println( this.toString());
	}
	
	@Override
	public String toString() {
		return "Driver::\nDriver Id: " + this.driverId + "\nDriver Name: " + this.driverName;
	}
}