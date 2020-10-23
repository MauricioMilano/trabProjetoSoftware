create table produto (
    identificador integer identity primary key,
    nome varchar(30),
    preco float,
    codigo_barras integer,
    fornecedor varchar,
    quantidade integer
);