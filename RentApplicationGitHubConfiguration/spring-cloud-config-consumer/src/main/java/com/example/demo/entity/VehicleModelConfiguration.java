package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class VehicleModelConfiguration {

	@Autowired
	private Environment environment;
	
	public String getDuration() {
		return environment.getProperty("duration");
	}
	
	public String getSearchResultPerPage() {
		return environment.getProperty("search.result.perpage");
	}
}
 