package com.anuj.cloud.microservices.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.cloud.microservices.beans.ExchangeValueResponse;

@RestController
@RequestMapping(path="currency-exchange")
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
		
	@GetMapping(path="/from/{from}/to/{to}")
	public ExchangeValueResponse retrieveExchangeValue(@PathVariable String from,
			@PathVariable String to){
		
		final ExchangeValueResponse response = new ExchangeValueResponse(1000L, "usd", "inr", BigDecimal.valueOf(75));
		
		response.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
		return response;
	}
}
