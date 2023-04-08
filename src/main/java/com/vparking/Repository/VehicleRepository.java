package com.vparking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vparking.Module.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
