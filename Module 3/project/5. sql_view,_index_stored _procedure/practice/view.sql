use classicmodels;

select * from customers;

create view customer_view as 
select  customerNumber, customerName, phone from customers;

select * from customer_view;

-- --------------- Update view ------------------- 
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';
select * from customer_views;

-- ------------------ XOA VIEW ------------------

drop view customer_views;