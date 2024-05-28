SELECT orderNumber, SUM(quantityOrdered) as Qty,
    IF(MOD(SUM(quantityOrdered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    orderNumber
ORDER BY    orderNumber; 


SELECT TRUNCATE(1.555,1);


SELECT productCode, AVG(quantityOrdered * priceEach) as avg_order_value
FROM orderDetails
GROUP BY productCode;  


SELECT     productCode,
  ROUND(AVG(quantityOrdered * priceEach)) as avg_order_item_value
FROM     orderDetails
GROUP BY    productCode; 


SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);



UPDATE tbl_name SET 
    field_name = REPLACE(field_name, string_to_find, string_to_replace)
WHERE    conditions;



UPDATE products 
SET productDescription = REPLACE(productDescription,'abuot','about');



SELECT DATEDIFF('2011-08-17','2011-08-17');  
#Result  :   0 day


SELECT DATEDIFF('2011-08-17','2011-08-08'); 
#Result:  9 days


SELECT DATEDIFF('2011-08-08','2011-08-17');  
#Result:  -9 days



SELECT orderNumber, DATEDIFF(requiredDate, shippedDate) as  daysLeft
FROM     orders
ORDER BY  daysLeft DESC;



SELECT orderNumber, DATEDIFF(requiredDate, orderDate) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;


SELECT 
    orderNumber,
    ROUND(DATEDIFF(requiredDate, orderDate) / 7, 2),
    ROUND(DATEDIFF(requiredDate, orderDate) / 30,2)
FROM     orders 
WHERE    status = 'In Process';


SELECT 
    orderNumber,
    DATE_FORMAT(orderdate, '%Y-%m-%d') orderDate,
    DATE_FORMAT(requireddate, '%a %D %b %Y') requireddate,
    DATE_FORMAT(shippedDate, '%W %D %M %Y') shippedDate
FROM    orders;


SELECT     orderNumber,
    DATE_FORMAT(shippeddate, '%W %D %M %Y')  as 'Shipped date'
FROM    orders
ORDER BY shippeddate;


SELECT firstName, LPAD(firstName,10,'kk'), LPAD(firstName,5,'kk'), LPAD(firstName,4,'kk') FROM classicmodels.employees;



TRIM([{BOTH|LEADING|TRAILING} [removed_str]] FROM str);

SELECT  DAY(orderdate) as dayofmonth, COUNT(*)
FROM    orders WHERE    YEAR(orderdate) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;
