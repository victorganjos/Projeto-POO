drop database LOJACARROS;
CREATE DATABASE LOJACARROS;
USE LOJACARROS;

CREATE TABLE USUARIO(
id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
nome VARCHAR(80) NOT NULL,
username VARCHAR(50)NOT NULL UNIQUE,
senha VARCHAR(10)NOT NULL);

CREATE TABLE CLIENTE(
id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
nome VARCHAR(80),
nome_fantasia VARCHAR(80),
cnpj LONG,
cpf LONG,
rg LONG,
telefone VARCHAR(13),
endereco VARCHAR(80),
numero_residencia INT,
estado VARCHAR(30),
cidade VARCHAR(80),
bairro VARCHAR(80),
cep LONG,
data_nascimento DATE,
tipo VARCHAR(3));

CREATE TABLE PRODUTO(
id int primary key not null unique auto_increment,
modelo VARCHAR(80), 
marca VARCHAR(80), 
ano VARCHAR(80), 
cor VARCHAR(80), 
placa VARCHAR(80), 
valor_compra double
);

CREATE TABLE ITEMVENDA(
id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
fk_produto int,
valor_unitario double,
FOREIGN KEY (fk_produto) REFERENCES PRODUTO(id)
);

CREATE TABLE VENDA(
id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
fk_cliente int,
valor_total double,
data_venda date,
FOREIGN KEY (fk_cliente) REFERENCES CLIENTE(id)
);

CREATE TABLE PEDIDO(
id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
fk_venda int,
fk_itemvenda int,
FOREIGN KEY (fk_venda) REFERENCES VENDA(id),
FOREIGN KEY (fk_itemvenda) REFERENCES ITEMVENDA(id)
);

INSERT INTO USUARIO(nome,username,senha) VALUE('victor','victor','123');

INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('tony','none',null,425,35,'5555','rua',90,'sp','sp','bel',4855,'2019-01-01','pf');

INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra) 
VALUES ('CORSA','CHEVROLET','2019','ROSA','BYH-5555',70.000);

INSERT INTO ITEMVENDA(fk_produto,valor_unitario)
VALUES (1,30.000);

INSERT INTO VENDA (fk_cliente,valor_total,data_venda) 
VALUES (1,100,'2019-05-05');

INSERT INTO PEDIDO (fk_venda,fk_itemvenda) VALUES (1,1);

SELECT v.data_venda,c.cpf,p.modelo,v.valor_total FROM VENDA AS v
JOIN CLIENTE AS c ON v.fk_cliente = c.id
JOIN PEDIDO AS pe ON pe.fk_venda = pe.id
JOIN ITEMVENDA AS i ON pe.fk_itemvenda = i.id
JOIN PRODUTO AS p ON i.fk_produto = p.id;

