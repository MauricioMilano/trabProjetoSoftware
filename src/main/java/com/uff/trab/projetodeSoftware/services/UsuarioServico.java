package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Usuario;
import com.uff.trab.projetodeSoftware.repository.UsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {
    private final UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();

    public Usuario login(Usuario usuario) {
        Usuario usuarioRepo = usuarioRepositorio.pegaUsuarioRepo(usuario.pegaUsuario());
        System.out.println("UsuarioServico :: autenticaUsuario :: Tentando autenticar " + usuario.pegaUsuario());

        if (usuario.pegaSenha().equals(usuarioRepo.pegaSenha()))
            return usuario;
        return null;

    }

}
