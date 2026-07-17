# Creating Microservices for account and loan

## Account Microservice

Port:

8080

URL:

http://localhost:8080/accounts/00987987973432

Expected Response:

{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}

---

## Loan Microservice

Port:

8081

URL:

http://localhost:8081/loans/H00987987972342

Expected Response:

{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}

---

## Run Account

cd account

mvn spring-boot:run

---

## Run Loan

cd loan

mvn spring-boot:run
