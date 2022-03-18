package com.taxii.driver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taxii.driver.models.Driver;
import com.taxii.driver.models.DriverRide;
import com.taxii.driver.repository.DriverRepository;

@Service
public class DriverService {
	
	
	@Autowired
	DriverRepository driverRepository;
	
	/*
	public JsonNode getDriverRide(Integer driverRideId) throws JsonMappingException, JsonProcessingException
	{
	    final String uri = "http://localhost:5000/driverRide/" + driverRideId;
	    
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
		ObjectMapper mapper = new ObjectMapper();
	    JsonNode actualObj = mapper.readTree(result);
	    
	    return actualObj;
	}
	*/
	
	public List<Driver> getAllUsers()
	{    
		List<Driver> drivers = new ArrayList<>();    
		driverRepository.findAll().forEach(drivers::add);    
		return drivers;
	}    
	
	public void addDriver(Driver driver)  
	{    
		driverRepository.save(driver);    
	}

}
