package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
    @Id
    private int id;
    private String logradouro;
    private String endereco;
    private String cep;
    private String bairro;
    private String cidade;
    private String UF;
}
