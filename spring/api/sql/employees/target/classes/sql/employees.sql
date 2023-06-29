use tb_koreait;

CREATE TABLE kor_employees(
kor_emp_id int not null auto_increment,
kor_emp_email varchar(50) not null unique,
kor_emp_passwd varchar(20) not null,
kor_emp_name varchar(10) not null,
kor_emp_gender enum('M', 'W'),
kor_emp_dept char(3) not null,
kor_emp_pos char(3) not null,
kor_emp_level int default 1,
kor_emp_created datetime,
kor_emp_modified datetime,
kor_emp_image_name varchar(255),
kor_emp_image_size bigint,
kor_emp_trans_name varchar(255),
primary key(kor_emp_id)
);
-- ADMIN 계정은 미리 생성
INSERT INTO kor_employees
VALUES(NULL, 'mail@mail.com', '1111', '관리자', 'M' , '100', '101', 7, now(), now(), '', 0, '');







