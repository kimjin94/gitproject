-- 모델2 게시판
select * from tab;
select * from model2;
select * from seq;
select board_num,board_subject,board_re_ref,board_re_lev,board_re_seq from MODEL2 order by board_re_ref asc;

insert into MODEL2 values(model2_seq.nextval,'홍길동','1234',
 '모델2게시판','게시판내용','',model2_seq.nextval,0,0,0,sysdate);

create table model2(
	board_num number,
	board_name varchar2(20),
	board_pass varchar2(15),
	board_subject varchar2(50),
	board_content varchar2(2000),
	board_file varchar2(50),		-- 첨부 파일명
	board_re_ref number,			-- 글 그룹번호
	board_re_lev number,			-- 댓글 깊이: 원문(0), 1, 2...
	board_re_seq number,			-- 댓글 출력 순서: 원문(0) 오름차순 정렬
	board_readcount number,
	board_date timestamp,
	primary key(board_num)
);

create sequence model2_seq
start with 1
increment by 1
nocache;
