# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;

/*
HAVING clause is similar to WHERE clause, it's used to filter data.
HAVING applies to groups of rows, while WHERE applies to all rows.
HAVING is expected only after GROUP BY.
That's why removing GROUP BY makes HAVING invalid.
*/