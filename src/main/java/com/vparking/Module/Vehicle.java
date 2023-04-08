package com.vparking.Module;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicleNo;
	private String vehicleType;
	private String vehicleModel;
	private long mobileNo;
	private String customerName;
	private Date checkInTime;
	private Date checkOutTime;
	

}
