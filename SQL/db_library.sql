CREATE DATABASE  IF NOT EXISTS `library`;
USE `library`;

DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `stats` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(45) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `role_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
   KEY `FK_ROLE_idx` (`role_id`),
   CONSTRAINT `FK_ROLE` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `roles_permission`;
CREATE TABLE `roles_permission` (
  `roles_id` varchar(45) NOT NULL,
  `permission_id` varchar(45) NOT NULL,
  
  PRIMARY KEY (`roles_id`,`permission_id`),
  KEY `FK_ROLES_idx` (`roles_id`),
  
  CONSTRAINT `FK_PERMISSION_02` FOREIGN KEY (`permission_id`) 
  REFERENCES `permission` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_ROLES` FOREIGN KEY (`roles_id`) 
  REFERENCES `roles` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;