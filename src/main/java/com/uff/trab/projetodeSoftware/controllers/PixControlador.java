package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.services.PixServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PixControlador {
    @PostMapping("/realizaPagamento")
    public void realizarPagamento() {
        System.out.println("PixControlador :: realizarPagamento");
        PixServico pixServico = new PixServico();
        pixServico.realizarPagamento();
    }
}
