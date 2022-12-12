SELECT C.ORD_DATE, SUM(SUMQTY*B.UNIT_PRICE*(100-C.DISCOUNT)/100) TOTAL
FROM (
SELECT ORD_NO, ID, SUM(QTY) SUMQTY
FROM tb_order_detail 
GROUP BY ID,ORD_NO
) as A
LEFT JOIN tb_item B
ON A.ID = B.ID
LEFT JOIN tb_order C
ON A.ORD_NO = C.ORD_NO 
GROUP BY C.ORD_DATE
HAVING C.ORD_DATE = '2021-01-01'