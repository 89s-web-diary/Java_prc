-- 설명/comments

-- 1. db 생성 : Ctrl + Enter (실행)

create database shop2

use shop2 -- shop2 db선택

-- 2. table 생성 : 항목 명 결정

create table member (
	id varchar(100),
	pw varchar(100),
	name varchar(100),
	tel varchar(100)
)

-- 여기까지는 데이터를 어떤 것을 저장할지 정의하는 문법
-- Data Definition Language(DDL)
-- 이 아래부터는 데이터를 조작하는 문법
-- Data Manipulation Language(DML)

-- 3. data 넣어보고 수정/검색/삭제
-- varchar == String

insert into member values ('100','100','park','011')

insert into member values ('200','200','park','011')

insert into member values ('300','300','park','011')

insert into member values ('400','400','park','011')

select * from member

update member set tel = '000'

update member set tel = '999' where id = '200'

update member set name = 'hong' where id = '200'

-- 조건에서 and, or

delete from member where id = '100'

delete from member where id = '200' and tel = '999'

select * from member