# REST - Get country based on country code

## Method

GET

---

## Main URL

http://localhost:8083/country/in

---

## Also Supported

http://localhost:8083/countries/in

---

## Controller Method

getCountry(String code)

---

## Annotation

@GetMapping

@PathVariable

---

## Service Method

CountryService.getCountry(String code)

---

## Case Insensitive

All these URLs work:

/country/in

/country/IN

/country/In

---

## Expected Response

{
  "code": "IN",
  "name": "India"
}

---

## Other Examples

US:

http://localhost:8083/country/us

JP:

http://localhost:8083/country/jp

DE:

http://localhost:8083/country/de

---

## Run

mvn spring-boot:run
