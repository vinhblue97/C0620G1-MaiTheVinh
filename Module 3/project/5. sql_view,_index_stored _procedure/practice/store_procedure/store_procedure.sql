use classicmodels;
-- tạo procedure 
delimiter //
drop procedure if exists `findAllCustomers`//
create procedure findAllCustomers()
begin 
select * from customers;
end; //
-- gọi procedure 
call findAllCustomers;

delimiter//
drop procedure if exists `findAllCustomers`//
create procedure findAllCustomers()
begin


