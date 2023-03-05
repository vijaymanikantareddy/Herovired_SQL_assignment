/* Task 2: (Skill Mapping – Intermediate) */


/* Q-9. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000. */

SELECT * FROM Worker WHERE SALARY BETWEEN 100000 and 500000;



/* Q-10. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets. */

SELECT * FROM Worker 
WHERE FIRST_NAME LIKE '_____h';



/* Q-11. Write an SQL query to print details of the Workers who have joined in Feb’2014. */

SELECT * FROM Worker 
WHERE year(JOINING_DATE) = 2014 
AND month(JOINING_DATE) = 2;
