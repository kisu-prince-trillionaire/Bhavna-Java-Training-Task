package com.candidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaTrainingTask10EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTrainingTask10EmployeeApplication.class, args);
		System.out.println("Project Running sucessfully");
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
