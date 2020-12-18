package com.example.spring.project.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.project.fleetapp.models.Vehicle;
import com.example.spring.project.fleetapp.services.EmployeeService;
import com.example.spring.project.fleetapp.services.LocationService;
import com.example.spring.project.fleetapp.services.VehicleMakeService;
import com.example.spring.project.fleetapp.services.VehicleModelService;
import com.example.spring.project.fleetapp.services.VehicleService;
import com.example.spring.project.fleetapp.services.VehicleStatusService;
import com.example.spring.project.fleetapp.services.VehicleTypeService;



@Controller
public class VehicleController {
	
	@GetMapping("/vehicles")
	public String goHome() {
		return "Vehicle";
	}
}
