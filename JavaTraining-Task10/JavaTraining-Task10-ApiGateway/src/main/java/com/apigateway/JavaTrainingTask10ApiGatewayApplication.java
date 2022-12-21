package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JavaTrainingTask10ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTrainingTask10ApiGatewayApplication.class, args);
		System.out.println("Client gateway running");
	}

}
