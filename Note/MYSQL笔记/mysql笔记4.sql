#插入数据
#1.指明字段进行插入
INSERT INTO tablename( NAME, loc, description ) VALUES( '开发部', '广州', '负责软件开发' );
#数量和类型必须匹配

#2.如果插入的values是所有字段，可以不用显式写插入的列名,不会影响自动增长
INSERT INTO tablename VALUES( 2, '开发部', '广州', '负责软件开发' );

#测试 auto_increment会记住曾经插入的值

#3.插入多条记录
INSERT INTO tablename( NAME, loc, description ) 
VALUES( 3, '开部', '广州', '负责软件开发' ),
VALUES( 4, 's', 'ds', 'dsf' );

#4.可以从一张表中插入数据
#将查询的数据创建为一张表
CREATE TABLE tb_dept2
SELECT * FROM tb WHERE id = 99

INSERT INTO td( id, nam, loc, description )
SELECT id,NAME,loc,description FROM tb

INSERT INTO tb( NAME,age,address)
VALUES( 'mary', 26, 'gz' );

#更新
UPDATE tb_tmp SET age = 23, ...(WHERE id = );

#删除,不用指定列名，因为删除的是一行
DELETE 
FROM tablename
WHILE 条件

#truncate table tablename  完全清空一个表DDL
TRUNCATE TABLE tablename;

#数据库机制，auto_commit，值为true或false
#查询mysql自动提交设置（1自动提交0手动)
SELECT @@autocommit;

#delete 删除数据，保留表结构，可以回滚,回滚是因为备份了数据
#truncate 删除所有数据，不可以回滚，速度较快
#drop 删除数据和表结构(直接从内存抹去这一块数据)

#修改提交方式
SET sutocommit = 0;