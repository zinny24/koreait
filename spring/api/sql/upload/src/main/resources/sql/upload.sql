use koreaitdb;


create table uploads(
    imageName varchar(255), -- 원본 이름
    imageSize bigint, -- 용량
    imageUrl varchar(500), -- 경로
    imageTransName varchar(255) -- 변환한 이름
);