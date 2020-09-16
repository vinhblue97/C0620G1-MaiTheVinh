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
group by contracts.id