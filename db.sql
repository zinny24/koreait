create user yhlee@'%' identified by '1234';
grant all on *.* to yhlee@'%' with grant option;
flush privileges;

use testdb;

create table university(
univ_code char(3) not null,
univ_name varchar(20) not null,
primary key(univ_code)
);

INSERT INTO university VALUES('002', '코리아대학교(서울)');
INSERT INTO university VALUES('051', '코리아대학교(부산)');

create table major(
major_id int not null auto_increment,
major_code char(3) not null,
major_name varchar(20) not null,
univ_code char(3) not null,
primary key(major_id),
foreign key(univ_code) references university(univ_code)
);

INSERT INTO major VALUES(1, '100', '철학과', '002');
INSERT INTO major VALUES(2, '200', '법학과', '002');
INSERT INTO major VALUES(3, '300', '경영학과', '002');
INSERT INTO major VALUES(4, '400', '물리학과', '002');
INSERT INTO major VALUES(5, '500', '천문학과', '002');

INSERT INTO major VALUES(6, '100', '특수교육과', '051');
INSERT INTO major VALUES(7, '200', '지리교육과', '051');
INSERT INTO major VALUES(8, '300', '중어중문학과', '051');
INSERT INTO major VALUES(9, '400', '유아교육과', '051');
INSERT INTO major VALUES(10, '500', '윤리교육과', '051');
INSERT INTO major VALUES(11, '600', '의류학과', '051');

INSERT INTO major VALUES(12, '700', '통계학과', '051');
INSERT INTO major VALUES(13, '800', '조경학과', '051');




create table students(
std_id char(3) not null,
std_name varchar(10) not null,
std_email varchar(50) not null,
std_passwd varchar(20) not null,
std_score int not null,
std_addr varchar(10),
std_regdate datetime,
major_id int not null,
primary key(std_id),
foreign key(major_id) references major(major_id)
);

INSERT INTO students VALUES('001', '홍길동', 'hong@mail.co.kr', '1234', 88, '경기도 시흥시' , '2020-03-03', 1);
INSERT INTO students VALUES('002', '김경호', 'kkh@mail.co.kr', '1111', 97, '전라북도 정읍시' , '2001-03-06', 1);

INSERT INTO students VALUES('003', '고성훈', 'gochang@mail.co.kr', '0000', 100, '경상남도 김해시' , '1988-07-01', 2);

INSERT INTO students VALUES('004', '김영주', 'kyj@mail.co.kr', '1212', 66, '경기도 포천시' , '2000-12-24', 3);
INSERT INTO students VALUES('005', '허성민', 'heo@mail.co.kr', '4444', 65, '경기도 연천군' , '2000-06-01', 3);
INSERT INTO students VALUES('006', '이은주', 'lee@mail.co.kr', '7777', 72, '경기도 성남시' , '2011-01-01', 3);

INSERT INTO students VALUES('007', '스티브 호킹', 'steve@mail.co.kr', '7474', 99, '서울특별시' , '2022-01-01', 4);

INSERT INTO students VALUES('008', '강영수', 'orbit@mail.co.kr', '8888', 99, '경기도 수원시' , '2022-01-01', 5);


INSERT INTO students VALUES('009', '김현정', 'khj@mail.co.kr', '5555', 82, '대전광역시' , '2011-11-11', 6);

INSERT INTO students VALUES('100', '김칠현', 'kim7@mail.co.kr', '6666', 83, '충청남도 공주시' , '2022-01-01', 7);
INSERT INTO students VALUES('101', '표진영', 'jyp@mail.co.kr', '1875', 88, '강원도 원주시' , '2023-11-05', 7);
INSERT INTO students VALUES('102', '박시형', 'shbang@mail.co.kr', '1977', 97, '경상북도 울진시' , '2023-01-05', 7);

INSERT INTO students VALUES('103', '곽연결', 'master@mail.co.kr', '2488', 71, '' , '2015-08-05', 8);

INSERT INTO students VALUES('104', '정선생', 'frijeong@mail.co.kr', '3333', 82, '대구광역시' , '2012-12-12', 9);
INSERT INTO students VALUES('105', '성태연', 'tjsung@mail.co.kr', '8484', 84, '광주광역시' , '2012-12-12', 9);

INSERT INTO students VALUES('106', '송태희', 'songsong@mail.co.kr', '6262', 100, '부산광역시' , '2012-12-12', 11);

INSERT INTO students VALUES('107', '남상식', 'betnam@mail.co.kr', '1212', 74, '전라북도 전주시' , '2023-10-09', 12);
INSERT INTO students VALUES('108', '박상민', 'number1@mail.co.kr', '5555', 81, '전라북도 익산시' , '2002-10-12', 12);

INSERT INTO students VALUES('109', '김무부', 'bird@mail.co.kr', '8989', 89, '부산광역시' , '2023-05-05', 13);





SELECT major.major_code as '학과코드', major.major_name as '학과명', count(students.major_id) as '학생 수' FROM major INNER JOIN students ON major.major_id = students.major_id
GROUP BY major.major_code, major.major_name;


SELECT * FROM students WHERE std_regdate >= '2000-01-01' AND std_addr != '';

SELECT COUNT(*) as '경기도에 거주하는 학생 수' FROM students WHERE std_addr LIKE '%경기도%';