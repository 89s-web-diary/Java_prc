create database prc_shop2

use prc_shop2

create table member(
	id varchar(100) primary key,
	pw varchar(100),
	name varchar(100),
	tel varchar(100)
)

create table product(
	id varchar(100) primary key,
	name varchar(100),
	content varchar(100),
	price varchar(100)
)

create table board (
	id int primary key,
	title varchar(100),
	content varchar(100),
	writer varchar(100)
)

create table orderlist (
	orderid int primary key,
	memberid varchar(100),
	productid varchar(100),
	totalprice varchar(100)
)

create table reply (
	id int primary key,
	content varchar(100),
	boardid int,
	writer varchar(100)
)

create database normal2

use normal2

create table member(
	id varchar(100) primary key,
	pw varchar(100),
	name varchar(100),
	tel varchar(100)
)

create table product (
	id int primary key,
	namee varchar(100),
	content varchar(100),
	price int,
	comp varchar(100),
	category varchar(100)
)
	id int primary key,
	namee varchar(100),
	content varchar(100),
	price int,
	comp varchar(100),
	category varchar(100)
)

create table category(
	ctg_name varchar(100) primary key
)

create table orderlist (
	orderid int primary key,
	memberid varchar(100),
	productid int,
	totalprice int
	category varchar(100)
)

create table FAQ (
	no int primary key,
	title varchar(100),
	content varchar(100),
	writer varchar(100)
)

create table reply(
	no int primary key,
	content varchar(100),
	FAQno int,
	writer varchar(100)
)

drop table product_study   