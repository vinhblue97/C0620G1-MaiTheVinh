use furama_resort;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from employees where first_name like 'T%' or first_name like 'H%' or first_name like 'K%' ;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *,
timestampdiff(year, birthday, current_date) as age
from customers having (timestampdiff(year, birthday,current_date) > 18 and timestampdiff(year, birthday,current_date) < 50) and (address ='Quảng Trị' or address = 'Đà Nẵng');

select * from services;
select * from employees;
select * from customers;
select * from contracts;


-- 4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 select customers.id, customers.`name` as `Name`, type_of_customers.`name` as `Type`, count(contracts.customer_id) as SL from customers 
 left join type_of_customers on customers.type_of_customer_id = type_of_customers.id
 left join contracts on contracts.customer_id = customers.id
 where type_of_customers.id = 1
 group by customers.`name`
 order by SL;
 -- ---------------------
 select customers.id, customers.`name` as `Name`, count(contracts.customer_id) as SL from customers
 where id in(
 select customer_id from contracts 
 where customer_id is not null
 ); 
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
 select c.id as ID, c.`name` as `Name`, `type`.`name` as `Type`,
 con.id as 'Contract ID', ser.`name` as 'Service Name', con.begin_date as 'Begin date contract', 
 con.end_date as 'End date contract', adding.cost*adding.unit+con.total_cost as 'Total' 
 from customers as c
 left join type_of_customers as `type` on `type`.id = c.type_of_customer_id
 left join contracts as con on con.customer_id = c.id 
 left join services as ser on ser.id = con.service_id
 left join contract_detail as detail on detail.contract_id = con.id
 left join adding_service as adding on detail.adding_service_id = adding.id;
 
--  6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng 
--  thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select ser.id as 'ID', ser.`name` as 'Name', ser.area as 'Area', ser.cost as 'Cost', typeSer.`name` as 'Type'
from services as ser
left join type_of_service as typeSer on typeSer.id = ser.type_of_service_id
left join contracts as con on con.service_id = ser.id
where (year(con.begin_date) <2019 and year (con.end_date)<2019) or ser.service_status = 'available'
group by ser.`name`;

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng 
-- đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select ser.id as 'ID', ser.`name` as 'Name', ser.area as 'Area', ser.max_people as 'Max People', ser.cost as 'Cost', type_of_service.`name`, contracts.begin_date
from services as ser
left join contracts on contracts.service_id = ser.id
left join type_of_service on type_of_service.id = ser.type_of_service_id
where year(begin_date) = 2018 and ser.id not in (
select service_id from contracts
where year(begin_date) > 2018);

-- 8. Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

select distinct c.`name` from customers as c; 

-- --------------

select c.`name` from customers as c
union
select c.`name` from customers as c;

-- --------------

select c.`name` from customers as c
group by `name`;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(begin_date) as `month`, count(month(begin_date)) as number_customers
from contracts 
where year(begin_date) = 2019
group by `month`
order by `month`;

-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select contracts.id as ID, contracts.begin_date, end_date, deposists, count(adding_service.id) as ExtraService
from contracts 
left join contract_detail as detail on detail.contract_id = contracts.id 
left join adding_service on detail.adding_service_id = adding_service.id
group by contracts.id;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
delimiter //
drop procedure if exists task11;
create procedure task11()
begin
drop view if exists task11;
create view task11 as
select ad.id, ad.`name`, ad.cost, ad.unit from adding_service as ad
join contract_detaitask11l on contract_detail.adding_service_id = ad.id
join contracts on contracts.id = contract_detail.contract_id
join customers on customers.id = contracts.customer_id
join type_of_customers on type_of_customers.id = customers.type_of_customer_id where type_of_customers.`name` = 'Diamond' and customers.address = 'Quảng Trị';
select * from task11;
end; //
delimiter ;
call task11();

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

drop view if exists task_12;
create view task_12 as
select contracts.id, employees.first_name, customers.`name` as CustomerName, customers.phone_number as customerPhone, services.`name` as ServiceName, count(contract_detail.contract_id) as Number_of_extra_service
from contracts 
right join employees on employees.id = contracts.employee_id
right join customers on customers.id = contracts.customer_id
right join services on services.id = contracts.service_id
right join contract_detail on contract_detail.contract_id = contracts.id
group by contracts.id
order by contracts.id;

select * from task_12;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

drop view if exists test;
create view test as
select adding_service.`name`, adding_service.cost as cost, adding_service.unit as unit, count(adding_service_id) as freequency from contract_detail
right join adding_service on adding_service.id = contract_detail.adding_service_id
group by adding_service_id;

select `name`, cost, unit from test
where freequency in (
	select max(freequency) from test
);
drop view test;



-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select * from adding_service
where id in (
select adding_service_id from task_13
where SL = max(SL)
);

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

-- --------------------------------------bug 1175  -------------------------------------------

delete from employees 
where id not in (
	select employee_id from contracts
    where year(begin_date) >=2017 and year(begin_date) <=2019  
);
select * from employees;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

drop view if exists task_17;
create view task_17 as 
select customers.`name`, customers.birthday, customers.identify_card,customers.phone_number, customers.email, customers.address from customers
join contracts on contracts.customer_id = customers.id
where ((customers.type_of_customer_id = 1) or (customers.type_of_customer_id = 2)) and ((year(contracts.begin_date) = 2019) and (contracts.total_cost > 1000000));

select * from task_17;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
drop view if exists task_18;
create view task_18 as
select customers.id from customers 
join contracts on contracts.customer_id = customers.id
where year(begin_date) < 2016 or year(end_date) < 2016;

select * from task_18;

delete from customers
where customers.id in (
select id from task_18); 
drop view if exists task_18;

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
delimiter //
create function countFre()
returns int
deterministic
begin
declare counter int;
drop view if exists temp;
create view temp as
select count(adding_service_id) as Sl from contract_detail
group by adding_service_id;
set counter = temp.Sl;
drop view if exists temp;
return counter;
end; //
delimiter ;

select countFre();

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID 
-- (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
delimiter //
drop procedure if exists task_20;
create procedure task_20()
begin
drop view if exists customer_employees;
create view customer_employees as
select customers.id, customers.`name` as customerName, customers.email as customerEmail, customers.phone_number as customerPhone, customers.birthday as customerBirthDay, customers.address as customerAddress  from customers
select employees.id as employee_id, concat(employees.last_name,' ', employees.middle_name,' ', employees.first_name) as employeeName, employees.email as employeeEmail, employees.phone_number as employeePhone,employees.birth_day as employeeBirthDay,  employees.address as employeeAdress from  employees
end; //
delimiter ;

