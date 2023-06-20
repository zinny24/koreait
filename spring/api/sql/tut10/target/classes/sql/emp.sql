use koreaitdb;

create table kor_sawon(
emp_id int not null auto_increment,
emp_email varchar(50) not null,
emp_passwd varchar(20) not null,
emp_name varchar(20) not null,
emp_reg datetime,
primary key(emp_id)
);
