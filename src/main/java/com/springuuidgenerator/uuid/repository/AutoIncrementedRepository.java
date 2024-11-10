package com.springuuidgenerator.uuid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springuuidgenerator.uuid.entity.AutoIncrement;

public interface AutoIncrementedRepository extends JpaRepository<AutoIncrement, Integer>{

}
