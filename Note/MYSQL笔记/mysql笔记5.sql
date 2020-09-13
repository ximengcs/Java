#select 算数表达式
SELECT ename, salary, salary*12
FROM tb;

/*使用distinct关键字可以从查询结果中清楚重复行
*/
SELECT DISTINCT deptno, job
FROM tb;

#运算符
BETWEEN ... AND ... 在两个值之间(包含)
eg.where salary BETWEEN 1500 AND 3000

 IN 运算符
eg. WHERE salary IN ( 1500, 1300, 1200 );工资为这三个的
NOT IN 运算符
和 IN 相反

LIKE 模糊查询
eg.
SELECT *
FROM tb
WHERE aname LIKE '_密'; _代表一个  %代表0个或多个

IS NULL 运算符
eg.
WHERE mar IS NULL;

IS NOT NULL 运算符
IS NULL 相反

AND OR NOT 运算符
eg.
WHERE sal > 1000 AND job = '文员'; #and  两个条件都要满足
WHERE sal > 1000 OR job = '文员';  #or 两个条件满足一个
WHERE job NOT IN #not取反


#查询结果是按插入顺序排列的
ORDER BY 排序

eg.
SELECT  *
FROM tb
ORDER BY sal DESC;  // 以薪水从高到低排序
ORDER BY sal;       // 默认从低到高, 也可以加asc