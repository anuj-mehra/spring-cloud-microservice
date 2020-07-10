package com.anuj.cloud.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.cloud.microservices.beans.LimitsConfigurationResponse;
import com.anuj.cloud.microservices.config.LimitsServiceConfig;

@RestController
//@RequestMapping(path="/limits")
public class LimitsConfigurationController {

	@Autowired
	private LimitsServiceConfig limitsServiceConfig;
	
	@GetMapping("/limits")
	public LimitsConfigurationResponse retrieveLimitsFromConfig(){
		return new LimitsConfigurationResponse(limitsServiceConfig.getMaximum(),limitsServiceConfig.getMinimum());
	}
}
