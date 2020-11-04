use sdet4_roshni 
-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);
-- Insert values into it
insert into customers values 
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);
select distinct customers.customer_name from customers,salesman
where customers.salesman_id=salesman.salesman_id
-- Write an SQL statement to know which salesman are working for which customer.
select * from customers
select * from salesman
SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission 
FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;
--  write an SQL statement to make a list in ascending order for the customer
--  who holds a grade less than 300 and works either through a salesman.
select  a.customer_name,a.city, a.grade, o.name AS "Salesman", o.city 
 from customers a
LEFT OUTER JOIN salesman o
ON a.salesman_id=o.salesman_id
where o.grade <300 order by a.customer_id

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

-- Write an SQL statement to find the list of customers who appointed
-- a salesman for their jobs who gets a commission from the company is more than 12%.
select a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission from 
customers a ,salesman b
where a.salesman_id=b.salesman_id
and b.commission >12

-- Write an SQL statement to find the details of a order i.e. order number, 
-- order date, amount of order, which customer gives the order and which salesman 
-- works for that customer and commission rate he gets for an order.
select * from orders
select  a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name",
 b.grade, c.name AS "Salesman", c.commission 
 from  orders a,salesman c,customers b
where a.customer_id=b.customer_id 
and c.salesman_id=b.salesman_id

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

-- Activity 10-----------------------------------
--    Write a query to find all the orders issued against the salesman 
--  who may works for customer whose id is 3007.
select * from orders
where salesman_id in (select distinct salesman_id from orders where customer_id=3007)
--    Write a query to find all orders attributed to a salesman in New York.
select * from orders
where salesman_id = (select distinct salesman_id from salesman where upper(city)='NEW YORK')
SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York')
--    Write a query to count the customers with grades above New York's average.
SELECT grade,count(customer_id)
FROM customers
where grade > (select avg(grade) from customers WHERE city='New York' )
group by grade
SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York')
--    Write a query to extract the data from the orders table for those salesman who
-- earned the maximum commission
select order_no, purchase_amount, order_date, salesman_id  from orders 
where salesman_id IN( SELECT salesman_id FROM salesman
WHERE commission=(SELECT MAX(commission) FROM salesman));

-- Activity 11
-- Write a query that produces the name and number of each salesman and 
-- each customer with more than one current order. Put the results in alphabetical order.
-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;
-- Write a query to make a report of which salesman produce the largest and 
-- smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values
SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);