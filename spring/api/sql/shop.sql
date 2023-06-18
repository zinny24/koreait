create database kor_shop;

use kor_shop;

create table large_category(
large_cate_code varchar(20),
large_cate_name varchar(50),
primary key(large_cate_code)
);

INSERT INTO large_category VALUES('A', '국내도서');
INSERT INTO large_category VALUES('B', '해외도서');

create table small_category(
small_cate_code varchar(20),
small_cate_name varchar(50),
large_cate_code varchar(20),
primary key(small_cate_code),
foreign key(large_cate_code) references large_category(large_cate_code) ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO small_category VALUES('100', '소설/시', 'A');
INSERT INTO small_category VALUES('200', '인문', 'A');
INSERT INTO small_category VALUES('300', '역사', 'A');

INSERT INTO small_category VALUES('400', 'BIBLE', 'B');
INSERT INTO small_category VALUES('500', 'TECHNICAL', 'B');
INSERT INTO small_category VALUES('600', 'ART', 'B');
INSERT INTO small_category VALUES('700', 'ALBUM', 'B');


SELECT * FROM large_category L INNER JOIN small_category S ON L.large_cate_code = S.large_cate_code;

SELECT L.large_cate_code, L.large_cate_name, S.small_cate_code, S.small_cate_name FROM large_category L INNER JOIN small_category S ON L.large_cate_code = S.large_cate_code;

SELECT
    L.large_cate_code, L.large_cate_name,
    count(L.large_cate_code) as large_cate_count
FROM
large_category L INNER JOIN small_category S
ON L.large_cate_code = S.large_cate_code
GROUP BY L.large_cate_name;


SELECT * FROM small_category WHERE large_cate_code = 'A';