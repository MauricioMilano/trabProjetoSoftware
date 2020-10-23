package com.uff.trab.projetodeSoftware.models;

import com.uff.trab.projetodeSoftware.repository.UsuarioRepositorio;
import com.uff.trab.projetodeSoftware.services.UsuarioServico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private int identificador;
    private final String usuario;
    private final String senha;
    private final String nome;

    public Usuario(String usuario, String senha, String nome, int identificador) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.identificador = identificador;

    }

    @Override
    public String toString() {
        return this.usuario;
    }

    public String pegaUsuario(){
        return this.usuario;
    }

    public String pegaSenha() {
        return this.senha;
    }
}
