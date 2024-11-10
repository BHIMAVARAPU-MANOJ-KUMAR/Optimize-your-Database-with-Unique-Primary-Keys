package com.springuuidgenerator.uuid.entity;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "VehicleVarcharuuid")
@Table(name = "vehiclesvarcharuuid")
public class Varcharuuid {

	/**
	 * VARCHAR Method
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@JdbcTypeCode(value = java.sql.Types.VARCHAR)
	@Column(name = "vehicle_id", updatable = false, nullable = false, 
			unique = true, 
			columnDefinition = "VARCHAR(36)", length = 36)
	private UUID id;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "vehicle_name")
	private String vehicleName;

	@Column(nullable = false, columnDefinition = "INTEGER", name = "year")
	private Integer year;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "make_brand")
	private String makeBrand;
}