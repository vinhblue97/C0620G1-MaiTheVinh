drop database if exists library_management;
create database library_management;
use library_management;

create table books(
id int auto_increment,
name varchar(50) not null,
borrow_order_id int,
type_of_book_id int,
primary key(id)
);

create table type_of_book(
id int auto_increment,
name varchar(50),
primary key (id)
);

create table borrow_order(
id int auto_increment,
class varchar(50) not null,
student_id int,
primary key(id)
);

create table students(
id int auto_increment,
`name` varchar(50) not null,
gender varchar(50) not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50),
identify_card varchar(50) not null,
primary key (id)
);

alter table borrow_order add foreign key (student_id) references students(id);
alter table books add foreign key (borrow_order_id) references borrow_order(id);
alter table books add foreign key (type_of_book_id) references type_of_book(id);

