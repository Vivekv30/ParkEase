package com.vparking.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vparking.Module.Vehicle;
import com.vparking.Repository.VehicleRepository;
import com.vparking.Service.VehicleService;
@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepository vrep;
//	spring.main.allow-circular-references
	@Override
	public String saveVehicle(Vehicle v) {
		v.setCheckInTime(new Date());
		vrep.save(v);
		return "result.jsp";
	}

	@Override
	public Vehicle getVehicleById(int id) {
		Vehicle v=vrep.findById(id).orElseThrow(null);
		if(v!=null)
		{
			return v;
		}else
		{
			return null;
		}
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Vehicle setVehicleCheckouttime(int id) {
		Vehicle v=vrep.findById(id).orElseThrow(null);
		v.setCheckOutTime(new Date());
		vrep.save(v);
		return v;
	}

	
}
