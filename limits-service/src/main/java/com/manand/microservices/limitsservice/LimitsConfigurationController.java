package com.manand.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manand.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configurations configurations;
	
	@GetMapping("limits")
	public LimitsConfiguration retriveLimitsFromConfigurations() {
		
		return new LimitsConfiguration(configurations.getMinimum(),configurations.getMaximum());
	}
}
