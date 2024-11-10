package com.springuuidgenerator.uuid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuuidgenerator.uuid.entity.AutoIncrement;
import com.springuuidgenerator.uuid.entity.Binaryuuid;
import com.springuuidgenerator.uuid.entity.Varcharuuid;
import com.springuuidgenerator.uuid.service.VehicleService;

@RestController
@RequestMapping("/api/v1/")
public class VehicleController {
	
	private VehicleService vehicleService;
	
	public VehicleController(VehicleService service) {
		this.vehicleService=service;
	}
	
	@PostMapping("/binaryvehicle")
	public ResponseEntity<Binaryuuid> saveVehicle(@RequestBody Binaryuuid vehicle) {
		Binaryuuid vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<Binaryuuid>(vehicle2, HttpStatus.OK);
	}
	
	@PostMapping("/varcharvehicle")
	public ResponseEntity<Varcharuuid> saveVehicle(@RequestBody Varcharuuid vehicle) {
		Varcharuuid vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<Varcharuuid>(vehicle2, HttpStatus.OK);
	}
	
	@PostMapping("/autoincrement")
	public ResponseEntity<AutoIncrement> saveVehicle(@RequestBody AutoIncrement vehicle) {
		AutoIncrement vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<AutoIncrement>(vehicle2, HttpStatus.OK);
	}
}