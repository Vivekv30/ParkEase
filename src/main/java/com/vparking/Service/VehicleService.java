package com.vparking.Service;

import java.util.Date;
import java.util.List;

import com.vparking.Module.Vehicle;

public interface VehicleService {
	public String saveVehicle(Vehicle v);
	
	public Vehicle getVehicleById(int id);
	
	public List<Vehicle> getAllVehicles();
	
	public Vehicle setVehicleCheckouttime(int id);
}
