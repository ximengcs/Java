#concat(str1, str2, str3...)连接字符串
SELECT CONCAT( salary, address )
FROM tb;

#lower(str) 转换为小写
#upper(str) 转换为大写
#length(str)  返回字符串长度
#substring( str, start, end ) 返回子串,从1开始


#数值函数 mod.....

#日期函数
SELECT NOW()  返回当前日期时间


#流程控制
eg.
CASE 
WHEN 字段 (IS NULL) THEN 100   当字段。。。时返回100
ELSE 200			否则返回200
END

IFNULL( exp1, exp2 )  如果第一个表达式不为空，则返回第一个，否则返回第二个表达式的值
eg.
SELECT comm, IFNULL(comm, 100)
FROM tb;

IF( exp1, exp2, exp3 ) 如果第一个表达式如果不为空，则取第二个值，否则取第三个值


#其他函数
DATABASE() 返回当前数据库名
VERSION()  返回当前数据库版本
USER()     返回当前登录用户名