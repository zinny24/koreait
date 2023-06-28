use tb_koreait;

create table kor_dept(
kor_dept_code char(3) not null, -- 100, 200, 300, 900
kor_dept_name varchar(20) not null, -- 인사과, 비서실, 영업부, 임원실...
primary key(kor_dept_code)
);

INSERT INTO kor_dept VALUES('100', '인사과');
INSERT INTO kor_dept VALUES('200', '비서실');
INSERT INTO kor_dept VALUES('300', '영업부');
INSERT INTO kor_dept VALUES('900', '임원실');