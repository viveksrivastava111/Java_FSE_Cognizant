# Create Eureka Discovery Server and Register Microservices

## Projects Created

1. eureka-discovery-server
2. account
3. loan

---

## Start Order

1. Start eureka-discovery-server
2. Start account
3. Start loan

---

## Eureka Dashboard

http://localhost:8761

---

## Expected Registered Services

ACCOUNT-SERVICE

LOAN-SERVICE

---

## Account Service

http://localhost:8080/accounts/00987987973432

Expected Response:

{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}

---

## Loan Service

http://localhost:8081/loans/H00987987972342

Expected Response:

{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
