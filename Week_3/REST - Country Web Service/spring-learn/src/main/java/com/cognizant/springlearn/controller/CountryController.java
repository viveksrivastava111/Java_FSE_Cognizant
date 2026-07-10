package com.cognizant.springlearn.controller;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.cognizant.springlearn.Country;


@RestController
public class CountryController {


    // Logger object
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    CountryController.class
            );


    /*
     * GET Request:
     *
     * http://localhost:8083/country
     *
     * Response:
     *
     * {
     *   "code": "IN",
     *   "name": "India"
     * }
     */
    @RequestMapping(
            value = "/country",
            method = RequestMethod.GET
    )
    public Country getCountryIndia() {


        // Start log
        LOGGER.info("START");


        // Load country.xml
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "country.xml"
                );


        // Get India country bean
        Country country =
                context.getBean(
                        "country",
                        Country.class
                );


        // Display country in terminal
        LOGGER.debug(
                "Country : {}",
                country
        );


        // End log
        LOGGER.info("END");


        // Close XML context
        ((ClassPathXmlApplicationContext) context)
                .close();


        // Return Country object
        // Spring automatically converts it into JSON
        return country;


    }


}
