use normal

CREATE TABLE normal.totalstudent (
	학생번호 varchar(100) NULL,
	학생이름 varchar(100) NULL,
	주소 varchar(100) NULL,
	학과 varchar(100) NULL,
	학과사무실 varchar(100) NULL,
	강좌이름 varchar(100) NULL,
	강의실 varchar(100) NULL,
	성적 varchar(100) NULL
)

insert into totalstudent values ('601', '손흥민', '토트넘' ,'컴퓨터과', null, null, null, null)

insert into totalstudent values ('701', '조규성', '토트넘2' ,'체육학과', null, null, null, null)

insert into totalstudent values ('501', '박지성', '맨체스타' ,'컴퓨터과', '공학관101', '데이터베이스', '공학관110', '3.5')

update totalstudent set 주소 = '서울' where 학생이름 = '박지성' and 강좌이름 = '자료구조'

-- 수정을 하고 나서 데이터에 이상한 현상(이상현상) 불일치현상이 발생하면 정규화를 해야한다.(수정이상)

delete from totalstudent where 학생이름 = '김연아'	-- 데이터베이스 강좌 수강취소

select * from totalstudent

-- 지우려고 했던 데이터가 아닌 것까지 연쇄적으로 지워지면 ==> 이상현상(삭제이상) ==> 정규화 필요

create table 학생 (
	학생번호 int,
	학생이름 varchar(100),
	주소 varchar(100),
	학과 varchar(100)
)

insert into 학생 values (502, '추신수', '미국 클리블랜드', '컴퓨터과');
insert into 학생 values (501, '박지성', '영국 맨체스터', '컴퓨터과');
insert into 학생 values (402, '장미란', '대한민국 강원도', '체육학과');
insert into 학생 values (401, '김연아', '대한민국 서울', '체육학과');

create table 학과정보(
	학과 varchar(100),
	학과사무실 varchar(100)
)

insert into 학과정보 values ('컴퓨터과', '공학관101');
insert into 학과정보 values ('체육학과', '체육관101')

create table 강좌정보(
	강좌이름 varchar(100),
	강의실 varchar(100)
)

insert into 강좌정보 values ('데이터베이스', '공학관110');
insert into 강좌정보 values ('스포츠경영학', '체육관103');
insert into 강좌정보 values ('자료구조', '공학관111');

create table 성적정보(
	학생번호 int,
	강좌이름 varchar(100),
	성적 varchar(100)
)

insert into 성적정보 values (501, '데이터베이스', '3.5');
insert into 성적정보 values (401, '데이터베이스', '4.0');
insert into 성적정보 values (402, '스포츠경영학', '3.5');
insert into 성적정보 values (502, '자료구조', '4.0');
insert into 성적정보 values (501, '자료구조', '3.5');

use normal

insert into 학생 values (601, '손흥민', '토트넘', '체육학과')

update 학생 set 주소 = '서울' where 학생이름 = '박지성'

delete from 성적정보 where 학생번호 = 401

select * from 성적정보

-- -----------검색--------------

show tables
 
select * from 학생;
select * from 학과정보;
select count(학과) as 전체학과개수 from 학과정보;

-- 학생의 번호, 이름, 학과, 학과사무실위치

select s.학생번호, s.학생이름, s.학과, c.학과사무실
from 학생 s inner join 학과정보 c
where s.학과 = c.학과

-- 학생의 번호, 이름, 강좌이름, 성적 (학생 + 강좌정보)
select s.학생번호, s.학생이름, g.성적 
from 성적정보 g inner join 학생 s
where g.학생번호 = s.학생번호 

-- 학생의 번호, 강좌명, 강의실, 성적(성적정보 + 강좌정보)
select g.학생번호, g.강좌이름 , c.강의실 , g.성적 
from 성적정보 g, 강좌정보 c
where g.강좌이름 = c.강좌이름 

-- 3개 조인할 떄 사용법

select s.학생번호, s.학생이름 ,c.강좌이름, g.성적 
from 학생 s
inner join 성적정보 g on s.학생번호 = g.학생번호 
inner join 강좌정보 c on g.강좌이름 = c.강좌이름 

select *
from 학생 s
left join 성적정보 g
on s.학생번호 = g.학생번호 

-- Subquery
select * from 학생
where 학생번호 in (select 학생번호 from 성적정보 j where j.학생번호 = '501')

-- 자료구조 들은 학생들의 이름과 학과를 프린트

select 학생.학생이름, 학생.학과 from 학생 where 학생번호 in (select 학생번호 from 성적정보 where 강좌이름 = '자료구조')

-- 강의실이 공학관 110인 강좌이름을 이용하여 수업을 듣는 학샏의 번호와 성적 프린트

select 성적정보.학생번호, 성적정보.성적 from 성적정보 where 강좌이름 in (select 강좌이름 from 강좌정보 where 강의실 = '공학관110')