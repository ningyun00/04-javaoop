/*在 scott 库下新建表 Student,有以下五个字段:
编号(id)、姓名(name)、年龄(age)、姓别(sex)、资金(money). 编号为主键自动增长*/
CREATE DATABASE scott;

USE scott;

CREATE TABLE Student(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 	NAME VARCHAR(50) NOT NULL,
	age INT NOT NULL,
	sex VARCHAR(2) NOT NULL,
	money FLOAT NOT NULL
)

INSERT INTO Student VALUES(NULL,'小明',19,'男',1000);

SELECT * FROM Student;

DELETE FROM Student WHERE id = 6;

UPDATE Student SET money = money + 1000 WHERE NAME = '张三'; 

UPDATE Student SET money = money - 1000 WHERE NAME = '李四'; 

SELECT * FROM Student WHERE id LIKE '1%'