package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryService countryService) {
        return args -> {
            Country country = new Country("ZZ", "Test Country");

            countryService.addCountry(country);

            Country addedCountry = countryService.findCountryByCode("ZZ");

            System.out.println("Added Country: " + addedCountry);
        };
    }
}
