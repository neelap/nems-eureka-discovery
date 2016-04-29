package com.nems.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class NemsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NemsDiscoveryServerApplication.class, args);
	}
}
