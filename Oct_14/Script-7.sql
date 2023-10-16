use shop

show tables

desc bbs

desc member

insert into member values ('melon', '1234', 'melon', '010')

select * from member

select tel, name from member where id = 'apple'

insert into member values ('computer','1234','com',null)

insert into member values ('ice2','1234','ice2', '010',now())

delete from bbs

select * from bbs

insert into bbs values (null, 'db4','fun db','apple')

drop table productorder

create table productorder(
	id varchar(100) primary key,
	title varchar(100) unique,
	price int,
	buydate date,
	addr varchar(100) default 'home'
)

insert into productorder values ('melon', '과자', '1000', now(), default)

insert into productorder(id, title, price, buydate) values('ine','보라색물감','110000',now())