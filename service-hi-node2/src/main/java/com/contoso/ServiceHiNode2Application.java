package com.contoso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHiNode2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiNode2Application.class, args);
	}
}
