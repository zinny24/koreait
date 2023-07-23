use kordb;

create table member(
id int not null auto_increment,
userid varchar(20),
username varchar(20),
passwd varchar(20),
level int,
primary key(id)
);