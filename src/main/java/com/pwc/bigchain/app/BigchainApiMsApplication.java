package com.pwc.bigchain.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BigchainApiMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigchainApiMsApplication.class, args);
	}
}
