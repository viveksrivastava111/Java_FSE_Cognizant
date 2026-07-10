package com.cognizant.springlearn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringLearnApplication {


    // Logger for application class
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    SpringLearnApplication.class
            );


    public static void main(String[] args) {


        // Start Spring Boot
        SpringApplication.run(
                SpringLearnApplication.class,
                args
        );


        // Create application object
        SpringLearnApplication application =
                new SpringLearnApplication();


        // Call displayCountry method
        application.displayCountry();


    }


    public void displayCountry() {


        // Start log
        LOGGER.info("START");


        // Load country.xml file
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "country.xml"
                );


        // Get Country bean from Spring container
        Country country =
                context.getBean(
                        "country",
                        Country.class
                );


        // Display Country details using debug log
        LOGGER.debug(
                "Country : {}",
                country.toString()
        );


        // End log
        LOGGER.info("END");


        // Close Spring XML context
        ((ClassPathXmlApplicationContext) context)
                .close();


    }


}
