-- drop database if exists furama_resort;
-- create database furama_resort;
use furama_resort;
select * from employees;
create table employees(
id varchar(45),
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
id int,

employee_id varchar(45),
customer_id varchar(45),
service_id varchar(45),

begin_date date not null,
end_date date not null,
deposists int not null,
total_cost int not null,
primary key(id)
);

create table extra_service(
id int,
`name` varchar(45) not null,
cost int not null,
unit int not null,
`status` varchar(45) default null,
primary key (id)
);
drop table contract_detail;
create table contract_detail(
amount int,
contract_id int,
extra_service_id int,
constraint id primary key (contract_id, extra_service_id)
);

create table customers(
id varchar(45) not null,
type_of_customer_id int,

`name` varchar(45) not null,
birthday date not null,
gender int,
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
id varchar(45),
`name` varchar(45) not null,
area int not null,
floors int not null,
max_people varchar(45) not null,
cost int,
type_of_service_id int,
type_rent_id int,
standard_room varchar(45),
pool_area varchar(45),
service_status varchar(45),
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
alter table contract_detail add foreign key(extra_service_id) references extra_service(id) ON DELETE CASCADE ON UPDATE CASCADE;

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

insert into extra_service (id,`name`, cost, unit)
values (1,'massage', 200000, 1),
(2,'karaoke', 100000, 2),
(3,'foods', 150000, 3),
(4,'drinks', 50000, 3);
select * from contract_detail;
insert into contract_detail(contract_id, extra_service_id)
values (1, 2),
(1, 4),
(1, 1),
(2,3),
(3, 4),
(3, 1),
(4,3);
