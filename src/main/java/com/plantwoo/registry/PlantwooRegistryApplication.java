package com.plantwoo.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class PlantwooRegistryApplication {
    public static final Logger LOGGER = LoggerFactory.getLogger(PlantwooRegistryApplication.class);
	public static void main(String[] args) {
		LOGGER.info("in RegistryMain");
		SpringApplication.run(PlantwooRegistryApplication.class, args);
	}

	@GetMapping("/test")
	public String getUserTest(){
		LOGGER.info("in RegistryMain Test API");
		return "success";
	}
}
