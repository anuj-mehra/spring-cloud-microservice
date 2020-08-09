package com.anuj.cloud.microservices.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Swagger URL --> http://localhost:8100/swagger-ui.html#/
// Have enhanced the swagger documentation with custom annotations
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	// Bean -Docket
	// Swagger2
	// All the paths
	// All the API's
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2);
				//.apiInfo(DEFAULT_API_INFO);
	}
}
