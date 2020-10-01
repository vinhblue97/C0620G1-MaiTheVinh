drop database if exists use_manages;
create database use_manages;
use use_manages;

create table users
(
    id      INTEGER      NOT NULL,
    `name`  varchar(255) NOT NULL,
    email   varchar(255) NOT NULL,
    country varchar(255),
    PRIMARY KEY (id)
);

create table Permision
(
    id   int(11) primary key,
    name varchar(50)
);

create table User_Permision
(
    permision_id int(11),
    user_id      int(11)
);

