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

import com.example.spring.project.fleetapp.models.Supplier;
import com.example.spring.project.fleetapp.services.CountryService;
import com.example.spring.project.fleetapp.services.StateService;
import com.example.spring.project.fleetapp.services.SupplierService;



@Controller
public class SupplierController {
	
	@GetMapping("/suppliers")
	public String goHome() {
		return "Supplier";
	}


}
