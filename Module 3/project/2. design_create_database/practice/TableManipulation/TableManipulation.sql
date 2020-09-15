-- drop database manipulation_table;
create database manipulation_table;
use manipulation_table;
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
-- chen them cot last_name o sau cot contact_id
alter table contacts
add last_name varchar(25) not null
after contact_id;

-- chinh sua mo ta cua 1 cot
alter table contacts
modify last_name varchar(100) not null;

-- xoa 1 cot trong bang

alter table contacts
drop column first_name;
-- thay doi ten cot
alter table contacts
change column last_name vinh_blue
varchar(100) not null;
-- doi ten bang
alter table contacts
rename to people;