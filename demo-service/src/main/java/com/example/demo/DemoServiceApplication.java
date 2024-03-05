package com.tungvt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class demoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(demoServiceApplication.class, args);
    }

}
