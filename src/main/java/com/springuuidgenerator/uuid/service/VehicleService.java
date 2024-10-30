package com.springuuidgenerator.uuid.service;

import org.springframework.stereotype.Service;

import com.springuuidgenerator.uuid.entity.VehicleBinaryuuid;
import com.springuuidgenerator.uuid.entity.VehicleVarcharuuid;
import com.springuuidgenerator.uuid.repository.VehicleBinaryuuidRepository;
import com.springuuidgenerator.uuid.repository.VehicleVarcharuuidRepository;

@Service
public class VehicleService {
	
	private VehicleBinaryuuidRepository binaryuuidRepository;
	
	private VehicleVarcharuuidRepository varcharuuidRepository;
	
	public VehicleService (VehicleBinaryuuidRepository repository,
							VehicleVarcharuuidRepository vehicleVarcharuuidRepository) {
		this.binaryuuidRepository=repository;
		this.varcharuuidRepository=vehicleVarcharuuidRepository;
	}
	
	public VehicleBinaryuuid saveVehicle(VehicleBinaryuuid vehicle) {
		return binaryuuidRepository.saveAndFlush(vehicle);
	}
	
	public VehicleVarcharuuid saveVehicle(VehicleVarcharuuid vehicle) {
		return varcharuuidRepository.saveAndFlush(vehicle);
	} 
}