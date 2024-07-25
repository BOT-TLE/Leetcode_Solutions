# Write your MySQL query statement below
SELECT Employee.name as Employee FROM Employee JOIN Employee a ON Employee.managerId = a.id WHERE Employee.salary > a.salary;