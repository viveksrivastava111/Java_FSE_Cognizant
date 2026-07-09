<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="
         http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>


    <!-- Spring Boot Parent -->
    <parent>

        <groupId>org.springframework.boot</groupId>

        <artifactId>spring-boot-starter-parent</artifactId>

        <version>3.3.5</version>

        <relativePath/>

    </parent>


    <!-- Project Details -->
    <groupId>com.cognizant</groupId>

    <artifactId>spring-learn</artifactId>

    <version>0.0.1-SNAPSHOT</version>

    <name>spring-learn</name>

    <description>
        Spring REST using Spring Boot 3 Hands-on Project
    </description>


    <!-- Java Version -->
    <properties>

        <java.version>17</java.version>

    </properties>


    <!-- Project Dependencies -->
    <dependencies>


        <!--
            Spring Web Dependency

            Used for:
            - Web applications
            - REST APIs
            - Embedded Tomcat server
        -->
        <dependency>

            <groupId>org.springframework.boot</groupId>

            <artifactId>spring-boot-starter-web</artifactId>

        </dependency>


        <!--
            Spring Boot DevTools

            Used for:
            - Automatic restart
            - Faster development
        -->
        <dependency>

            <groupId>org.springframework.boot</groupId>

            <artifactId>spring-boot-devtools</artifactId>

            <scope>runtime</scope>

            <optional>true</optional>

        </dependency>


        <!--
            Testing Dependency
        -->
        <dependency>

            <groupId>org.springframework.boot</groupId>

            <artifactId>spring-boot-starter-test</artifactId>

            <scope>test</scope>

        </dependency>


    </dependencies>


    <!-- Maven Build Configuration -->
    <build>

        <plugins>


            <!-- Spring Boot Maven Plugin -->
            <plugin>

                <groupId>org.springframework.boot</groupId>

                <artifactId>spring-boot-maven-plugin</artifactId>

            </plugin>


        </plugins>

    </build>


</project>
