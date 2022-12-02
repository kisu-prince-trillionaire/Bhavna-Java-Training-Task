CREATE DATABASE TASK4;
USE TASK4;

CREATE TABLE EMPLOYEE (
EMPLOYEE_ID INT PRIMARY KEY,
EMPLOYEE_NAME VARCHAR(30) NOT NULL,
SALARY LONG NOT NULL,
JOINING_DATE VARCHAR(20),
DEPARTMENT_ID INT,
FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(DEPARTMENT_ID)
);

CREATE TABLE DEPARTMENT (
DEPARTMENT_ID INT PRIMARY KEY,
DEPARTMENT_NAME VARCHAR(20)
);

SHOW TABLES;

INSERT INTO EMPLOYEE VALUES(101,"VISHAL KUMAR",50000,"08/01/2022",1001);
INSERT INTO EMPLOYEE VALUES(102,"MOHIT KUMAR",50000,"08/01/2022",1001);
INSERT INTO EMPLOYEE VALUES(103,"KRISHNA KUMAR",50000,"08/01/2022",1002);
INSERT INTO EMPLOYEE VALUES(104,"GAURAV KUMAR",50000,"08/01/2022",1001);
INSERT INTO EMPLOYEE VALUES(105,"GOVIND KUMAR",50000,"08/01/2022",1003);
INSERT INTO EMPLOYEE VALUES(106,"RAHUL KUMAR",50000,"08/01/2022",1001);
INSERT INTO EMPLOYEE VALUES(107,"KISHORE KUMAR",50000,"08/01/2022",1004);
INSERT INTO EMPLOYEE VALUES(108,"SAURAV KUMAR",50000,"08/01/2022",1002);
INSERT INTO EMPLOYEE VALUES(109,"SAURAV KUMAR",10000,"08/01/2022",1002);
INSERT INTO EMPLOYEE VALUES(110,"SAURAV KUMAR",70000,"08/01/2022",1002);

SELECT * FROM EMPLOYEE;

INSERT INTO DEPARTMENT VALUES(1001,"DEVELOPER");
INSERT INTO DEPARTMENT VALUES(1002,"HR");
INSERT INTO DEPARTMENT VALUES(1003,"TESTER");
INSERT INTO DEPARTMENT VALUES(1004,"FINANCE");
INSERT INTO DEPARTMENT VALUES(1005,"OPERATION");
INSERT INTO DEPARTMENT VALUES(1006,"MGMT");

SELECT * FROM DEPARTMENT;

SELECT DISTINCT(D.DEPARTMENT_ID), COUNT(EMPLOYEE_ID) AS NO_OF_EMPLOYEES
FROM DEPARTMENT AS D
INNER JOIN EMPLOYEE AS E
ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
WHERE E.SALARY>30000
GROUP BY DEPARTMENT_ID;

DROP TABLE EMPLOYEE;
DROP TABLE DEPARTMENT;