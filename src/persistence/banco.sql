mysql -u root -p


drop database if exists aula26;

create database aula26;

use aula26;

create table pessoa(
	idpessoa integer auto_increment primary key,
	nome varchar(40) not null,
	email varchar(50) not null,
	telefone varchar(20) not null,
	sexo char(1)
);

desc pessoa;