package com.anuj.cloud.microservices.rest.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anuj.cloud.microservices.rest.response.ExchangeValueResponse;


@FeignClient(name="currency-exchange-service", url="localhost:8000")
public interface CurrencyExchangeServiceProxy {

	@GetMapping(path="/currency-exchange/from/{from}/to/{to}")
	public ExchangeValueResponse retrieveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to);
		
}
