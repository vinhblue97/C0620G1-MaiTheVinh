use classicmodels;

select * from customers
where customerNumber = 175;

alter table customers drop index idx_fullname;

alter table customers add index idx_fullname(contactLastName, contactFirstName);
explain select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';
 select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';

select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';
select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';
select * from customers where customerNumber =  496;

