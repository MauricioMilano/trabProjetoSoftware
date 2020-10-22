package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private int cpf;
    private int identidade;
    private String email;
    private Endereco endereco;
    private boolean prefencial;
    private int pontosAcumulados;
    private Date dataCadastro;

    public boolean ehPreferencial(){
        return this.prefencial;
    }
}