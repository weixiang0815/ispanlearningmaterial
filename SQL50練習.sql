use SQL50;

-- 1.
select top(10) * from student;

-- 2.
select min(score) as [最低分], avg(score) as [平均], sum(score) as [總分] from sc;

-- 3.
select count(cno) as [課程數量] from course as c join teacher as t on c.tno = t.tno and t.tname = '諶燕';

-- 4. 非正解
select tno, count(cno) as [課程數量] from course group by tno;

-- 5.
select * from student where sname like '張%';

-- 6.
select sno as [學號], score [分數] from sc join course as c on sc.cno = c.cno and sc.score < 60 and c.cname = 'Oracle';

-- 7. 題意不明


-- 8. 一定有更好的解答
select s.sname as [學生姓名], c.cname as [課程名稱], sc.score as [分數] from sc join student as s on sc.sno = s.sno join course as c on sc.cno = c.cno and sc.score >= 70;

-- 9.
select sc.sno as [學號], c.cno as [課號], c.cname as [課程名稱], sc.score as [分數] from sc join course as c on sc.cno = c.cno and sc.score < 60 order by sc.cno desc;

-- 10. 沒答出來，要看正解
select s.sno as [學號], s.sname as [學生姓名] from student as s right join course as c join teacher as t on c.tno = t.tno and t.tname = '諶燕' and c.sno = null;