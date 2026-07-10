package com.cognizant.springlearn.controller;


import java.nio.charset.StandardCharsets;


import java.util.Base64;

import java.util.Date;

import java.util.HashMap;

import java.util.Map;


import javax.crypto.SecretKey;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;


@RestController
public class AuthenticationController {


    // Logger
    private static final Logger LOGGER =
            LoggerFactory.getLogger(
                    AuthenticationController.class
            );


    /*
     * Signing secret.
     *
     * A long secret is used for HS256 signing.
     */
    private static final String SECRET =
            "secretkey-secretkey-secretkey-123456";


    /*
     * Token validity:
     *
     * 20 minutes
     *
     * 20 * 60 * 1000
     *
     * = 1,200,000 milliseconds
     */
    private static final long TOKEN_VALIDITY =
            1200000;


    // ========================================================
    // AUTHENTICATION ENDPOINT
    //
    // GET:
    //
    // http://localhost:8090/authenticate
    //
    //
    // Input:
    //
    // Authorization: Basic Base64(username:password)
    //
    //
    // Output:
    //
    // {
    //     "token": "JWT_TOKEN"
    // }
    // ========================================================

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization")
            String authHeader
    ) {


        // Start log
        LOGGER.info("START");


        // Display Authorization header
        LOGGER.debug(
                "Authorization Header : {}",
                authHeader
        );


        // Get username from Authorization header
        String user =
                getUser(
                        authHeader
                );


        // Generate JWT for the user
        String token =
                generateJwt(
                        user
                );


        // Create JSON response map
        Map<String, String> map =
                new HashMap<>();


        // Add token into response
        map.put(
                "token",
                token
        );


        // End log
        LOGGER.info("END");


        // Spring converts Map to JSON automatically
        return map;


    }


    // ========================================================
    // GET USERNAME FROM BASIC AUTHORIZATION HEADER
    //
    // Header Example:
    //
    // Basic dXNlcjpwd2Q=
    //
    //
    // After Base64 decoding:
    //
    // user:pwd
    //
    //
    // Returned username:
    //
    // user
    // ========================================================

    private String getUser(
            String authHeader
    ) {


        LOGGER.info("START");


        // Remove "Basic " from header
        String encodedCredentials =
                authHeader
                        .substring(
                            "Basic ".length()
                        )
                        .trim();


        LOGGER.debug(
                "Encoded Credentials : {}",
                encodedCredentials
        );


        // Decode Base64
        byte[] decodedBytes =
                Base64
                    .getDecoder()
                    .decode(
                        encodedCredentials
                    );


        // Convert decoded bytes to String
        String credentials =
                new String(
                    decodedBytes,
                    StandardCharsets.UTF_8
                );


        LOGGER.debug(
                "Credentials decoded successfully"
        );


        // Find position of colon
        int colonPosition =
                credentials.indexOf(":");


        // Get text before colon
        String user =
                credentials.substring(
                        0,
                        colonPosition
                );


        LOGGER.debug(
                "User : {}",
                user
        );


        LOGGER.info("END");


        return user;


    }


    // ========================================================
    // GENERATE JWT TOKEN
    //
    // Token contains:
    //
    // 1. Subject = username
    // 2. Issued time
    // 3. Expiry time
    // 4. Signature
    //
    // Token expires after 20 minutes.
    // ========================================================

    private String generateJwt(
            String user
    ) {


        LOGGER.info("START");


        // Current time
        Date now =
                new Date();


        // Token expiry time:
        // current time + 20 minutes
        Date expiry =
                new Date(
                    now.getTime()
                    + TOKEN_VALIDITY
                );


        // Create signing key
        SecretKey key =
                Keys.hmacShaKeyFor(
                    SECRET.getBytes(
                        StandardCharsets.UTF_8
                    )
                );


        // Generate JWT
        String token =
                Jwts.builder()


                    // Username
                    .subject(user)


                    // Token creation time
                    .issuedAt(now)


                    // Token expiry time
                    .expiration(expiry)


                    // Sign token
                    .signWith(key)


                    // Create final JWT String
                    .compact();


        LOGGER.debug(
                "JWT generated successfully"
        );


        LOGGER.debug(
                "Token : {}",
                token
        );


        LOGGER.info("END");


        return token;


    }


}
