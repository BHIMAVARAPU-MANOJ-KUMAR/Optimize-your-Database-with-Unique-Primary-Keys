package com.springuuidgenerator.uuid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuuidgenerator.uuid.entity.Vehicle;
import com.springuuidgenerator.uuid.service.VehicleService;

@RestController
@RequestMapping("/api/v1/")
public class VehicleController {
	
	private VehicleService vehicleService;
	
	public VehicleController(VehicleService service) {
		this.vehicleService=service;
	}
	
	@PostMapping("/vehicle")
	public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle) {
		Vehicle vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<Vehicle>(vehicle2, HttpStatus.OK);
	}
}