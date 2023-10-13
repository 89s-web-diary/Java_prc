create database product3

use product3

create table member (
	id varchar(100),
	name varchar(100),
	content varchar(100),
	price int,
	company varchar(100),
	img varchar(100)
)

insert into member values ('100','shoes1','fun shoese1',1000,'c100','1.png')

insert into member values ('101','shoes2','fun shoese2',2000,'c200','2.png')

insert into member values ('102','shoes3','fun shoese3',3000,'c300','3.png')

insert into member values ('103','shoes4','fun shoese4',4000,'c400','4.png')

select * from member 

select name,content from member where id = '100'

select price from member where id = '102'

update member set price = 5000 where name = 'shoes1'

update member set company = 'c555' where name = 'shoes2'

update member set name = 'fun', price = 9999 where id = '103'

delete from member where id = '101'

delete from member where price = '3000' or img = '4.png'

delete from member
