package com.springuuidgenerator.uuid.service;

import org.springframework.stereotype.Service;

import com.springuuidgenerator.uuid.entity.AutoIncrement;
import com.springuuidgenerator.uuid.entity.Binaryuuid;
import com.springuuidgenerator.uuid.entity.Varcharuuid;
import com.springuuidgenerator.uuid.repository.AutoIncrementedRepository;
import com.springuuidgenerator.uuid.repository.BinaryuuidRepository;
import com.springuuidgenerator.uuid.repository.VarcharuuidRepository;

@Service
public class VehicleService {
	
	private BinaryuuidRepository binaryuuidRepository;
	
	private VarcharuuidRepository varcharuuidRepository;
	
	private AutoIncrementedRepository vehicleAutoIncrementedRepository;
	
	public VehicleService (BinaryuuidRepository repository,
							VarcharuuidRepository vehicleVarcharuuidRepository,
							AutoIncrementedRepository autoIncrementedRepository) {
		this.binaryuuidRepository=repository;
		this.varcharuuidRepository=vehicleVarcharuuidRepository;
		this.vehicleAutoIncrementedRepository=autoIncrementedRepository;
	}
	
	public Binaryuuid saveVehicle(Binaryuuid vehicle) {
		return binaryuuidRepository.saveAndFlush(vehicle);
	}
	
	public Varcharuuid saveVehicle(Varcharuuid vehicle) {
		return varcharuuidRepository.saveAndFlush(vehicle);
	}
	
	public AutoIncrement saveVehicle(AutoIncrement vehicle) {
		return vehicleAutoIncrementedRepository.saveAndFlush(vehicle);
	}
}