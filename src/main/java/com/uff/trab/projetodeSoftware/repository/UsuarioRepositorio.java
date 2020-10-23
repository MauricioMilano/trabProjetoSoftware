package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.models.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositorio {
    public Usuario pegaUsuarioRepo(String usuario){
        // código de chegar no banco
        System.out.println("UsuarioRepositorio :: autenticaUsuario :: Autenticado usuario " + usuario);
        return new Usuario("Bob", "123", "Roberto", 8080);
    }
}
