package com.hotel.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiGatwayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatwayServiceApplication.class, args);
	}
}