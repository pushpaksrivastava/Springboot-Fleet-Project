package com.example.spring.project.fleetapp.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.spring.project.fleetapp.models.Employee;
import com.example.spring.project.fleetapp.services.CountryService;
import com.example.spring.project.fleetapp.services.EmployeeService;
import com.example.spring.project.fleetapp.services.EmployeeTypeService;
import com.example.spring.project.fleetapp.services.JobTitleService;
import com.example.spring.project.fleetapp.services.StateService;



@Controller
public class EmployeeController {
	
	@GetMapping("/employees")
	public String goHome() {
		return "Employee";
	}

}
