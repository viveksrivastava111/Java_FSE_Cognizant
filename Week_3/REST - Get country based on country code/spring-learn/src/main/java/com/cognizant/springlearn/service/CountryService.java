package com.cognizant.springlearn.service;


import java.util.List;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Service;


import com.cognizant.springlearn.Country;


@Service
public class CountryService {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    CountryService.class
            );


    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {


        // Start log
        LOGGER.info("START");


        // Display received country code
        LOGGER.debug(
                "Country Code : {}",
                code
        );


        /*
         * Load country.xml
         *
         * try-with-resources automatically
         * closes the Spring XML context.
         */
        try (
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext(
                            "country.xml"
                    )
        ) {


            // Get complete country list from XML
            List<Country> countryList =
                    context.getBean(
                            "countryList",
                            List.class
                    );


            // Iterate through country list
            for (Country country : countryList) {


                /*
                 * Case-insensitive comparison
                 *
                 * IN = in
                 * IN = In
                 * IN = iN
                 */
                if (
                    country.getCode()
                            .equalsIgnoreCase(code)
                ) {


                    LOGGER.debug(
                            "Country Found : {}",
                            country
                    );


                    // End log
                    LOGGER.info("END");


                    // Return matching country
                    return country;


                }


            }


        }


        // No country found
        LOGGER.debug(
                "Country not found for code : {}",
                code
        );


        // End log
        LOGGER.info("END");


        return null;


    }


}
