package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.repository.PixRepositorio;
import org.springframework.stereotype.Service;

@Service
public class PixServico {
    private PixRepositorio pixRepositorio;

    public void realizarPagamento() {
        System.out.println("PixServico :: realizarPagamento");
    }
}
