CREATE DATABASE IF NOT EXISTS geoserviciosbd CHARACTER SET latin1 COLLATE latin1_swedish_ci;

USE geoserviciosbd;

SET foreign_key_checks = 0;

DROP TABLE IF EXISTS lenguaje_preferencias;


SET foreign_key_checks = 1;

CREATE TABLE lenguaje_preferencias(
   	id INT(3) NOT NULL AUTO_INCREMENT,
	nombres VARCHAR(60) NOT NULL,
	apellidos VARCHAR(60) NOT NULL,
	eleccion VARCHAR(40) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=INNODB;
