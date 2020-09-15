drop database if exists furama_resort;
create database furama_resort;
use furama_resort;

create table employees(
id int auto_increment,
last_name varchar(45) not null,
middle_name varchar(45) not null,
first_name varchar(45) not null,

position_id int,
level_id int,
office_id int,

birth_day date not null,
identify_card varchar(45) not null,
salary varchar(45) not null,
phone_number varchar(45) not null,
email varchar(45) not null,
address varchar(45) not null,
primary key(id)
);

create table employee_position(
id int auto_increment,
`name` varchar(45) not null,
primary key(id)
);

create table employee_level(
id int auto_increment,
`name` varchar(45) not null,
primary key(id)
);

create table offices(
id int auto_increment,
`name` varchar(45) not null,
primary key(id)
);

create table contracts(
id int auto_increment,

employee_id int,
customer_id int,
service_id int,

begin_date date not null,
end_date date not null,
deposists int not null,
total_cost int not null,
primary key(id)
);

create table adding_service(
id int auto_increment,
`name` varchar(45) not null,
cost int not null,
unit int not null,
`status` varchar(45) not null,
primary key (id)
);

create table contract_detail(
id int auto_increment,
amount int not null,

contract_id int,
adding_service_id int,

foreign key(contract_id) references contracts(id),
foreign key(adding_service_id) references adding_service(id),
primary key(id)
);

create table customers(
id int auto_increment,

type_of_customer_id int,

`name` varchar(45) not null,
birthday date not null,
identify_card varchar(45) not null,
phone_number varchar(45) not null,
email varchar(45) not null,
address varchar(45) not null,
primary key(id)
);

create table type_of_customers(
id int auto_increment,
`name` varchar(45) not null,
primary key (id)
);

create table services(
id int auto_increment,
`name` varchar(45) not null,
area int not null,
floors int not null,
max_people varchar(45) not null,
cost varchar(45) not null,

type_of_service_id int,
type_rent_id int,

service_status varchar(45) not null,
primary key(id)
);

create table type_of_service(
id int auto_increment,
`name` varchar(45) not null,
primary key(id) 
);

create table type_rent(
id int auto_increment,
`name` varchar(45) not null,
cost varchar(45) not null,
primary key (id)
);

alter table employees add foreign key(position_id) references employee_position(id);
alter table employees add foreign key(level_id) references employee_level(id);
alter table employees add foreign key(office_id) references offices(id);

alter table contracts add foreign key(employee_id) references employees(id);
alter table contracts add foreign key(customer_id) references customers(id);
alter table contracts add foreign key(service_id) references services(id);

alter table customers add foreign key(type_of_customer_id) references type_of_customers(id);

alter table services add foreign key(type_of_service_id) references type_of_service(id);
alter table services add foreign key(type_rent_id) references type_rent(id);

insert into employees (last_name, middle_name, first_name, birth_day, identify_card, salary,phone_number, email, address)
values ('Nguyễn', 'Văn', 'Hoàng', '1997-03-31','197362335', '10.000.000','0334611971', 'hoangvan@gmail.com','Đà Nẵng' ),
('Hoàng', 'Văn', 'Thất', '2001-12-03','197362335', '15.000.000','0334611971', 'thathoang@gmail.com','Đà Nẵng' ),
('Trần', 'Công', 'Hoàn', '1999-05-14','197362335', '13.000.000','0334611971', 'hoantran@gmail.com','Quảng Trị' );

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from employees where first_name like 'T%' or first_name like 'H%' or first_name like 'K%' ;

insert into customers (`name`, birthday, identify_card,phone_number, email, address)
values ('Mai Thế Vinh', '1997-03-31','197362335', '0334611971', 'vinhblue97@gmail.com', 'Quảng Trị'),
('Hoàng Minh Quân', '1992-07-15','197362335', '0334251912', 'gigahoang@gmail.com', 'Sài Gòn');

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from customers where ((year(current_date) - year(birthday)) > 18 and (year(current_date) - year(birthday)) < 50) and (address ='Quảng Trị' or address = 'Đà Nẵng');

insert into contracts (begin_date, end_date, deposists, total_cost)
values ('2020-09-15','2020-10-01',1000000, 1500000), 
('2020-09-15','2020-11-30',1000000, 3000000);

select * from contracts;


