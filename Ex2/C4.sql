SELECT ID, SUM(QTY) TotalAmount
FROM tb_order_detail 
GROUP BY ID
ORDER BY TotalAmount DESC
LIMIT 1