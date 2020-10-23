package com.uff.trab.projetodeSoftware.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
//@AllArgsConstructor
@NoArgsConstructor
@Table("produto")
public class Produto {
    @Column("identificador")
    private Integer identificador;
    @Column("nome")
    private String nome;
    @Column("preco")
    private Float preco;
    @Column("codigo_barras")
    private Integer codigoDeBarras;
    @Column("fornecedor")
    private String fornecedor;
    @Column("quantidade")
    private Integer quantidade;

    public Produto(Integer identificador, String nome, Float preco,
                   Integer codigoDeBarras, String fornecedor, Integer quantidade) {
        this.identificador = identificador;
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public Produto create(Integer identificador, String nome, Float preco,
                                 Integer codigoDeBarras, String fornecedor, Integer quantidade) {
        return new Produto(identificador, nome, preco,
                codigoDeBarras, fornecedor, quantidade);
    }

    @Override
    public String toString() {
        return "Produto{id=" + identificador +
                ", nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                ", codigo_barras='" + codigoDeBarras + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", quantidade='" + quantidade + '}';
    }

    boolean verificarDisponibilidade(int quantidade) {
        if (quantidade > 0) return true;
        return false;
    }

}
