package com.fancy.cancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CancerApplication.class, args);
    }

}