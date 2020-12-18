package com.example.spring.project.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.project.fleetapp.models.Country;
import com.example.spring.project.fleetapp.repositories.CountryRepository;



@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	//Return List of Countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}

}
