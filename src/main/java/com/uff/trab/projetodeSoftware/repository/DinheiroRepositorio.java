package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Dinheiro;
import org.springframework.stereotype.Repository;

@Repository
public class DinheiroRepositorio {
    public float calcularTroco(float valorRecebido) {
        // código de chegar no banco
        System.out.println("DinheiroRepositorio :: calcularTroco :: Entrou valorRecebido" + valorRecebido);
        return valorRecebido;
    }
}
