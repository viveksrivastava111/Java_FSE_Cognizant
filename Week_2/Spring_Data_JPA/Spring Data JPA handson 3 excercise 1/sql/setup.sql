CREATE DATABASE IF NOT EXISTS ormlearn;

USE ormlearn;

DROP TABLE IF EXISTS employee_skill;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS skill;

CREATE TABLE department (
    dp_id INT PRIMARY KEY AUTO_INCREMENT,
    dp_name VARCHAR(50)
);

CREATE TABLE employee (
    em_id INT PRIMARY KEY AUTO_INCREMENT,
    em_name VARCHAR(50),
    em_salary DOUBLE,
    em_permanent BIT(1),
    em_date_of_birth DATE,
    em_dp_id INT,
    FOREIGN KEY (em_dp_id) REFERENCES department(dp_id)
);

CREATE TABLE skill (
    sk_id INT PRIMARY KEY AUTO_INCREMENT,
    sk_name VARCHAR(50)
);

CREATE TABLE employee_skill (
    es_em_id INT,
    es_sk_id INT,
    PRIMARY KEY (es_em_id, es_sk_id),
    FOREIGN KEY (es_em_id) REFERENCES employee(em_id),
    FOREIGN KEY (es_sk_id) REFERENCES skill(sk_id)
);

INSERT INTO department VALUES (1, 'Technology');
INSERT INTO department VALUES (2, 'Human Resource');

INSERT INTO employee VALUES (1, 'John', 50000, b'1', '1995-05-10', 1);
INSERT INTO employee VALUES (2, 'Smith', 60000, b'1', '1994-04-12', 1);
INSERT INTO employee VALUES (3, 'David', 45000, b'0', '1996-08-20', 2);

INSERT INTO skill VALUES (1, 'Java');
INSERT INTO skill VALUES (2, 'Spring');
INSERT INTO skill VALUES (3, 'SQL');

INSERT INTO employee_skill VALUES (1, 1);
INSERT INTO employee_skill VALUES (1, 2);
INSERT INTO employee_skill VALUES (2, 1);
INSERT INTO employee_skill VALUES (2, 3);
