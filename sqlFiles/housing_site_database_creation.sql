create database housing_site;

use housing_site;
# the whole database is going to be rewritten, this is just for testing

create table user(
    Id       int primary key auto_increment,
    Name     varchar(20),
    Surname  varchar(20),
    Email    varchar(40),
    Password varchar(20)
);

create table listing(
    id int primary key auto_increment,
    name varchar(40),
    description text
);

insert into user (Name, Surname, Email, Password)
values ('Martin', 'Hvizdak', 'example@mail.com', 'password')

select * from user;