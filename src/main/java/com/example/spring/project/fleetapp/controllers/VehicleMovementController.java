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

import com.example.spring.project.fleetapp.models.VehicleMovement;
import com.example.spring.project.fleetapp.services.LocationService;
import com.example.spring.project.fleetapp.services.VehicleMovementService;
import com.example.spring.project.fleetapp.services.VehicleService;


@Controller
public class VehicleMovementController {
	
	@GetMapping("/vehicleMovement")
	public String goHome() {
		return "VehicleMovement";
	}


}
