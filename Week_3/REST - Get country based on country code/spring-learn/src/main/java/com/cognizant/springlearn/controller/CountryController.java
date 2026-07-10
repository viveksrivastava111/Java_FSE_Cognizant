package com.cognizant.springlearn.controller;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


import com.cognizant.springlearn.Country;

import com.cognizant.springlearn.service.CountryService;


@RestController
public class CountryController {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    CountryController.class
            );


    private final CountryService countryService;


    // Constructor Injection
    public CountryController(
            CountryService countryService
    ) {


        this.countryService =
                countryService;


    }


    /*
     * Supported URLs:
     *
     * http://localhost:8083/country/in
     *
     * http://localhost:8083/countries/in
     */
    @GetMapping({
        "/country/{code}",
        "/countries/{code}"
    })
    public Country getCountry(
            @PathVariable String code
    ) {


        // Start log
        LOGGER.info("START");


        // Display received path variable
        LOGGER.debug(
                "Code : {}",
                code
        );


        // Call service method
        Country country =
                countryService.getCountry(
                        code
                );


        // End log
        LOGGER.info("END");


        // Spring converts Country object to JSON
        return country;


    }


}
