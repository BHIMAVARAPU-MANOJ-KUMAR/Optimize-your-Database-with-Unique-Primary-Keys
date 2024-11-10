package com.springuuidgenerator.uuid.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "VehicleAutoIncremented")
@Table(name = "vehiclesautoincremented")
public class AutoIncrement {
	
	/**
	 * Auto-Increment Method
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id", updatable = false, nullable = false, unique = true, 
			columnDefinition = "INTEGER")
	private Integer id;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "vehicle_name")
	private String vehicleName;

	@Column(nullable = false, columnDefinition = "INTEGER", name = "year")
	private Integer year;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "make_brand")
	private String makeBrand;
}
