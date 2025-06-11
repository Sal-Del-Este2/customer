<H1>Base de datos</H1>

1) Crear base de datos en MySql

CREATE DATABASE `ecommerce`;
USE `ecommerce`;

2) tabla creada:
CREATE TABLE `ecommerce`.`customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NULL,
  `lastname` VARCHAR(255) NULL,
  `email` VARCHAR(255) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

3) crear el primer valor
INSERT INTO customer (username, password, name, lastname, email)
VALUES
('jazocar', 'abcd1234', 'Juan', 'Azocar', 'ju.azocar@profesor.duoc.cl');

4) validar
Select * from customer;


<H1>crear los 3 micros servicios</H1>

en Spring Initializr, esta pagina https://start.spring.io/ se creo lo siguiente
Project: Gradle-Groovy
Lenguaje: Java
Spring Boot: 3.5.0
Packaging: Jar
Java:17
dependencias: Spring Web, Lombok, Spring data jpa, Mysql driver

Project Metadata:
Group: cl.duoc
Artifact: ms-customer-db
Name: ms-customer-db
Description: Demo Project for Spring Boot
Package name: cl.duoc.ms-customer-db

Project Metadata:
Group: cl.duoc
Artifact: ms-customer-bs
Name: ms-customer-bs
Description: Demo Project for Spring Boot
Package name: cl.duoc.ms-customer-bs

Project Metadata:
Group: cl.duoc
Artifact: ms-customer-bff
Name: ms-customer-bff
Description: Demo Project for Spring Boot
Package name: cl.duoc.ms-customer-bff
