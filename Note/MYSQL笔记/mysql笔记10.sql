#数据库视图

创建一个视图
CREATE VIEW emp_v_10 AS 
SELECT emp AS 部门编号, ename 员工姓名, sal 工资
FROM tb
WHERE deptno = 10;

SELECT * FROM emp;

删除
DROP VIEW ...