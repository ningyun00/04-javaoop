/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.6.31-log : Database - lessen1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lessen1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lessen1`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sID` int(11) NOT NULL AUTO_INCREMENT,
  `sName` varchar(50) NOT NULL,
  `sAge` int(11) NOT NULL,
  `sSex` varchar(2) NOT NULL,
  PRIMARY KEY (`sID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`sID`,`sName`,`sAge`,`sSex`) values (1,'寜',12,'男'),(2,'小樱',12,'男');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uID` int(11) NOT NULL AUTO_INCREMENT,
  `uName` varchar(50) NOT NULL,
  `uPassword` varchar(14) NOT NULL,
  `uMoney` float NOT NULL,
  PRIMARY KEY (`uID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uID`,`uName`,`uPassword`,`uMoney`) values (1,'小寜','1008611',200),(2,'寜','1008611',200),(3,'小寜','1008611',200.1),(4,'寜','1008611',200);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
