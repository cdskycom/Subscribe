
CREATE DATABASE `subscribe` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `subscribelog` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `createdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DF` int(11) DEFAULT NULL,
  `is_send_flow` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
