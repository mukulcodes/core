package com.manand.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manand.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@GetMapping("limits")
	public LimitsConfiguration retriveLimitsFromConfigurations() {
		
		return new LimitsConfiguration(1000,1);
	}
}
