/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ivan
 * Created: 10/11/2017
 */

create table cliente(
clientei integer primary key,
nombre varchar(49));

create table tarjeta(
tarjetai integer primary key,
tipo varchar(20),
saldo integer,
fechavenc date,
clientei integer,
FOREIGN KEY (clientei) REFERENCES cliente(clientei));

select * from cliente;
select * from tarjeta;

drop table tarjeta;
