--drop table if exists ENDERECO; drop table if exists PACIENTE; create table if not exists PACIENTE(ID int auto_increment primary key,NOME varchar(255),SOBRENOME varchar(255),RG int,DATA varchar(255),ENDERECO varchar(255)); create table if not exists ENDERECO(ID_PACIENTE int,RUA varchar(255),NUMERO int,CIDADE varchar(55),BAIRRO varchar(255),foreign key (ID_PACIENTE) references PACIENTE(ID));

create table if not exists PACIENTE(ID int auto_increment primary key,NOME varchar(255),SOBRENOME varchar(255),RG int,DATA varchar(255)); create table if not exists ENDERECO(ID_PACIENTE int auto_increment,RUA varchar(255),NUMERO int,CIDADE varchar(55),BAIRRO varchar(255),foreign key (ID_PACIENTE) references PACIENTE(ID));