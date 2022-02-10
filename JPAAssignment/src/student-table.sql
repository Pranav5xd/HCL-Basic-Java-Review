DROP database IF EXISTS StudentDB;

CREATE database IF NOT EXISTS `StudentDB`;
use `StudentDB`;

CREATE TABLE `STUDENT` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(45),
  `LASTNAME` varchar(45),
  `EMAIL` varchar(45),
  PRIMARY KEY (`ID`)
) ;


INSERT INTO `STUDENT` (`FIRSTNAME`,`LASTNAME`,`EMAIL`) VALUES ('Pranav', 'Sharma', 'pranav.sharma@hcl.com');
INSERT INTO `STUDENT` (`FIRSTNAME`,`LASTNAME`,`EMAIL`) VALUES ('Kaushal', 'Sharma', 'kmpsharma@yahoo.com');
