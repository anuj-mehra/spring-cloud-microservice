package com.anuj.cloud.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages="com.anuj.cloud.microservices")
public class NetflizZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflizZuulApiGatewayServerApplication.class, args);
	}

}
