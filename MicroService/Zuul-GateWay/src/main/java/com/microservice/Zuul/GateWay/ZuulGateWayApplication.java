package com.microservice.Zuul.GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateWayApplication.class, args);
	}

}
