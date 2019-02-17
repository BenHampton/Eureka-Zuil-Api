package com.springbooteurekaserver.springbooteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServerApplication {

    //TODO Microservice that hold a registry, it keeps one list of the available eureka clients

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaServerApplication.class, args);
    }

}
