#创建一个部门表ta_dept
#部门编号id 整型
#primary key主键
#auto_increment 自动增长
#部门名称name 字符最多存储18个字符
#描述description 字符最多存储100个字符

CREATE TABLE tb_dept (
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
description VARCHAR(100)
);

#显示数据库中的表
#SHOW DATABASES

#查询表信息
#desc tb_dept;

SHOW CREATE TABLE tb_dept\G;