package com.anuj.cloud.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency-conversion-service")
public class CurrencyConversionServiceConfig {

}
