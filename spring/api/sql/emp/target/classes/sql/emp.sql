use koreaitdb;

create table emp_tb(
id int not null auto_increment primary key,
selDept varchar(20),
email varchar(50),
passwd varchar(20),
regdate date
);