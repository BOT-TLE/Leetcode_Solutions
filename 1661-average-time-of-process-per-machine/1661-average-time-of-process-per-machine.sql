SELECT FirstTable.machine_id, ROUND(AVG(SecondTable.timestamp - FirstTable.timestamp),3) AS processing_time
FROM Activity FirstTable
JOIN Activity SecondTable
ON FirstTable.machine_id = SecondTable.machine_id
AND FirstTable.process_id = SecondTable.process_id
AND FirstTable.activity_type = 'start'
AND SecondTable.activity_type = 'end'
GROUP BY FirstTable.machine_id;


# We will use the FirstTable to use the START part
# We will use the SecondTable to use the END part
# We will use the avg function to find the average.