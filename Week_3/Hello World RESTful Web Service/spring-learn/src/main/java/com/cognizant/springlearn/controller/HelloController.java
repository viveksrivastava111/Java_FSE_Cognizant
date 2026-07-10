package com.cognizant.springlearn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    // Logger object for HelloController
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    HelloController.class
            );


    /*
     * GET Request:
     *
     * http://localhost:8083/hello
     *
     * Response:
     *
     * Hello World!!
     */
    @GetMapping("/hello")
    public String sayHello() {


        // Start log
        LOGGER.info("START");


        // Response returned to browser
        String response =
                "Hello World!!";


        // End log
        LOGGER.info("END");


        return response;


    }


}
