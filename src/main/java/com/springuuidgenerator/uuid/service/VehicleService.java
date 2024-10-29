package com.springuuidgenerator.uuid.service;

import org.springframework.stereotype.Service;

import com.springuuidgenerator.uuid.entity.Vehicle;
import com.springuuidgenerator.uuid.repository.VehicleRepository;

@Service
public class VehicleService {
	
	private VehicleRepository vehicleRepository;
	
	public VehicleService (VehicleRepository repository) {
		this.vehicleRepository=repository;
	}
	
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.saveAndFlush(vehicle);
	} 
}