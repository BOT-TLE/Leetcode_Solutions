# Write your MySQL query statement below
SELECT Users.name, SUM(Transactions.amount) as balance
FROM Users
JOIN Transactions
ON Users.account = Transactions.account
GROUP BY name
HAVING balance > 10000;