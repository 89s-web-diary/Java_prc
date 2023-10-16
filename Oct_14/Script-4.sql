-- 주석
-- shop, shop2, sys
-- db > table > 항목(field, item, property attribute)
-- shop을 선택 후 sql을 클릭한 경우, shop 내부에서 실행된다는 것
-- create table a ==> shop db에 만들어짐.

-- 다른 db를 사용하고 싶은 경우
-- use shop2 를 이용해 사용환경 설정
-- create table b ==> shop2 db에 생성

-- DCL : create(생성) / alter(수정) / drop(삭제)

create user 'summer'@'localhost' identified by '1234'

grant all privileges		-- 어떤 권한을 줄 것이냐
on *.*						-- 어떤 db에 권한을 줄 것이냐 (db).(table)
to 'summer'@'localhost'		-- 어떤 계정에 권한을 줄 것이냐7

create user 'apple'@'localhost' identified by '1234'

grant all privileges
on *.*
to 'apple'@'localhost'

use shop3

show tables		-- db 내부의 table을 보여준다

CREATE TABLE `member4` (
  `id` varchar(100) DEFAULT NULL,
  `pw` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT null,
  addr varchar(200)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


