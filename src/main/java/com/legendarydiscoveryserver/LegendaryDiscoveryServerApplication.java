package com.legendarydiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LegendaryDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegendaryDiscoveryServerApplication.class, args);
	}

}
