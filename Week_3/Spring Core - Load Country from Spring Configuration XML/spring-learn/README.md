# Spring Core - Load Country from Spring Configuration XML

## Hands-on 4

This project demonstrates how to load a Country bean
from a Spring XML configuration file.

---

## Country Details

Code:

IN

Name:

India

---

## Spring XML File

File:

src/main/resources/country.xml

---

## Bean ID

country

---

## Bean Class

com.cognizant.springlearn.Country

---

## Spring Methods Used

ApplicationContext

ClassPathXmlApplicationContext

context.getBean()

---

## Expected Output

Inside Country Constructor.

Inside setCode Method.

Inside setName Method.

Country : Country [code=IN, name=India]

---

## Run Command

mvn spring-boot:run
