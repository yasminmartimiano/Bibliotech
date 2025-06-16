CREATE DATABASE catalogo;

USE catalogo;

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
    status ENUM('disponivel', 'emprestado', 'reservado'),
    data_cadastro DATE,
    id_bibliotecario BIGINT,
    FOREIGN KEY (id_bibliotecario) REFERENCES bibliotecario(id)
); 

