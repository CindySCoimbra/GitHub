/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  coimb
 * Created: 4 de dez. de 2023
 */
-- COMANDO PARA CRIAR O BANCO
CREATE DATABASE fatec.

USE FATEC;

--COMANDO PARA CRIA TABELAS
CREATE TABLE CLIENTES(id_cliente INT PRIMARY KEY AUTO_INCREMENT,nm_cliente VARCHAR (255), NT_cliente VARCHAR(255), email__cliente VARCHAR(225), Ao_cliente VARCHAR (255), AD_cliente VARCHAR (255), DP_cliente VARCHAR (255), DR_cliente VARCHAR (255));

--DROP TABLE CLIENYE;

--COMANDO PARA INSERIR DADOS DE UMA DETEMINADA TABELA
INSERT INTO CLIENTES VALUES  (NULL, 'lari','11111111111','lari@gmail', 'aeroporto1','aeroporto2','1111111', '11111111');
--COMANDO PARA CONSULTAR DADOS DE UMA DETERMINADA TABELA
SELECT * FROM CLIENTES;


