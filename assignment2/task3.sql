/* Task 3: (Skill Mapping – Expert) */

/* Q-13. Write a SQL query to find the salesperson and customer who reside in the same city. Return Salesman, cust_name, and city */

SELECT S.name, C.cust_name, C.city 
FROM SALESMAN S, CUSTOMER C
WHERE S.salesman_id = C.salesman_id
AND S.city = C.city;




/* Q-14. Write a SQL query to find the salesperson(s) and the customer(s) he represents. Return Customer Name, city, Salesman, and commission. */

SELECT C.cust_name AS "Customer Name", C.city, S.name AS "Salesman Name", S.commission
FROM Customer C
INNER JOIN Salesman S
ON C.salesman_id = S.salesman_id;



/* Q-15. Write a SQL query to find salespeople who received commissions of more than 12 percent from the company. 
Return Customer Name, customer city, Salesman, and commission.  */

SELECT C.cust_name AS "Customer Name", C.city, S.name AS "Salesman Name", S.commission
FROM Salesman S
INNER JOIN Customer C
ON S.salesman_id = C.salesman_id
WHERE S.commission > 0.12;
