drop database if exists query_database_from_table;
create database query_database_from_table;
use query_database_from_table;

select customerNumber, customerName, phone, paymentDate, amount  from classicmodels.customers
inner join classicmodels.payments
on customers.customerNumber = payments.customerNumber
where city ='Las Vegas';

