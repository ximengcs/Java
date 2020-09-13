CREATE TABLE tb_dept2(
dept_id INT PRIMARY KEY AUTO_INCREMENT,#自动增长
dept_name VARCHAR(18),
description VARCHAR(200)
);

CREATE TABLE tb_emp(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
sex VARCHAR(2),
age INT,
address VARCHAR(200),
email VARCHAR(100)
)

#drop语句删除表,注意：删除时会将表结构和数据完全删除
DROP TABLE tb_emp;

#修改列类型
#alter table 表名 modify 列名 列类型;
#注意：不是任何情况都可以修改
ALTER TABLE tb_dept MODIFY NAME VARCHAR(18);

#增加列
ALTER TABLE 表名 ADD 列名 列类型;
ALTER TABLE tb_dept ADD mobile VARCHAR(18);

#删除列 
ALTER TABLE 表名 DROP 列名 #mysql写法
ALTER TABLE 表名 DROP COLUMN 列名  #oracle

#列改名 
ALTER TABLE 表名 CHANGE 旧列名 新列名 列类型
ALTER TABLE tb_dept CHANGE NAME emp_name VARCHAR(18);

#更改表名:两种方式
1.
ALTER TABLE 表名 RENAME 新表名;
ALTER TABLE tb_dept RENAME simon;
2.
RENAME TABLE 旧表名 TO 新表名