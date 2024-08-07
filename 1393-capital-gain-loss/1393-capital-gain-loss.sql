# Write your MySQL query statement below
SELECT stock_name, 
SUM(
    CASE operation
    WHEN "Buy" THEN price*(-1)
    ELSE price
    END
) as capital_gain_loss
FROM Stocks
GROUP BY stock_name;