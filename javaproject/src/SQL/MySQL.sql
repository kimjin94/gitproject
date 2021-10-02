show databases;
show tables;
--예1.
select*from customer;
create table customer( no int(4) auto_increment primary key, 
		       		   name varchar(20),
		       		   email varchar(20),
		               tel varchar(20),  
		               address varchar(50),
		               reg_date timestamp );

--계시판

select*from board;
select  count(*) from board;
create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp );

insert into board(writer,passwd,subject,content,reg_date) 
			 values('바둑이','1234','test','test',sysdate());
			 
			 
-- 전체 데이터 검색
select*from board;
	
-- 전체 데이터를 내림차순 정렬
select*from board order by no desc;

-- 최근 글5개 검색
-- limit 추출할 인덱스번호, 추출할 데이터 갯수
select*from board order by no desc limit 0,5;
