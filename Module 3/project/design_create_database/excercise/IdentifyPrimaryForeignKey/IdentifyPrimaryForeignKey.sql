drop database bank_management;
create database bank_management;
use bank_management;

create table customer(
customer_number int auto_increment,
full_name varchar(20) not null,
address varchar(30) not null,
email varchar(20) not null,
phone int not null,
constraint customer_pk primary key(customer_number)

);

create table `account`(
account_number int auto_increment,
account_type varchar(20),
`date` date,
balance int not null,
constraint account_pk primary key(account_number),
customer_number int,
foreign key(customer_number) references customer(customer_number)
);

create table `transaction`(
tran_number int not null,
`date` date not null,
amount int not null,
`description` varchar(10) default 'Not thing' ,
account_number int,
foreign key(account_number) references account(account_number)
);

