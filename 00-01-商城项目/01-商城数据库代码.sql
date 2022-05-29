CREATE DATABASE community;-- 创建商品数据库

USE community; -- 使用数据库

# 商品表
CREATE TABLE communityTable(
	CID INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 	-- 商品编号	
	CName VARCHAR(25) NOT NULL,			-- 商品名称	
	CTID INT NOT NULL,				-- 商品类型	
	CInputPrice FLOAT NOT NULL,			-- 商品录入价格	
	CTime DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,			-- 商品录入时间
	CPrice FLOAT NOT NULL,				-- 商品原价
	CCurrent FLOAT NOT NULL,			-- 商品现价	
	CRemark VARCHAR(100),				-- 商品备注	
	CONSTRAINT `fk_communityType_communityTable` FOREIGN KEY (CTID) REFERENCES `community`.`communityType`(`TID`) -- 主外键
);

# 商品类型
CREATE TABLE communityType(
	TID INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 	-- 类别编号
	TName VARCHAR(25) NOT NULL,			-- 类别名称		
	TRemark VARCHAR(100) 				-- 类别备注
);

# 员工
CREATE TABLE employee(
	EID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,  	-- 员工编号
	EAccount VARCHAR(18) NOT NULL,			-- 员工账号
	EPassword VARCHAR(18) NOT NULL,			-- 员工密码
	EOffice	INT NOT NULL,				-- 员工职务
	EWages FLOAT NOT NULL,				-- 员工工资
	EBonus FLOAT NOT NULL,				-- 员工奖金
	ETime DATE NOT NULL,  				-- 员工入职时间
	EEndTime DATE,					-- 员工离职时间
	EName	VARCHAR(25) NOT NULL,			-- 员工姓名
	ESex VARCHAR(2) NOT NULL,			-- 员工性别
	ENumber VARCHAR(18) NOT NULL,			-- 员工电话号码
	EAddress VARCHAR(100) NOT NULL,			-- 员工住址
	ERemark	VARCHAR(100),				-- 备注
	CONSTRAINT `fk_office_employee` FOREIGN KEY (`EOffice`) REFERENCES `community`.`office`(`OID`)
);

# 职务
CREATE TABLE Office(
	OID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,	-- 职务编号
	OName VARCHAR(20) NOT NULL,			-- 职务名称
	OPrice FLOAT NOT NULL,				-- 职务工资
	ORemark	VARCHAR(100)				-- 备注
);

# 管理员
CREATE TABLE administrator(
	AID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,	-- 管理员编号
	AAccount VARCHAR(8) NOT NULL,			-- 管理员账号
	APassword VARCHAR(18) NOT NULL,			-- 管理员密码
	AOffice INT NOT NULL,				-- 管理员职务
	AWages FLOAT NOT NULL,				-- 管理员工资
	ABonus	FLOAT NOT NULL,				-- 管理员奖金
	ATime DATE NOT NULL, 				-- 管理员入职时间
	AEndTime DATE ,					-- 管理员离职时间
	AName VARCHAR(25) NOT NULL,			-- 管理员姓名
	ASex VARCHAR(2) NOT NULL,			-- 管理员性别
	ANumber VARCHAR(18) NOT NULL,			-- 管理员住址
	AUser INT NOT NULL,				-- 管理员管理用户
	ARemark	VARCHAR(100),				-- 管理员备注
	CONSTRAINT `fk_administratorType_administrator` FOREIGN KEY (`AOffice`) REFERENCES `community`.`administratorType`(`ATID`),
	CONSTRAINT `fk_employee_administrator` FOREIGN KEY (`AUser`) REFERENCES `community`.`employee`(`EID`)
);

# 管理员职务
CREATE TABLE administratorType(
	ATID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,	-- 职务类别
	ATName VARCHAR(20) NOT NULL,			-- 职务名称
	ATPrice FLOAT NOT NULL,				-- 工资
	ATRemark VARCHAR(100)				-- 备注
);

# 添加商品类型
INSERT INTO `communitytype` VALUES(NULL,'饮品',NULL);
INSERT INTO `communitytype` VALUES(NULL,'面包',NULL);
INSERT INTO communitytype VALUES(NULL,'干果',NULL);
INSERT INTO communitytype VALUES(NULL,'水果',NULL);

# 添加商品
INSERT INTO `communitytable` VALUES(NULL,'小熊饼干',2,5,DEFAULT,5,5,NULL);
INSERT INTO `communitytable` VALUES(NULL,'草莓',4,5,DEFAULT,5,5,NULL);
INSERT INTO `communitytable` VALUES(NULL,'草莓干',3,5,DEFAULT,5,5,NULL);
INSERT INTO `communitytable` VALUES(NULL,'旺仔牛奶',1,3,DEFAULT,3,3,NULL);