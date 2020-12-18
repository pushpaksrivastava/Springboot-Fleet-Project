package com.example.spring.project.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.project.fleetapp.models.VehicleType;



@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
