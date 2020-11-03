use sdet4_roshni
-- Activity 2-----------------------------------------------------------
-- Create salesman table
CREATE TABLE salesman (
    salesman_id int primary key,
    name varchar(32),
    city varchar(32),
    commission int
);
-- Insert values one at a time
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
-- Insert multiple rows at once
INSERT INTO salesman VALUES
    (5002, 'Nail Knite', 'Paris', 13),
    (5005, 'Pit Alex', 'London', 11), 
    (5006, 'McLyon', 'Paris', 14), 
    (5007, 'Paul Adam', 'Rome', 13),
    (5003, 'Lauson Hen', 'San Jose', 12);

-- View all columns
SELECT * FROM salesman;
-- Activity 3------------------------------------------------------------------
-- Show data from the salesman_id and city columns
SELECT salesman_id, city FROM salesman;
-- Show data of salesman from Paris
SELECT * FROM salesman WHERE upper(city)='PARIS';
-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE upper(name)='PAUL ADAM';

-- Activity 4----------------------------------------------------------------
-- Add the grade column
ALTER TABLE salesman ADD grade int;
-- Update the values in the grade column
UPDATE salesman SET grade=100;

-- Display data
SELECT * FROM salesman;

-- Alter Command-------------------
alter table salesman add state varchar(50);
ALTER TABLE salesman MODIFY COLUMN state varchar(10); 
alter table salesman add DateofBirth date;
insert INTO  salesman (salesman_id,name,city,commission,grade,state,DateofBirth) values (5009,'Matt',null,null,null,'CA',null);
insert INTO  salesman (salesman_id,name,city,commission,grade,state,DateofBirth) values (5010,'John Jame',null,null,null,'TX',null);
UPDATE salesman SET city='ROME' ,commission='6' where salesman_id=5009
DELETE FROM salesman WHERE salesman_id=5010
COMMIT
--  Activity 5---------------------------------------
UPDATE salesman SET GRADE=300 WHERE upper(city)='ROME'
update salesman set grade=300 where upper(name)='JAMES HOOG'
UPDATE salesman set name='Pierre' where name='McLyon'
-- Sorting data from tables
select * from salesman order by salesman_id desc
select * from salesman order by city
select *  from salesman where salesman_id <> 5005
select *  from salesman where salesman_id > 5006
select *  from salesman where salesman_id < 5006
select *  from salesman where  salesman_id <5006 and grade=300
select *  from salesman where  salesman_id <5006 or grade=300
select *  from salesman where  salesman_id between 5002 and 5006
select *  from salesman where  not salesman_id=5002

-- Activity 6-
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);
    insert into orders values
(70001, 150.5, '2012-10-05', 3005, 5002), (70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001), (70004, 110.5, '2012-08-17', 3009, 5003),
(70007, 948.5, '2012-09-10', 3005, 5002), (70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-08-15', 3002, 5001), (70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.4, '2012-10-10', 3009, 5003), (70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007), (70013, 3045.6, '2012-04-25', 3002, 5001);

select distinct salesman_id from orders

select order_no,order_date from orders order by order_date
select order_no,purchase_amount from orders order by purchase_amount desc
select * from orders where purchase_amount < 500
select * from orders where purchase_amount between  1000 and 2000


-- Managing Database Transactions --------------------------------
select * from orders 
delete from orders where order_no = 70003
commit;
select * from orders 
delete from orders where order_no = 70008
ROLLBACK;
select * from orders 

-- Savepoint created
SAVEPOINT SP1;
-- Delete row with ID = 1
delete from orders where order_no =70005
-- Create second Savepoint
SAVEPOINT SP2;
-- Delete row with ID = 2
delete from orders where order_no =70006
ROLLBACK TO SP2;

---Aggregate Functions
