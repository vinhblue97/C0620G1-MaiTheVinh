use furama_resort;
drop view if exists task_12;
create view task_12 as
select contracts.id as contract_id, concat(employees.last_name,' ', employees.middle_name,' ', employees.first_name) as employee_name, customers.`name` as customer_name, customers.phone_number as customer_phone, services.`name` as service_name;

select adding_service_id, count(adding_service_id) from contract_detail
group by adding_service_id;