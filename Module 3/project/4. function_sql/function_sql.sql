drop database if exists function_sql;
create database function_sql;

use function_sql;
create table students(
id int primary key auto_increment,
`name` varchar (50) not null,
age int,
branch varchar(50) not null,
amount_money int
);

insert into students (`name`, age, branch, amount_money) 
values ('Hoang', 21, 'CNTT', 40000),
('Viet', 19, 'DTVT', 40000),
('Thanh', 18, 'KTDN', 40000),
('Nhan', 19, 'CK', 40000),
('Huong', 20, 'TCNH', 40000),
('Huong', 20, 'TCNH', 40000);

-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong

select * from students 
where `name` = 'Huong';

-- Viết câu lệnh lấy ra tổng số tiền của Huong

select sum(amount_money) from students 
where `name` = 'Huong';

-- Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp 

select  distinct `name` from students;