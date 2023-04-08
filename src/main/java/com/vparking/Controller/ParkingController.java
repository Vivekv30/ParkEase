package com.vparking.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vparking.Module.Vehicle;
import com.vparking.Repository.VehicleRepository;
import com.vparking.Service.VehicleService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ParkingController {
	@Autowired
	VehicleService repo;
	
	@RequestMapping("/")
	String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/checkin")
	String checkin()
	{
		return "checkin.jsp";
	}
	
	@RequestMapping("addVehicle")
	String addVehicle123(Vehicle v,HttpSession s) {
		repo.saveVehicle(v);
		s.setAttribute("id2", v.getId());
		return "result.jsp";
	}
	
	@RequestMapping("/checkout")
	String checkout()
	{
		return "checkout.jsp";
	}
	
	@RequestMapping("/getbyid")
	String checkot(int id,HttpSession s)
	{
		Vehicle v=repo.getVehicleById(id);
		
		if(v!=null)
		{
//			new ParkingController().checkOut1(v);
			s.setAttribute("id", v.getId());
			s.setAttribute("vNo", v.getVehicleNo());
			s.setAttribute("vModel", v.getVehicleModel());
			s.setAttribute("vType", v.getVehicleType());
			s.setAttribute("customername", v.getCustomerName());
			s.setAttribute("mobileno", v.getMobileNo());
			s.setAttribute("checkintime", v.getCheckInTime());
			
			if(v.getCheckOutTime()==null)
			{
				repo.setVehicleCheckouttime(id);
			}
			long duration = new Date().getTime() - v.getCheckInTime().getTime();
	        duration /= 1000; // convert to seconds
	        duration /= 60; // convert to minutes
	       
	        int amount = 10;
	        if(duration > 30) {
	            amount += (duration - 30) / 30 * 10;		
	        }
	        duration /= 60; // convert to hours
	        s.setAttribute("checkouttime", v.getCheckOutTime());
	        s.setAttribute("duration", duration);
	        s.setAttribute("amount", amount);

			return "checkout.jsp";
		}else
		{
			return null;
		}
	}
	
	
	@RequestMapping("/display")
	String display()
	{
		return "display.jsp";
	}
	
	@RequestMapping("/get")
	String dddl(int id,HttpSession s)
	{
		Vehicle v=repo.getVehicleById(id);
		
		if(v!=null)
		{
			s.setAttribute("id1", v.getId());
			s.setAttribute("vNo1", v.getVehicleNo());
			s.setAttribute("vModel1", v.getVehicleModel());
			s.setAttribute("vType1", v.getVehicleType());
			s.setAttribute("customername1", v.getCustomerName());
			s.setAttribute("mobileno1", v.getMobileNo());
			s.setAttribute("checkintime1", v.getCheckInTime());
			
			

			return "display.jsp";
		}else
		{
			return "alert('id not found')";
		}
	}
	
	@RequestMapping("checkoutsuccessfully")
	@ResponseBody
	public String checkOut1(Integer id) {
//		System.out.println(id);
//		Vehicle v=repo.setVehicleCheckouttime(id);
		
        return "Check out successfully at :";
        
	
}
}
