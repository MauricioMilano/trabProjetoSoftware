package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.repository.CartaoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CartaoServico {
    private CartaoRepositorio cartaoRepositorio;

    public void contatarBandeira() {
        System.out.println("CartaoServico :: contatarBandeira");
    }
}
