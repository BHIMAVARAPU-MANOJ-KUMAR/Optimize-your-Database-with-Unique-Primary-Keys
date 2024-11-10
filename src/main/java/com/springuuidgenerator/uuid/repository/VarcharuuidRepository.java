package com.springuuidgenerator.uuid.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springuuidgenerator.uuid.entity.Varcharuuid;

public interface VarcharuuidRepository extends JpaRepository<Varcharuuid, UUID>{

}
