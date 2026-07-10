package com.cognizant.springlearn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringLearnApplication {


    // Logger object for this class
    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);


    public static void main(String[] args) {


        // Log before starting Spring Boot
        LOGGER.info("START");


        // Starts the Spring Boot application
        SpringApplication.run(
                SpringLearnApplication.class,
                args
        );


        // Log after application startup
        LOGGER.info("END");


    }

}
