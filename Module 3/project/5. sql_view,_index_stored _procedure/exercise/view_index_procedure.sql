use view_index_procedure;

create index product_name_price on products(productName, productPrice);
explain select * from products where productName = 'Giày' or productPrice = '150.000.000';

-- Step 4:
create view products_view as
select productCode, productName, productPrice, productStatus from products;

select * from products_view;

insert into products_view (productCode, productName, productPrice, productStatus)
values ('006', 'Điều hoà', '100.000.000', 'haiz');

-- Step 5:
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure products_infor()
begin
select * from products;
end; //
delimiter ;

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure products_infor(`code` varchar(50),`name` varchar (50), price varchar (50))
begin
insert into products (productCode,productName,productPrice)
values (`code`, `name`, price);
end; //
delimiter ;

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure products_infor(set_id int, `name` varchar (50))
begin
update products
set productName = `name` where id = set_id ;
end; //
delimiter ;

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure products_infor(set_id int)
begin
delete from products where id = set_id;
end; //
delimiter ;

