
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
valor_compra double,
situacao varchar(2)
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
INSERT INTO USUARIO(nome,username,senha) VALUE('fabio','fabio','123');
INSERT INTO USUARIO(nome,username,senha) VALUE('layssa','layssa','123');

INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('tony','none',null,425,35,'5555','rua',90,'sp','sp','bel',4855,'2019-01-01','pf');
INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('roberto','none',null,36971828810,449519935,'41353829','Marechal Roberto',90,'sp','sp','bel',06767080,'2019-01-01','pf');
INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('carlos','none',null,36971828811,449519936,'41353820','Marechal Roberto',89,'sp','sp','bel',06767080,'2019-01-01','pf');

INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('Livraria','Tades',36971828812,null,null,'41353822','Marechal Roberto',70,'sp','sp','bel',06767080,'2019-01-01','pj');
INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('Silvano','Marcearia',36971828813,null,null,'41353822','Marechal Roberto',70,'sp','sp','bel',06767080,'2019-01-01','pj');
INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('Segurancas','Seguro',36971828814,null,null,'41353822','Marechal Roberto',70,'sp','sp','bel',06767080,'2019-01-01','pj');
INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,cpf,rg,telefone,endereco,numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo)
VALUES('Belenzinho','Armas Belem',36971828815,null,null,'41353822','Marechal Roberto',70,'sp','sp','bel',06767080,'2019-01-01','pj');


INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('CORSA','CHEVROLET','2019','ROSA','BYH-5555',70000.00,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Uno','Fiat','2001','Preto','BYH-6666',10.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Ká','Ford','2019','Vermelho','BYH-7777',35.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Palio','Fiat','2016','Branco','BYH-8888',27.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Celta','CHEVROLET','2016','verde','BYH-9999',15.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Gol','wolksvagem','2008','branco','BYH-3333',7.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('Golf','wolksvagem','2017','preto','BYH-5555',70.000,'a');
INSERT INTO PRODUTO (modelo,marca,ano,cor,placa,valor_compra,situacao) 
VALUES ('CORSA','CHEVROLET','2019','ROSA','1',70000.00,'a');
select * from venda;

