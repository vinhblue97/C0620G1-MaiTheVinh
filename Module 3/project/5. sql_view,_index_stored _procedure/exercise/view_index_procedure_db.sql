drop database if exists view_index_procedure;
create database view_index_procedure;
use view_index_procedure;

create table products(
id int primary key auto_increment,
productCode varchar(50) unique,
productName varchar(50),
productPrice varchar(50),
productAmount int default 0,
productDescription varchar(50) default null,
productStatus varchar(50) default null
);

insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
values ('001', 'Giày', '7.000.000', 10, null,null),
('002', 'Máy Tính ', '150.000.000', 10, null,null),
('003', 'Tủ Lạnh', '200.000.000', 5, null,null),
('004', 'Xe', '500.000.000', 10, null,null);



