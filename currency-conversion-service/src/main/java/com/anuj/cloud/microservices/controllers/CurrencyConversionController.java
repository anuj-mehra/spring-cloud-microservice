package com.anuj.cloud.microservices.controllers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anuj.cloud.microservices.beans.CurrencyConversionResponse;
import com.anuj.cloud.microservices.rest.proxy.CurrencyExchangeServiceProxy;
import com.anuj.cloud.microservices.rest.response.ExchangeValueResponse;

@RestController
public class CurrencyConversionController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping(path="/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionResponse convertCurrency(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity){

	
		final Map<String,String> uriVariablesMap = new HashMap<>();
		uriVariablesMap.put("from", from);
		uriVariablesMap.put("to", to);
		
		final ResponseEntity<ExchangeValueResponse> responseEntity = 
				restTemplate.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", ExchangeValueResponse.class, uriVariablesMap);
		
		final ExchangeValueResponse response = responseEntity.getBody();
		
		return new CurrencyConversionResponse(response.getId(), from, to, 
				response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()),
				Integer.valueOf(environment.getProperty("local.server.port")));
	}
	
	
	@GetMapping(path="currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionResponse convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity){
		
		final ExchangeValueResponse response = proxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversionResponse(response.getId(), from, to, 
				response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()),
				Integer.valueOf(environment.getProperty("local.server.port")));
	}
}
