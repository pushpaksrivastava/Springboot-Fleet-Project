package com.example.spring.project.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.project.fleetapp.models.Location;
import com.example.spring.project.fleetapp.services.CountryService;
import com.example.spring.project.fleetapp.services.LocationService;
import com.example.spring.project.fleetapp.services.StateService;


@Controller
//@RequestMapping("/locations")
public class LocationController {
	
	@GetMapping("/locations")
	public String goHome() {
		return "Location";
	}
	
}