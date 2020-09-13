#子查询
条件是另一个 SELECT 语句
SELECT *
FROM TB
WHERE age > ( SELECT ... )



#in : 与列表任意值相等
WHERE age IN ( SELECT ... )
#any : 与子查询的每一个值进行比较
WHERE sal < ANY(
SELECT ...
)