package com.springuuidgenerator.uuid.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuuidgenerator.uuid.entity.VehicleBinaryuuid;
import com.springuuidgenerator.uuid.entity.VehicleVarcharuuid;
import com.springuuidgenerator.uuid.service.VehicleService;

@RestController
@RequestMapping("/api/v1/")
public class VehicleController {
	
	private VehicleService vehicleService;
	
	public VehicleController(VehicleService service) {
		this.vehicleService=service;
	}
	
	@PostMapping("/binaryvehicle")
	public ResponseEntity<VehicleBinaryuuid> saveVehicle(@RequestBody VehicleBinaryuuid vehicle) {
		VehicleBinaryuuid vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<VehicleBinaryuuid>(vehicle2, HttpStatus.OK);
	}
	
	@PostMapping("/varcharvehicle")
	public ResponseEntity<VehicleVarcharuuid> saveVehicle(@RequestBody VehicleVarcharuuid vehicle) {
		VehicleVarcharuuid vehicle2 = vehicleService.saveVehicle(vehicle);
		return new ResponseEntity<VehicleVarcharuuid>(vehicle2, HttpStatus.OK);
	}
}