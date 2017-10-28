/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-107
 * Created: 13-oct-2017
 */

create TABLE mensajito(id integer primary key auto_increment, titulo varchar(50),
cuerpo varchar(250));

select * from mensajito;

create TABLE usuario(cuenta integer primary key, nombre varchar(50),
mail varchar(150));

create TABLE direccion(id integer primary key auto_increment,cuenta integer,
FOREIGN KEY (cuenta) REFERENCES usuario(cuenta),
calle varchar(150),cp integer,municipio varchar(60));