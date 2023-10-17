create database company

use company

CREATE TABLE DEPT
(
  DEPTNO  int,
  DNAME   VARCHAR(100),
  LOC     VARCHAR(100)
)

CREATE TABLE SALGRADE
(
  GRADE  int,
  LOSAL  int,
  HISAL  int
)

CREATE TABLE EMP
(
  EMPNO     int,
  ENAME     VARCHAR(100),
  JOB       VARCHAR(100),
  MGR       int,
  HIREDATE  DATE,
  SAL       decimal(7,2),
  COMM      decimal(7,2),
  DEPTNO    int
)

select * from emp

desc emp

-- 파일이 저장되는 위치를 알고 싶으면 alt + enter 

select empno from emp;
select deptno from emp where deptno = 10

select distinct deptno from emp -- distinct는 중복 제거해서 찾아줌

-- sql은 대소문자를 구분하지 않음 ( 헐렁한 문자 ) DEPTNO = deptno = dEpTnO 다 똑같음
-- 내부적으로 처리할 때 모두 대문자로 변경해서 실행되기 때문!
-- oracle에서는 대문자로 변경해서 실행 --> 버그 발생하는 경우가 있음
-- oracle에서는 모두 대문자로 쓰는 것 권장

select ename, sal*12 as 'yearsal' from emp

select * from emp order by sal;			-- 큰-->작 정렬(오름차순)
select * from emp order by sal desc;	-- 큰-->작 정렬(내림차순)

select * from emp
where job = 'MANAGER'	-- 뭐 대충 검색조건 따옴표 안에 쓰는건 작성한대로 맞추라는데 되니까 그냥 대소문자 구분 안하고 쓸 예정
order by sal			-- order by(정렬)은 맨 마지막에

select * from emp e where deptno = 30 and job = 'salesman'	-- 조건 모두 만족
select * from emp e where deptno = 30 or job = 'salesman';	-- 조건 둘 중 하나만 만족

select * from emp where sal >= 3000;
select * from emp e where sal != 3000;

select distinct job from emp;	-- 중복 제거하면 원하는 columm의 종류를 알 수 있음

select * from emp e where job = 'clerk' or job = 'salesman' or job = 'manager';		-- or 이용해서 검색
select * from emp e where job in ('clerk','salesman','manager');					-- in 이용해서 검색(괄호 안의 조건에 해당하는 모든 내용 검색)
select * from emp where job not in ('clerk','salesman','manager');					-- 괄호안에 해당하지 않은 정보 검색

select * from emp e where sal between 2000 and 3000;								-- 사잇값 검색 between A and B

select * from emp e where ename like '%k%';
-- like를 쓰면 값 내부에 있는지 판단해서 검색
-- _(언더바)는 한 글자 %(퍼센트)는 0~무한대 글자
-- %k%는 앞 0글자부터 마지막글자까지 K가 포함된 것을 찾아준다

select * from emp e where comm is null		-- null 값을 검색할 때는 = 이 아닌 is나 is not 으로 검색해야 함

CREATE TABLE `product3` (
  `id` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------  확인문제 -----------------
select * from product3 p order by price desc;									-- price로 내림차순 정렬하여 전체컬럼 검색
select name, content, price from product3 p order by company;					-- company로 오름차순 정렬하여 제품의 이름, 내용, 가격 검색
select distinct company from product3;											-- company의 목록을 검색(중복제거)
select price*5 as 'price5' from product3 p;										-- 각 신발을 5개씩 주문했을 때의 가격을 price5라고 항목명을 지정하여 출력
select name, company from product3 p where price = 5000;						-- price가 5000인 제품명과 회사명
select name, price, company from product3 p where price between 3000 and 6000;	-- price가 3000와 6000사이인 제품명과 가격, 회사명 검색
select company, name from product3 p where company != 'c100';					-- 회사명이 c100이 아닌 회사명과 제품명
select name, price from product3 p where company = 'c100' or 'c200';			-- 회사명이 c100, c200인 제품명과 가격
select * from product3 p where name like '%4';									-- 제품명에 4로 끝나는 제품의 전체 정보 검색
select * from product3 p where name like '%food%';								-- 제품내용에 food를 포함하는 제품의 전체 정보 검색
update product3 set content = '품절' where price = 5000;							-- price가 5000원인 제품의 content를 품절로 수정
update product3 set img = 'o.png', price = 10000 where id='100' or id='102';	-- id가 100, 102번 제품의 img를 o.png로, price를 10000으로 수정
delete from product3 where company = 'c100';									-- 회사명이 c100인 경우 모든 정보 삭제
delete from product3;															-- 테이블의 모든 정보 삭제

select * from product3 p 

select now(), year(now()) as '년',
month(now()) as '월',
day (now()) as '일',
hour(now()) as '시',
minute(now()) as '분'

update emp set comm = 0 where comm is null;
update emp set comm = null where comm = 0;

-- ------------ 함수 -------------------

select * from emp

select sal , comm, sal+comm as 'sum' from emp order by sum

update emp set ename = null where empno = 7499;
update emp set ename = '' where ename is null;

select concat(ename, job) from emp;

-- ----------  함수 확인문제 -----------------;

select length(ename) from emp;
select length(ename) from emp where job = 'manager';
select ename, job from emp where comm is null;
select HIREDATE from emp where comm is not null;
select substr(ename,2) from emp;
select substr(job,1,3) from emp;
select replace(ename, 'K', 'P') from emp;
select concat(empno,'번은 ',ename,'입니다') from emp;
select month(hiredate), dayname(hiredate) from emp;
select empno,ename, job,
	case job
		when 'manager' then 'level1'
		when 'salesman' then 'level2'
		else 'level3'
	end as LEVEL_RESULT
from emp

select count(sal), sum(sal), avg(sal), min(sal), max(sal) from emp where job='salesman';		-- count / sum / avg / min / max 함수
select job, count(sal), sum(sal), round(avg(sal)), min(sal), max(sal) from emp group by job;	-- group by 사용해서 그룹으로 정렬

select job, count(sal), sum(sal), round(avg(sal)), min(sal), max(sal)	-- 검색하고 싶은 내용
from emp																-- 어느 테이블에서?
group by job															-- 그룹으로 만들고
having count(sal)>=4													-- 만들어진 그룹에 조건부여
order by job desc;														-- 조건으로 만족된 값을 마무리로 정렬까지

-- ------------------집계/그룹함수 정리 문제 -----------------------
select count(*) from emp;
select count(*) from emp where DEPTNO =  20 or MGR <= 7700;
select min(sal) from emp where DEPTNO = 10 or DEPTNO =20;
select max(sal), min(sal), sum(sal) from emp;
select DEPTNO, round(avg(sal)) from emp group by DEPTNO;
select DEPTNO, sum(sal) from emp group by DEPTNO order by DEPTNO;
select DEPTNO, round(avg(sal)) from emp group by DEPTNO having avg(sal)>=2000 order by DEPTNO desc;
select count(DEPTNO),round(avg(sal)) from emp where job = 'manager';
select count(DEPTNO) from emp where ENAME like '%S%';
select count(*) as '직원수' from emp where sal>=3000 and comm is not null order by sal desc;
-- select의 결과는 무조건 table로 나옴

-- join : 2개 이상의 테이블을 합해서 검색함.
-- join의 조건 : 하나 이상의 동일한 값의 범위를 가지는 컬럼이 양쪽 테이블에 있어야 함
-- emp : deptno, dept : deptno

select d.DEPTNO, d.DNAME, e.ENAME, e.JOB
from dept d, emp e
where d.DEPTNO = e.DEPTNO  -- 기준 ==> where

-- select 테이블1.컬럼, 테이블2.컬럼 : 원하는 컬럼만 선택해서 검색

select d.DEPTNO, d.DNAME, e.ENAME, e.JOB
from dept d
left outer join emp e 
on (d.DEPTNO = e.DEPTNO)

select d.DEPTNO, d.DNAME, e.ENAME, e.JOB
from dept d
right outer join emp e 
on (d.DEPTNO = e.DEPTNO)

-- left/right outer join은 프로젝트하면서 한명이 쓸까 말까한 join
-- 거의 inner join만 쓴다고 보면 될 듯

select e.EMPNO, e.ENAME, e2.ENAME, e2.SAL
from emp e, emp e2
where e.MGR = e2.EMPNO 
order by e.MGR 
