package com.cognizant.springlearn.security;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


import org.springframework.security.config.Customizer;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;


import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


import org.springframework.security.config.http.SessionCreationPolicy;


import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;


import org.springframework.security.provisioning.InMemoryUserDetailsManager;


import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {


    // Logger
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    SecurityConfig.class
            );


    // ========================================================
    // PASSWORD ENCODER
    // ========================================================

    @Bean
    public PasswordEncoder passwordEncoder() {


        LOGGER.info("START");


        PasswordEncoder encoder =
                new BCryptPasswordEncoder();


        LOGGER.info("END");


        return encoder;


    }


    // ========================================================
    // CREATE IN-MEMORY USERS
    //
    // USER 1:
    // username = user
    // password = pwd
    // role     = USER
    //
    // USER 2:
    // username = admin
    // password = pwd
    // role     = ADMIN
    // ========================================================

    @Bean
    public UserDetailsService userDetailsService(
            PasswordEncoder passwordEncoder
    ) {


        LOGGER.info("START");


        // Create USER role account
        UserDetails user =
                User.withUsername("user")
                        .password(
                            passwordEncoder.encode("pwd")
                        )
                        .roles("USER")
                        .build();


        // Create ADMIN role account
        UserDetails admin =
                User.withUsername("admin")
                        .password(
                            passwordEncoder.encode("pwd")
                        )
                        .roles("ADMIN")
                        .build();


        LOGGER.info("END");


        // Store both users in memory
        return new InMemoryUserDetailsManager(
                user,
                admin
        );


    }


    // ========================================================
    // SECURITY RULES
    //
    // /authenticate:
    //
    // USER and ADMIN both can access
    //
    // HTTP Basic Authentication is enabled.
    // ========================================================

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http
    ) throws Exception {


        LOGGER.info("START");


        http


            // Disable CSRF for REST API
            .csrf(
                csrf -> csrf.disable()
            )


            // REST API should not store login session
            .sessionManagement(
                session ->
                    session.sessionCreationPolicy(
                        SessionCreationPolicy.STATELESS
                    )
            )


            // Configure URL security
            .authorizeHttpRequests(
                authorization -> authorization


                    // Both roles can access authentication URL
                    .requestMatchers(
                        "/authenticate"
                    )
                    .hasAnyRole(
                        "USER",
                        "ADMIN"
                    )


                    // Other requests need authentication
                    .anyRequest()
                    .authenticated()

            )


            // Enable HTTP Basic Authentication
            .httpBasic(
                Customizer.withDefaults()
            );


        LOGGER.info("END");


        return http.build();


    }


}
