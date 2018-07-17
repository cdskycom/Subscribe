CREATE TABLE `county` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 NOT NULL,
  `leader_id` int(11) DEFAULT NULL,
  `type` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;


/*备份subscribelog*/
 CREATE TABLE `subscribelog20180717` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `createdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DF` int(11) DEFAULT NULL,
  `is_send_flow` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=299 DEFAULT CHARSET=utf8

insert into subscribelog20180717 select * from subscribelog;


ALTER TABLE `subscribelog` 
ADD COLUMN `county_id` INT(11) NULL AFTER `is_send_flow`,
ADD COLUMN `county_name` VARCHAR(100) NULL AFTER `county_id`,
ADD INDEX `county_id_idx` (`county_id` ASC);

ALTER TABLE `subscribelog` 
ADD CONSTRAINT `county_id`
  FOREIGN KEY (`county_id`)
  REFERENCES `county` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
