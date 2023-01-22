package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.VehicleModelConfiguration;

@RestController
public class VehicleModelConfigController {

	@Autowired
	private VehicleModelConfiguration modelConfiguration;
	
	@RequestMapping("/search")
	public VehicleModelConfiguration getConfigurations () {
		return modelConfiguration;
	}
}
