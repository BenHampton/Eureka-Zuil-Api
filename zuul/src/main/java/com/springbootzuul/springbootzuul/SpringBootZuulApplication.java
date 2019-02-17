package com.springbootzuul.springbootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient //TODO registers the Zull Microservice into the Eureka server// that we are going to location in the application file
public class SpringBootZuulApplication {

    //TODO @EnableDiscoveryClient.. registers the Zull Microservice into the Eureka server,
    //                                              that we are going to location in the application.properties file

    //TODO @EnableZuulProxy, we want this microservice to be a Zuul Proxy

    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulApplication.class, args);
    }

}
