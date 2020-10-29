package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.services.DinheiroServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinheiroControlador {
    @PostMapping("/calculoTroco")
    public float calcularTroco(@RequestBody float valorRecebido){
        System.out.println("DinheiroControlador :: calcularTroco :: Entrou valorRecebido" + valorRecebido);
        DinheiroServico dinheiroServico = new DinheiroServico();
        float troco = dinheiroServico.calcularTroco(valorRecebido);
        return troco;
    }
}
