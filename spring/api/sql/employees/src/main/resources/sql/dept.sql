use tb_koreait;

--부서(대분류) : dept
create table kor_dept(
kor_dept_code char(3) not null, -- 100, 200, 300, 900
kor_dept_name varchar(20) not null, -- 인사과, 비서실, 영업부, 임원실...
primary key(kor_dept_code)
);

INSERT INTO kor_dept VALUES('100', '인사과');
INSERT INTO kor_dept VALUES('200', '비서실');
INSERT INTO kor_dept VALUES('300', '영업부');
INSERT INTO kor_dept VALUES('900', '임원실');

--직책(소분류) : pos
CREATE TABLE kor_pos(
kor_pos_code char(3) not null,
kor_pos_name varchar(20) not null,
kor_dept_code char(3),
primary key(kor_pos_code),
foreign key(kor_dept_code) references kor_dept(kor_dept_code)
ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO kor_pos VALUES('101', '인사부장', '100');
INSERT INTO kor_pos VALUES('102', '인사과장', '100');
INSERT INTO kor_pos VALUES('103', '사원', '100');

INSERT INTO kor_pos VALUES('201', '비서실장', '200');
INSERT INTO kor_pos VALUES('202', '담당관', '200');
INSERT INTO kor_pos VALUES('203', '사원', '200');

INSERT INTO kor_pos VALUES('301', '영업부장', '300');
INSERT INTO kor_pos VALUES('302', '지점장', '300');
INSERT INTO kor_pos VALUES('303 ', '영업과장', '300');

INSERT INTO kor_pos VALUES('901 ', '대표이사', '900');
INSERT INTO kor_pos VALUES('902 ', '총괄이사', '900');


SELECT D.kor_dept_name, P.kor_pos_name FROM
kor_dept D INNER JOIN kor_pos P ON
D.kor_dept_code = P.kor_dept_code;

SELECT * FROM 부모 INNER JOIN 자식 ON 부모 = 자식;


-- group by
-- 부모 inner join 자식 on 부모.ID = 자식.ID
SELECT D.kor_dept_code, D.kor_dept_name, COUNT(P.kor_dept_code) as kor_pos_cnt
FROM kor_dept D INNER JOIN kor_pos P ON
D.kor_dept_code = P.kor_dept_code
group by D.kor_dept_code, D.kor_dept_name;





