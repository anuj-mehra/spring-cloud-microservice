package com.anuj.cloud.microservices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CurrencyConversionServiceSpringConfig {

	@Bean
	@Qualifier("restTemplate")
	public RestTemplate fetchRestTemplate(){
		return new RestTemplate();
	}
}
