use furama_resort;

drop view if exists test;
create view test as
select adding_service.id as id , count(contract_detail.adding_service_id) as num_extra_service from contracts 
join contract_detail on contract_detail.contract_id = contracts.id
join adding_service on adding_service.id = contract_detail.adding_service_id
group by contract_detail.adding_service_id;

update adding_service 
set cost = cost*2 
where id in (
select id from test 
group by id
having test.num_extra_service >=10);
drop view if exists test;

