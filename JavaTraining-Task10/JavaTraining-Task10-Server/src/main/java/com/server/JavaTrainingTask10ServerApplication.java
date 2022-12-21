package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JavaTrainingTask10ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTrainingTask10ServerApplication.class, args);
		System.out.println("Server Running successfully");
	}

}
