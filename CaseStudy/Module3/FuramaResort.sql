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
id int,
`name` varchar(45) not null,
primary key(id)
);

create table employee_level(
id int,
`name` varchar(45) not null,
primary key(id)
);

create table offices(
id int,
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
id int,
`name` varchar(45) not null,
cost int not null,
unit int not null,
`status` varchar(45) default null,
primary key (id)
);

create table contract_detail(
amount int,

contract_id int,
adding_service_id int,

constraint id primary key (contract_id, adding_service_id)
);

create table customers(
id int auto_increment,

type_of_customer_id int,

`name` varchar(45) not null,
birthday date not null,
gender varchar(45) default 'male',
identify_card varchar(45) not null,
phone_number varchar(45) not null,
email varchar(45) not null,
address varchar(45) not null,
primary key(id)
);

create table type_of_customers(
id int,
`name` varchar(45) not null,
primary key (id)
);

create table services(
id int auto_increment,
`name` varchar(45) not null,
area int not null,
floors int not null,
max_people varchar(45) not null,
cost int,
type_of_service_id int,
type_rent_id int,
service_status varchar(45) not null,
primary key(id)
);

create table type_of_service(
id int,
`name` varchar(45) not null,
primary key(id) 
);

create table type_rent(
id int,
`name` varchar(45) not null,
cost varchar(45) not null,
primary key (id)
);

alter table employees add foreign key(position_id) references employee_position(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table employees add foreign key(level_id) references employee_level(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table employees add foreign key(office_id) references offices(id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table contracts add foreign key(employee_id) references employees(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table contracts add foreign key(customer_id) references customers(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table contracts add foreign key(service_id) references services(id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table customers add foreign key(type_of_customer_id) references type_of_customers(id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table services add foreign key(type_of_service_id) references type_of_service(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table services add foreign key(type_rent_id) references type_rent(id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table contract_detail add foreign key(contract_id) references contracts(id) ON DELETE CASCADE ON UPDATE CASCADE;
alter table contract_detail add foreign key(adding_service_id) references adding_service(id) ON DELETE CASCADE ON UPDATE CASCADE;

insert into employee_position(id,`name`)
values (1,'Receptionist'),
(2,'Waiter'),
(3,'Expert'),
(4, 'Monitor'),
(5, 'Manager'),
(6, 'Chairman');

insert into employee_level(id,`name`)
values (1, 'Intermediate'),
(2, 'College'), 
(3, 'University'),
(4, 'After university');

insert into offices(id,`name`)
values (1, 'Sale – Marketing'),
(2, 'Administration'),
(3, 'Waiter'),
(4, 'Manager');

insert into type_of_customers(id, `name`)
values (1, 'Diamond'),
(2,'Platium'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');

insert into  type_of_service(id, `name`)
values (1, 'Villa'),
(2, 'House'),
(3, 'Room'),
(4, 'Adding service');

insert into type_rent(id,`name`, cost)
values (1, 'Hour', '100.000'),
(2, 'Day', '2.000.000'),
(3, 'Week', '12.000.000'),
(4, 'Month', '40.000.000'),
(5, 'Year', '500.000.000');

insert into adding_service (id,`name`, cost, unit)
values (1,'massage', 200000, 1),
(2,'karaoke', 100000, 2),
(3,'foods', 150000, 3),
(4,'drinks', 50000, 3);

insert into services(`name`, area, floors, max_people, cost, type_of_service_id, type_rent_id, service_status)
values ('Villa 1', 1000, 5, '20', 10000000, 1, 1,'busy'),
('House 1', 500, 3, '4', 5000000, 2, 1,'available'),
('Villa 2', 2000, 5, '20', 20000000, 1, 1,'available'),
('House 2', 700, 2, '6', 8000000, 2, 3,'available');

insert into employees (last_name, middle_name, first_name, position_id, level_id, office_id, birth_day, identify_card, salary,phone_number, email, address)
values ('Nguyễn', 'Văn', 'Hoàng', 1, 1, 1,'1997-03-31','197362335', '10.000.000','0334611971', 'hoangvan@gmail.com','Hải Châu' ),
('Hoàng', 'Văn', 'Thất',2 ,2, 1, '2001-12-03','197362335', '15.000.000','0334611971', 'thathoang@gmail.com','Đà Nẵng' ),
('Trần', 'Công', 'Hoàn',3 ,2, 2, '1999-05-14','197362335', '13.000.000','0334611971', 'hoantran@gmail.com','Quảng Trị' );

insert into customers (type_of_customer_id, `name`, birthday, identify_card,phone_number, email, address)
values (1, 'Mai Thế Vinh', '1997-03-31','197362335', '0334611971', 'vinhblue97@gmail.com', 'Quảng Trị'),
(2, 'Hoàng Minh Quân', '1992-07-15','197362335', '0334251912', 'gigahoang@gmail.com', 'Sài Gòn'),
(3, 'Trần Huỳnh Kim Ngân', '1992-11-03','423432423', '0334251912', 'kimngan@gmail.com', 'Đà Nẵng'),
(4, 'Trần Huỳnh Kim Ngân', '1992-11-03','423432423', '0334251912', 'kimngan@gmail.com', 'Đà Nẵng');

insert into contracts (employee_id, customer_id, service_id, begin_date, end_date, deposists, total_cost)
values (2,2,3,'2017-01-30','2018-11-30',1000000, 3000000),
(2,2,3,'2018-12-04','2018-12-30',1000000, 3000000),
(1,1,1,'2019-12-12','2019-10-01',1000000, 1500000), 
(2,2,2,'2019-10-30','2020-11-30',1000000, 3000000),
(2,1,2,'2015-10-30','2015-11-30',1000000, 3000000),
(2,2,4,'2015-10-30','2016-11-30',1000000, 3000000);

insert into contract_detail(contract_id, adding_service_id)
values (1, 2),
(1, 4),
(1, 1),
(2,3),
(3, 4),
(3, 1),
(4,3);
