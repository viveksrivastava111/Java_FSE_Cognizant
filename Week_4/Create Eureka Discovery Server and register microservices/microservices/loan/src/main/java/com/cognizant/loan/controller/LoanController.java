package com.cognizant.loan.controller;


import java.util.LinkedHashMap;

import java.util.Map;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoanController {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    LoanController.class
            );


    @GetMapping("/loans/{number}")
    public Map<String, Object> getLoanDetails(
            @PathVariable String number
    ) {


        LOGGER.info("START");


        Map<String, Object> loan =
                new LinkedHashMap<>();


        loan.put(
                "number",
                number
        );

        loan.put(
                "type",
                "car"
        );

        loan.put(
                "loan",
                400000
        );

        loan.put(
                "emi",
                3258
        );

        loan.put(
                "tenure",
                18
        );


        LOGGER.debug(
                "Loan Details : {}",
                loan
        );


        LOGGER.info("END");


        return loan;


    }


}
