package com.in28minutes.springboot.microservice.example.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Need to research
public class SpringBootMicroserviceForexServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
    }
}
