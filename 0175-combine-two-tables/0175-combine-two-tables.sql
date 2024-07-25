# Write your MySQL query statement below
SELECT Person.firstname, Person.lastname, Address.city, Address.state 
    FROM Person
    LEFT OUTER JOIN Address
    ON Person.personID = Address.personID;