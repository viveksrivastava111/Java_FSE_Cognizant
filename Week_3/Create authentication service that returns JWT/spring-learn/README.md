# Create authentication service that returns JWT

## HTTP Method

GET

---

## URL

http://localhost:8090/authenticate

---

## Username

user

---

## Password

pwd

---

## PowerShell Request

curl.exe -s -u user:pwd http://localhost:8090/authenticate

---

## Expected Response

{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}

---

## Authentication Steps

1. Client sends username and password.
2. Spring Security validates the credentials.
3. AuthenticationController reads the Authorization header.
4. Basic credentials are decoded.
5. Username is extracted.
6. JWT is generated.
7. JWT is returned in JSON response.

---

## JWT Information

Subject:

user

Expiry:

20 minutes

---

## Run

mvn spring-boot:run
