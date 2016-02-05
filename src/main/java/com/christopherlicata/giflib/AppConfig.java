package com.christopherlicata.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Spring Boot will auto-configure your Spring app upon deployment.
// The Spring framework doesn't automatically scan your packages for controllers.
// You must instruct the framework to do so.
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
