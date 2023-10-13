create database bookstore

use bookstore

create table member (
	id varchar(100),
	pw varchar(100),
	name varchar(100)
)

create table book (
	title varchar(100),
	author varchar(100),
	inventory int,
	price int
)

select * from book

select * from member

insert into member values ('root1', '1111', 'kang')

insert into member values ('root2', '2222', 'yun')

insert into member values ('root3', '3333', 'lee')

insert into book values ('The Old Man and The Sea', 'Hemingway', 2,7200)

insert into book values ('일반기계기사 필기', '한국산업인력공단', 0,49500)

insert into book values ('해커스토익', '해커스', 10, 20000)

select id from member where name = 'kang'

select inventory, price from book where title = '해커스토익'

delete from member where id='root1'

update book set inventory = '5' where title = '일반기계기사 필기'