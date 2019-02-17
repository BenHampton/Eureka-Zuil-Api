package com.springbootapplication.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    //TODO we have to register against the Eureka Server so we use the @EnableDiscoveryClient OR we could use @EnableEurekaClient

    //TODO if we use @EnableEurekaClient,
    //              it is one annotation and you are tied to the Eureka from Netflix Dependency
    //TOdo if we use @EnableDiscoveryClient,
    //              is technology independent, so it works with Eureka and may work with other permutations as well

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
