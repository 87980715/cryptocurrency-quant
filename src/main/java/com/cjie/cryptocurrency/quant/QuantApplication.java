package com.cjie.cryptocurrency.quant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class QuantApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuantApplication.class,args);
    }
}