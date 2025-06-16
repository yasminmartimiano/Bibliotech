CREATE DATABASE catalogo;

USE DATABASE catalogo;

DROP DATABASE catalogo;
drop TABLE bibliotecario;
drop TABLE livro;

CREATE TABLE bibliotecario (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) ,
    email VARCHAR(200)
);

CREATE TABLE livro (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(200),
    autor VARCHAR(200),
    genero VARCHAR(200),
    status VARCHAR(200),
    data_cadastro DATE,
    Foreign Key (id) REFERENCES bibliotecario(id)
);