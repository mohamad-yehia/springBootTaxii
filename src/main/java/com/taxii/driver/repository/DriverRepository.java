package com.taxii.driver.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.taxii.driver.models.Driver;

@Repository
public interface DriverRepository extends CassandraRepository<Driver, Integer> {}