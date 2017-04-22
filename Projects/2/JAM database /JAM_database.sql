/**
  * Jill Oestreicher
*/
create database JAM_database;

use database JAM_database;

CREATE TABLE JAM_hardware_table (
  item varchar(255),
  quantity INT,
  price DOUBLE,
  total DOUBLE,
  location varchar(255)
);

CREATE TABLE JAM_software_table (
  item varchar(255),
  quantity INT,
  price DOUBLE,
  total DOUBLE,
  location varchar(255)
);



