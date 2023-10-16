create database prc

use prc

create table depart2(
	id varchar(100) primary key,
	name varchar(100),
	instructor varchar(100)
)

create table student2(
	id varchar(100) primary key,
	name varchar(100),
	tel varchar(100),
	depart_id varchar(100)
)

alter table prc.student2
add constraint student2_fk
foreign key (depart_id)
references depart2 (id)

desc depart2 

drop table student2

show tables