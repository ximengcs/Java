#多表链接查询

SELECT ...
FROM join_table           	join_table 表示参与链接的表
join_type join_table		join_type表示链接的类型:内连接，外链接，交叉连接，自连接
ON join_condition		join_condition表示链接的条件
WHERE where_condition 		#where_condition表示内容的条件

#交叉链接
SELECT * 
FROM tb, tb2;    // 返回两张表的乘积
标准语法
SELECT * 
FROM tb1 CROSS JOIN tb2;  // 同上

#内连接
SELECT *
FROM tb1 t1, tb2 t2
WHERE 条件(t1.name = t2.name)      // 返回符合条件的
标准写法
SELECT *
FROM tb INSERT JOIN tb2
ON tb1.name = tb2.name            //作用同上

#外链接
不仅列出与链接条件相符的行，还列出左表（左外链接),右表（右外链接)或两个表（全外链接)
中所有符合where过滤条件的数据行

1.左外链接
左边的表当做主表，左表的内容会全部显示，没有内容会补 NULL
SELECT *
FROM tb LEFT JOIN tb2
ON tb.name = tb2.name

2.右外链接  RIGHT
3.全外链接 FULL

4.自连接
参与链接的表是一张表
SELECT t1.name '类别名', t2.name '父类别名'
FROM tb1 t1 LEFT JOIN tb2 t2
ON t1.pid = t2.pid;