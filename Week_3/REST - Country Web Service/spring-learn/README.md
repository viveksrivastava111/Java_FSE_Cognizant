# REST - Country Web Service

## Method

GET

---

## URL

http://localhost:8083/country

---

## Controller

CountryController

---

## Method Name

getCountryIndia()

---

## XML File

country.xml

---

## Country Bean

Code:

IN

Name:

India

---

## Expected JSON Response

{
  "code": "IN",
  "name": "India"
}

---

## Important Process

1. Browser sends GET request.
2. CountryController receives request.
3. country.xml is loaded.
4. Country bean is retrieved.
5. Country object is returned.
6. Spring converts Country object to JSON.

---

## Run Command

mvn spring-boot:run
