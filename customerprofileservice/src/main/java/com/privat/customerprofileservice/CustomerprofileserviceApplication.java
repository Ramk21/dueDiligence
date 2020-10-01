package com.privat.customerprofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.privat.customerprofileservice")
public class CustomerprofileserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerprofileserviceApplication.class, args);
	}

}
