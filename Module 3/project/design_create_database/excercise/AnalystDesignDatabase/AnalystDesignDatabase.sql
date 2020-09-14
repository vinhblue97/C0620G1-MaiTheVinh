drop database if exists sale_management;
create database sale_management;
use sale_management;

create table customers(
customer_number int auto_increment,
customer_name varchar(50) not null,
contact_last_name varchar(50) not null,
contact_first_name varchar(50) not null,
phone varchar(50) not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50) not null,
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(15) not null,
country varchar(50) not null,
credit_limit varchar(50) not null,
employee_number int,
constraint customer_pk primary key(customer_number) 
);

create table product_lines(	
product_line int auto_increment,
`description` varchar(50) not null,
constraint productline_pk primary key(product_line)
);

create table products(
product_code int auto_increment,
product_name varchar(50) not null,
supplier varchar(50) not null,
stock_number int not null,
import_cost int,
export_cost int,
product_line int,
constraint product_pk primary key(product_code)
);

create table orders(
order_number int auto_increment,
order_date date not null,
required_date  date not null,
shippe_dDate  date not null,
`status` varchar(50) not null,
comments text,
quantity_ordered int not null,
price_each float not null,
amount_order int,
total_cost int,
customer_number int,
constraint order_pk primary key(order_number)
);

create table payments(
payment_code int auto_increment,
payment_date date not null,
amount int not null,
customer_number int,
constraint payment_pk primary key(payment_code)
);

create table employees(
employee_number int auto_increment,
last_name  varchar(50) not null,
first_name varchar(50) not null,
email varchar(100) not null,
job_title  varchar(50) not null,
office_code varchar(10),
manager_id int,
constraint employee_pk primary key(employee_number)
);

create table offices(
office_code varchar(10),
office_address1 varchar (50) not null,
office_address2 varchar (50) not null,
office_phone varchar (50) not null,
office_country varchar(50) not null,
state varchar(50) not null,
city varchar(50) not null,
post_code varchar(15) not null,
constraint office_pk primary key(office_code)
);
-- bang trung gian N:M
create table orders_have_products(
order_number int,
product_code int,
primary key(order_number, product_code),
foreign key (order_number) references orders(order_number),
foreign key (product_code) references products(product_code)
);

create table fk_manager_of_employee(
	manager_id int,
    manager_name varchar(50),
    primary key (manager_id)
);

alter table orders add foreign key(customer_number) references customers(customer_number);
alter table payments add foreign key(customer_number) references customers(customer_number);
alter table customers add foreign key(employee_number) references employees(employee_number);
alter table employees add foreign key(office_code) references offices(office_code);
alter table products add foreign key(product_line) references product_lines(product_line);
alter table employees add foreign key(manager_id) references fk_manager_of_employee(manager_id);