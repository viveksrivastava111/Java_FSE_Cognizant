package com.cognizant.springlearn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Country {


    // Logger for Country class
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


    // Getter for country code
    public String getCode() {

        LOGGER.debug(
                "Inside getCode Method."
        );

        return code;

    }


    // Setter for country code
    public void setCode(String code) {

        LOGGER.debug(
                "Inside setCode Method."
        );

        this.code = code;

    }


    // Getter for country name
    public String getName() {

        LOGGER.debug(
                "Inside getName Method."
        );

        return name;

    }


    // Setter for country name
    public void setName(String name) {

        LOGGER.debug(
                "Inside setName Method."
        );

        this.name = name;

    }


    // Convert Country object to String
    @Override
    public String toString() {

        return "Country [code="
                + code
                + ", name="
                + name
                + "]";

    }


}
