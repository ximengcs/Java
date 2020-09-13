# 约束 
# 约束是在表上强制执行的数据效验检测，约束主要用于保证数据完整性
大部分数据库支持下面5类约束
-NOT NULL    非空约束      列级约束
-UNIQUE KEY  唯一约束      可以不插入值（多个null），但如果插入值不允许重复,主键唯一
-PRIMARY KEY 主键约束      一个表只允许一个主键,主键可以是多个联合主键
-FOREIGN KEY 外键约束      外键是构建于一个表的两个字段或者两个表的两个字段之间的关系
			   解决数据冗余的方法，通过一个字段就可以查询到其他相关信息
		   	
-CHECK       检查约束     符合条件

CREATE TABLE simon3 (
NAME VARCHAR(18) NOT NULL, #非空约束
sex INT CHECK( age > 18 AND age < 60 ),
email VARCHAR(100) UNIQUE, #,邮箱，唯一约束：如果插入值不能出现别的email和当前相同
department INT,
dept_id INT REFERENCES tb_dept(id) #部门id  引用部门表的字段  ,外键引用
			       #只能是主表（外键所引用在的表）主键或唯一约束
);  

#插入数据测试
INSERT INTO tb_emp( NAME, sex, age, address, email, dept_id )
VALUES( 'a', '男', 23 );   

#在建表后创建约束
CREATE TABLE tb_tmp(
id INT PRIMARY KEY,
NAME VARCHAR(18) NOT NULL,
#创建外键约束  foreign key 外键名 外键  references 主表 字段
CONSTRAINT FOREIGN KEY tb_employee_fk (dept_id) REFERENCES tb_dept(dept_id)
)

#添加约束
#添加主键
ALTER TABLE tb_temp
ADD PRIMARY KEY (id)
#添加外键
ALTER TABLE tb_tmp
ADD CONSTRAINT FOREIGN KEY tb_temp_fk (dept_id) REFERENCES tb_dept(id);
#添加唯一键
ALTER TABLE tb_tmp
ADD UNIQUE(emial);
#添加检查约束
ALTER TABLE 
ADD CONSTRAINT CHECK( age > 10 AND age< 20 );

#删除约束

#删除非空约束
#修改
ALTER TABLE tb_tmp
MODIFY NAME VARCHAR(18);

#删除唯一约束
ALTER TABLE tb_tmp DROP INDEX email

#删除主键约束 :存在自动增长时不能删除
ALTER TABLE tb_tmp DROP PRIMARY KEY;

#非空约束可以通过modify删除
