DROP database IF EXISTS EmployeeDB;

CREATE database IF NOT EXISTS `EmployeeDB`;
use `EmployeeDB`;

CREATE TABLE `EMPLOYEE` (
  `EMPID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPNAME` varchar(45),
  `DOB` DATE,
  `SALARY` int(11),
  `AGE` int(11),
  PRIMARY KEY (`EMPID`)
) ;


CREATE TABLE `USERS` (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(45),
  `PASSWORD` varchar(45),
  PRIMARY KEY (`UID`)
) ;

INSERT INTO `EMPLOYEE` (`EMPNAME`,`DOB`,`SALARY`, `AGE`) VALUES ('John Doe', '1969-06-09', 2000, 20);
INSERT INTO `EMPLOYEE` (`EMPNAME`,`DOB`,`SALARY`, `AGE`) VALUES ('Jane Doe','2000-08-08', 40000, 30);
INSERT INTO `EMPLOYEE` (`EMPNAME`,`DOB`,`SALARY`, `AGE`) VALUES ('Bob Ross','1956-12-12', 400, 35);
INSERT INTO `EMPLOYEE` (`EMPNAME`,`DOB`,`SALARY`, `AGE`) VALUES ('Blake Martin','1999-02-07', 90000, 19);
INSERT INTO `USERS` (`USERNAME`,`PASSWORD`) VALUES ('Pranav','abc');

SELECT * FROM USERS WHERE UID>0;
