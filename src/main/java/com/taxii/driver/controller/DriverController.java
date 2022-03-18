package com.taxii.driver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taxii.driver.models.Driver;
import com.taxii.driver.repository.DriverRepository;

@RestController
@RequestMapping("/driver")
public class DriverController {

  @Autowired
  DriverRepository driverRespository;

  /**
   * Stores the given driver in Cassandra
   *
   * @return boolean to indicate status of operation
   */
  @GetMapping("/driver")
  public Boolean saveNewDriverHandler(
      @RequestParam Integer id, @RequestParam String name, @RequestParam String address, @RequestParam String userName, @RequestParam String password, @RequestParam String email) {
    driverRespository.insert(new Driver(id, name, address, userName, password, email));
    return true;
  }
}