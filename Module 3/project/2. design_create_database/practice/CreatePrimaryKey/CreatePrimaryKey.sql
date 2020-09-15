-- drop database create_primary_key;

create database create_primary_key;
use create_primary_key;

create table users(
user_id int primary key auto_increment,
user_name varchar(50) not null,
`password` varchar(20) not null,
email varchar(20) not null
);

create table roles(
role_id int auto_increment,
role_name varchar(20),
primary key(role_id)
); 

create table userroles(
user_id int not null,
role_id int not null,
primary key (user_id,role_id),
foreign key(user_id) references users(user_id),
foreign key(role_id) references roles(role_id)
);
