CREATE TABLE `county` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 NOT NULL,
  `leader_id` int(11) DEFAULT NULL,
  `type` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

ALTER TABLE `subscribenew`.`subscribelog` 
ADD COLUMN `county_id` INT(11) NULL AFTER `is_send_flow`,
ADD COLUMN `county_name` VARCHAR(100) NULL AFTER `county_id`,
ADD INDEX `county_id_idx` (`county_id` ASC);
ALTER TABLE `subscribenew`.`subscribelog` 
ADD CONSTRAINT `county_id`
  FOREIGN KEY (`county_id`)
  REFERENCES `subscribenew`.`county` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;