package com.springuuidgenerator.uuid.entity;

import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "VehicleBinaryuuid")
@Table(name = "vehiclesbinaryuuid")
public class VehicleBinaryuuid {

	/**
	 * BINARY Method
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@UuidGenerator(style = Style.RANDOM)
	@Column(name = "vehicle_id", updatable = false, nullable = false, unique = true, 
			columnDefinition = "BINARY(16)")
	private UUID id;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "vehicle_name")
	private String vehicleName;

	@Column(nullable = false, columnDefinition = "INTEGER", name = "year")
	private Integer year;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)", name = "make_brand")
	private String makeBrand;
}