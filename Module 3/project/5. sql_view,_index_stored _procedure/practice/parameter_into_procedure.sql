use classicmodels;
-- --------------------- IN--------------------- 
select * from customers;
delimiter //
drop procedure if exists `getCusById`//
create procedure getCusById
(in cusNum int(11))
begin
select * from customers where customerNumber = cusNum;

end;//
call getCusById(496);
drop procedure if exists `getCusById`//

-- --------------------- OUT--------------------- 
delimiter //
create procedure GetCustomerCountById(
in in_city varchar(50),
out total int
)
begin 
select count(CustomerNumber)

-- --------------------- INOUT--------------------- 
DELIMITER //

CREATE PROCEDURE SetCounter(

    INOUT counter INT,

    IN inc INT

)

BEGIN

    SET counter = counter + inc;

END//

DELIMITER ;
SET @counter = 1;

CALL SetCounter(@counter,1); -- 2

CALL SetCounter(@counter,1); -- 3

CALL SetCounter(@counter,5); -- 8

SELECT @counter; -- 8

DELIMITER ;

CALL GetCustomerCountById('NYC',@total);

SELECT @total;

select city, count(*) as SL from customers 
group by city;