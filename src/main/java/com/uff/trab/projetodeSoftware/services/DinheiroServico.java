package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Dinheiro;
import com.uff.trab.projetodeSoftware.repository.DinheiroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class DinheiroServico {

    private DinheiroRepositorio dinheiroRepositorio;

    public float calcularTroco(float valorRecebido) {
        System.out.println("DinheiroServico :: calcularTroco :: Entrou valorRecebido" + valorRecebido);

        this.dinheiroRepositorio = new DinheiroRepositorio();
        float troco = this.dinheiroRepositorio.calcularTroco(valorRecebido);
        return troco;
    }
}
