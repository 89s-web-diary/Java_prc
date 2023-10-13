create database movie

use movie

create table place(
	id varchar(100),
	name varchar(100),
	addr varchar(100),
	tel varchar(100)
)

insert into place values ('p1', 'cgv', '강남구 삼성동', '02-555');
insert into place values ('p2', 'megabox', '강남구 역삼동', '02-666');
insert into place values ('p3', 'lotte', '강남구 대치동', '02-777');

select * from place 

select name from place

update place set tel='02-888' where name='lotte'

delete from place where id = 'p3'