use koreaitdb;

create table kor_emp(
id int not null auto_increment,
dept varchar(30) not null,
email varchar(100) not null,
username varchar(20) not null,
regdate datetime,
primary key(id)
);