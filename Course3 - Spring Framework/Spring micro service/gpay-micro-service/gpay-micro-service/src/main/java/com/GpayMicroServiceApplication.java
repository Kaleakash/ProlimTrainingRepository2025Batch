package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class GpayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpayMicroServiceApplication.class, args);
		System.err.println("Gpay micro service running on port number 8383");
	}

	// this method is responsible to create the object. 
	// But maintain by container. 
	@Bean
	public RestTemplate restTemplateObjectCreate() {
		System.out.println("object created...");
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
