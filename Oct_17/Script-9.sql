-- join 확인문제 --

use prc_shop

select *
from `member` m, bbs b 
where b.writer = m.id 

select *
from `member` m
left outer join bbs b 
on b.writer = m.id 

select *
from `member` m
right outer join bbs b 
on b.writer = m.id 
