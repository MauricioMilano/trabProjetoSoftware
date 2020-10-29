package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.services.CartaoServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartaoControlador {
    @PostMapping("/contatoBandeira")
    public void contatarBandeira() {
        System.out.println("CartaoControlador :: contatarBandeira");
        CartaoServico cartaoServico = new CartaoServico();
        cartaoServico.contatarBandeira();
    }
}
