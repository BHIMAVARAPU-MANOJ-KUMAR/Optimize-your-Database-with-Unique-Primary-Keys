package com.springuuidgenerator.uuid.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springuuidgenerator.uuid.entity.Binaryuuid;

public interface BinaryuuidRepository extends JpaRepository<Binaryuuid, UUID>{

}
