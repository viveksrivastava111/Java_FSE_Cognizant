package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CountryService countryService) {
        return args -> {
            System.out.println("Search 'ou': " + countryService.searchByText("ou"));
            System.out.println("Search 'ou' sorted: " + countryService.searchByTextSorted("ou"));
            System.out.println("Starts with 'Z': " + countryService.searchByStartingAlphabet("Z"));
        };
    }
}
