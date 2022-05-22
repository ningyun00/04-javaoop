CREATE DATABASE commodity;

USE commodity;

CREATE TABLE products(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- 编号
	NAME VARCHAR(50) NOT NULL, -- 商品名称
	price INT NOT NULL, -- 商品价格
	remark VARCHAR(100)  -- 备注
)

SELECT * FROM products;

INSERT INTO products VALUES(NULL,'面包',3,'无');

DELETE FROM products WHERE id = 1;

UPDATE products SET NAME = '牛奶',price = 5,remark = '无' WHERE id = 3;

SELECT * FROM products WHERE id = 3;

SELECT * FROM products WHERE NAME LIKE '鸡%';