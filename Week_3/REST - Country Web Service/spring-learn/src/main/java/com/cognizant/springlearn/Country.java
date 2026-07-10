package com.cognizant.springlearn;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


public class Country {


    // Logger object
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    Country.class
            );


    // Country code
    private String code;


    // Country name
    private String name;


    // Empty constructor
    public Country() {


        LOGGER.debug(
                "Inside Country Constructor."
        );


    }


    // Getter for code
    public String getCode() {


        LOGGER.debug(
                "Inside getCode Method."
        );


        return code;


    }


    // Setter for code
    public void setCode(String code) {


        LOGGER.debug(
                "Inside setCode Method."
        );


        this.code = code;


    }


    // Getter for name
    public String getName() {


        LOGGER.debug(
                "Inside getName Method."
        );


        return name;


    }


    // Setter for name
    public void setName(String name) {


        LOGGER.debug(
                "Inside setName Method."
        );


        this.name = name;


    }


    @Override
    public String toString() {


        return "Country [code="
                + code
                + ", name="
                + name
                + "]";


    }


}
