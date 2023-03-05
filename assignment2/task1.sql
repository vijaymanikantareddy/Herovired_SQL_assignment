/* Task 1: (Skill Mapping – Basic) */

/* Q-1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the alias name <WORKER_NAME>. */

SELECT FIRST_NAME AS WORKER_NAME 
FROM Worker;



/* Q-2. Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from the Worker table. */

SELECT INSTR(FIRST_NAME, BINARY'a') 
FROM Worker 
WHERE FIRST_NAME = 'Amitabh';



/* Q-3. Write an SQL query to print the FIRST_NAME from the Worker table after replacing ‘a’ with ‘A’. */

SELECT REPLACE(FIRST_NAME,'a','A') 
FROM Worker;



/* Q-4. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending. */

SELECT * FROM Worker
ORDER BY FIRST_NAME asc;



/* Q-5. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending and DEPARTMENT Descending. */

SELECT * FROM Worker 
ORDER BY FIRST_NAME asc,DEPARTMENT desc;



/* Q-6. Write an SQL query to print details for Workers with the first name as “Vipul” and “Satish” from the Worker table. */

SELECT * FROM Worker 
WHERE FIRST_NAME = 'Vipul' OR FIRST_NAME = 'Satish';



/* Q-7. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin” */

SELECT * FROM Worker 
WHERE DEPARTMENT = 'Admin';



/* Q-8. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’ */

SELECT * FROM Worker 
WHERE FIRST_NAME LIKE '%a%';
