package com.paulomarchon.banking.reverseproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseProxyApplication.class, args);
	}

}
